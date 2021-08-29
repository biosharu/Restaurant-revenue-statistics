/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DAO {

    public static Connection con;

    public DAO() {
        if (con == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUrl = "jdbc:sqlserver://localhost:1433;database=NhaHang;";
                String username = "sa";
                String password = "I3lade2020";
                con = DriverManager.getConnection(dbUrl, username, password);
                System.out.println("thanh cong ket noi");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

//    public DAO() {
//        if (con == null) {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String dbUrl = "jdbc:sqlserver://localhost:1433;database=NhaHang;";
//            String username = "sa";
//            String password = "I3lade2020";
//            try {
//                Class.forName(dbClass);
//                con = DriverManager.getConnection(dbUrl, "sa", "I3lade2020");
//                System.out.println("thanh cong");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
