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
public class MySQL_Conexion {
    
    public static Connection getConexion() throws SQLException{
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3126230","sql3126230","rIELMAiYmS");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String[] args) throws SQLException{
        MySQL_Conexion msql=new MySQL_Conexion();
        Connection c=msql.getConexion();
        if (c!=null) {
            System.out.println("Conexion lograda");
        }
    }
    
}
