/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Beans.BeanVenta;
import Conexion_BD.ConexionBD;
import Conexion_BD.MySQL_Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesuseduardo
 */
public class Venta {

    Connection conexion;

    public Venta() {
        try {
            conexion = MySQL_Conexion.getConexion();
            // conexion = ConexionBD.getBdConexion();
        } catch (Exception e) {
        }
    }

    public boolean registrarVenta(BeanVenta Bean) {
        String sql = "INSERT INTO VENTA(producto_id,fecha,unidades,total) values(?,?,?,?);";
        try {

            //conexion = ConexionBD.getBdConexion();
            conexion = MySQL_Conexion.getConexion();
            
            PreparedStatement stm = conexion.prepareStatement(sql);

            stm.setInt(1, Bean.getId_producto());
            stm.setString(2, Bean.getFecha());
            stm.setFloat(3, Bean.getUnidades());
            stm.setFloat(4, Bean.getTotal());

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

    public List<BeanVenta> consultarVentas() {
        //VerVentas vv=new VerVentas();
        List<BeanVenta> ventas = new ArrayList();
        ResultSet rs = null;
        PreparedStatement stm = null;
        String sql = "SELECT V.producto_id,P.nombre, COUNT(*)as UnidadesVendidas,V.fecha,P.precio_venta,P.precio_venta*COUNT(*) AS Total FROM PRODUCTO P JOIN VENTA V ON V.producto_id=P.id GROUP BY P.nombre,V.producto_id,V.fecha,V.total,P.precio_venta ORDER BY V.fecha;";// WHERE fecha='"+vv.obtenerFecha()+"';";
        try {
            //conexion = ConexionBD.getBdConexion();
            conexion = MySQL_Conexion.getConexion();
            stm = conexion.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                BeanVenta bean = new BeanVenta();
                bean.setId(rs.getInt(1));
                bean.setNombre(rs.getString(2));
                bean.setUnidades(rs.getInt(3));
                bean.setFecha(rs.getString(4));
                bean.setPrecio_venta(rs.getFloat(5));
                bean.setTotal(rs.getFloat(6));

                //System.out.println(bean.getId()+"   "+bean.getNombre()+"    "+bean.getFecha()+"    "+bean.getPrecio_venta()+"  "+bean.getUnidades()+"  "+bean.getTotal());
                ventas.add(bean);

            }
            stm.close();
            conexion.close();

        } catch (Exception e) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, e);
        }

        return ventas;
    }

    public List<BeanVenta> consultarVentasPorFecha(String fecha) {
        List<BeanVenta> ventas = new ArrayList();
        ResultSet rs = null;
        PreparedStatement stm = null;
        String sql = "SELECT V.producto_id,P.nombre, COUNT(*)as UnidadesVendidas,V.fecha,SUM(V.total),P.precio_venta FROM PRODUCTO P JOIN VENTA V ON V.producto_id=P.id GROUP BY P.nombre,V.producto_id,V.fecha,V.total,P.precio_venta HAVING V.fecha='" + fecha + "';";
        try {
            //conexion = ConexionBD.getBdConexion();
            conexion = MySQL_Conexion.getConexion();
            
            stm = conexion.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                BeanVenta bean = new BeanVenta();
                bean.setId(rs.getInt(1));
                bean.setNombre(rs.getString(2));
                bean.setUnidades(rs.getInt(3));
                bean.setFecha(rs.getString(4));
                bean.setTotal(rs.getFloat(5));
                bean.setPrecio_venta(rs.getFloat(6));

                //System.out.println(bean.getId()+"   "+bean.getNombre()+"    "+bean.getFecha()+"    "+bean.getPrecio_venta()+"  "+bean.getUnidades()+"  "+bean.getTotal());
                ventas.add(bean);

            }
            stm.close();
            conexion.close();

        } catch (Exception e) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, e);
        }

        return ventas;
    }

    public float consultarVentaTotalDelDia(String fecha) {
        Calendar c = new GregorianCalendar();
        //String fecha = c.get(Calendar.YEAR)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.DAY_OF_MONTH);

        float ventaTotal = 0;

        ResultSet rs = null;
        PreparedStatement stm = null;
        String sql = "SELECT SUM(total) AS Venta_Total_Dia FROM VENTA WHERE fecha='" + fecha + "';";
        try {
            //conexion = ConexionBD.getBdConexion();
            conexion = MySQL_Conexion.getConexion();

            stm = conexion.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                ventaTotal = rs.getFloat(1);
            }
            stm.close();
            conexion.close();

        } catch (Exception e) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, e);
        }

        return ventaTotal;
    }
}
