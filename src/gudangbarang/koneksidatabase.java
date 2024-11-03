/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gudangbarang;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author admin
 */
public class koneksidatabase {
    public static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
        try{
            String a = "jdbc:mysql://localhost:3306/gudangg";
            String b = "root";
            String c = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(a, b, c); 
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
    System.out.println("SQL Error: " + e.getMessage());
    }
        return mysqlconfig;
    }
}
