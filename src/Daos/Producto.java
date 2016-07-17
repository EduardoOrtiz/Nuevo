/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Beans.BeanProducto;
import Conexion_BD.Conexion_BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesuseduardo
 */
public class Producto {

    Connection conexion;

    public Producto() {
        try {
            conexion = Conexion_BD.getConexionMySQL();
        } catch (Exception e) {
        }
    }

    public boolean registrarProducto(BeanProducto Bean) {
        String sql = "INSERT INTO PRODUCTO(codigo,nombre,descripcion,precio_compra,precio_venta,existencia,proveedor,marca) values(?,?,?,?,?,?,?,?);";
        try {
            conexion = Conexion_BD.getConexionMySQL();

            // conexion = ConexionBD.getBdConexion();
            PreparedStatement stm = conexion.prepareStatement(sql);

            stm.setString(1, Bean.getCodigo());
            stm.setString(2, Bean.getNombre());
            stm.setString(3, Bean.getDescripcion());
            stm.setFloat(4, Bean.getPrecio_compra());
            stm.setFloat(5, Bean.getPrecio_venta());
            stm.setInt(6, Bean.getExistencias());
            stm.setString(7, Bean.getProveedor());
            stm.setString(8, Bean.getMarca());

            if (stm.executeUpdate() == 1) { //verifica que sea true
                stm.close();
                conexion.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<BeanProducto> consultareProductos() {
        List productos = new ArrayList();
        ResultSet rs = null;
        PreparedStatement stm = null;
        String sql = "SELECT * FROM PRODUCTO;";
        try {
            conexion = Conexion_BD.getConexionMySQL();

            // conexion = ConexionBD.getBdConexion(); //Conexion SQL Server
            stm = conexion.prepareStatement(sql); //Conexion MySQL
            rs = stm.executeQuery();
            while (rs.next()) {
                BeanProducto bean = new BeanProducto();

                bean.setId(rs.getInt(1));
                bean.setCodigo(rs.getString(2));
                bean.setNombre(rs.getString(3));
                bean.setDescripcion(rs.getString(4));
                bean.setPrecio_compra(rs.getFloat(5));
                bean.setPrecio_venta(rs.getFloat(6));
                bean.setExistencias(rs.getInt(7));
                bean.setProveedor(rs.getString(8));
                bean.setMarca(rs.getString(9));

                productos.add(bean);

            }
            stm.close();
            conexion.close();

        } catch (Exception e) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, e);
        }

        return productos;
    }

    public boolean modificarExistencia(int id) {
        String sql = "UPDATE PRODUCTO set existencia=existencia-1 WHERE id=?;";
        try {
            
            //conexion = ConexionBD.getBdConexion();
            conexion = Conexion_BD.getConexionMySQL();

            PreparedStatement stm = conexion.prepareStatement(sql);

            stm.setInt(1, id);
            if (stm.executeUpdate() == 1) {
                stm.close();
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean modificarProducto(BeanProducto bean) {

        String sql = "UPDATE PRODUCTO set codigo=?, nombre=?, descripcion=?,precio_compra=?,precio_venta=?,existencia=?,proveedor=?,marca=? WHERE id=?;";

        try (PreparedStatement stm = conexion.prepareStatement(sql)) {
            stm.setString(1, bean.getCodigo());
            stm.setString(2, bean.getNombre());
            stm.setString(3, bean.getDescripcion());
            stm.setFloat(4, bean.getPrecio_compra());
            stm.setFloat(5, bean.getPrecio_venta());
            stm.setInt(6, bean.getExistencias());
            stm.setString(7, bean.getProveedor());
            stm.setString(8, bean.getMarca());
            stm.setInt(9, bean.getId());

            if (stm.executeUpdate() == 1) {
                stm.close();
                System.out.println("Entra true");
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Entra false");
        return false;
    }

    /*public boolean eliminarEditorial(BeanEditorial Bean) {

        String sql = "UPDATE Editorial set estado= ? where id_editorial= ?;";
        try (PreparedStatement stm = conexion.prepareStatement(sql)) {
            stm.setInt(1, Bean.getEstado());
            stm.setInt(2, Bean.getId_editorial());

            if (stm.executeUpdate() == 1) {
                stm.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoEditorial.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }*/
    public List<BeanProducto> consultareProductosNombre(String cadena) {
        List productos = new ArrayList();
        ResultSet rs = null;
        PreparedStatement stm = null;
        String sql = "SELECT * FROM PRODUCTO WHERE nombre LIKE '?'";
        try {
            //conexion = ConexionBD.getBdConexion();
            conexion = Conexion_BD.getConexionMySQL();

            stm = conexion.prepareStatement(sql);
            rs = stm.executeQuery();
            stm.setString(0, cadena);
            while (rs.next()) {
                BeanProducto bean = new BeanProducto();

                bean.setId(rs.getInt(1));
                bean.setCodigo(rs.getString(2));
                bean.setNombre(rs.getString(3));
                bean.setDescripcion(rs.getString(4));
                bean.setPrecio_compra(rs.getFloat(5));
                bean.setPrecio_venta(rs.getFloat(6));
                bean.setExistencias(rs.getInt(7));
                bean.setProveedor(rs.getString(8));
                bean.setMarca(rs.getString(9));

                productos.add(bean);

            }
            stm.close();
            conexion.close();

        } catch (Exception e) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, e);
        }

        return productos;
    }

}
