/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Eduardo
 */
public class ConexionBD {
    private static final  String ipAddress = "localhost";
    private static final String bdNombre = "Pensamientos2";
    private static final String usuario = "sa";
    private static final String contraseña = "root";
    private static final String puerto = "1433";

    public static Connection getBdConexion() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //String url = "jdbc:sqlserver://" + ipAddress + ":" + puerto + ";databaseName=" + bdNombre; //Escuela
        String url = "jdbc:sqlserver://" + ipAddress + "\\SQLEXPRESS;databaseName=" + bdNombre; //Casa
        return DriverManager.getConnection(url, usuario, contraseña);
    }

    public static void main(String[] args) throws SQLException {
        Connection con = ConexionBD.getBdConexion();
        if (con != null) {
            System.out.println("Conexion exitosa");
        }
    }
}