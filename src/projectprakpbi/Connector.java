/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprakpbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class Connector {
    
    String DBurl = "jdbc:mysql://localhost/testing";
    String DBUsername = "root";
    String DBPassword = "";
    Connection koneksi;
    Statement statement;
    
    public Connector() {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                koneksi = (Connection) DriverManager.getConnection(DBurl, DBUsername, DBPassword);
                System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi Gagal");
        }
        
        
        
    }
    
    
    
}   
    
