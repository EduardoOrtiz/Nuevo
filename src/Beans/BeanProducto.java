/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author jesuseduardo
 */
public class BeanProducto {

    int id;
    String codigo;
    String nombre;
    String descripcion;
    float precio_compra;
    float precio_venta;
    int existencias;
    String proveedor;
    String marca;
    String codigo_tienda;

    public BeanProducto(String codigo, String nombre, String descripcion, float precio_compra, float precio_venta, int existencias, String proveedor, String marca, String codigo_tienda) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.existencias = existencias;
        this.proveedor = proveedor;
        this.marca = marca;
        this.codigo_tienda = codigo_tienda;
    }

    public BeanProducto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo_tienda() {
        return codigo_tienda;
    }

    public void setCodigo_tienda(String codigo_tienda) {
        this.codigo_tienda = codigo_tienda;
    }
}
