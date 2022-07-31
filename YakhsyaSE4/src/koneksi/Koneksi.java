/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yasa Kamil
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Koneksi {
    Connection koneksi;
    
    public static Connection Koneksi()throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/hotelreservation", "root", "");
            System.out.println("Koneksi Berhasil");
            return koneksi;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("Koneksi Tidak Berhasil");
            return null;
        }
    }
}
    

