/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion_BD;

import java.sql.*;

/**
 *
 * @author jesuseduardo
 */
public class Conexion_BD {

    public static Connection getConexionMySQL() throws SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://mysql.hostinger.es:/u741493231_p3ns4", "u741493231_us3r1", "7895214");
            //con = DriverManager.getConnection("jdbc:mysql://mysql.hostinger.es:3306/u741493231_p3ns4", "u741493231_us3r1", "789521496lalo");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pensamientos", "root", "");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }

    //Conexion a SQL Server
    /*private static final  String ipAddress = "localhost";
    private static final String bdNombre = "pensamientos";
    private static final String usuario = "sa";
    private static final String contraseña = "root";
    private static final String puerto = "1433";

    public static Connection getConexionSQL() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //String url = "jdbc:sqlserver://" + ipAddress + ":" + puerto + ";databaseName=" + bdNombre; //Escuela
        String url = "jdbc:sqlserver://" + ipAddress + "\\SQLEXPRESS;databaseName=" + bdNombre; //Casa
        return DriverManager.getConnection(url, usuario, contraseña);
    }
     */
    public static void main(String[] args) throws SQLException {

        if (Conexion_BD.getConexionMySQL() != null) {
            System.out.println("Conexion MySQL lograda");
        }
    }

}
