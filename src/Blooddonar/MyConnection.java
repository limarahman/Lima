package Blooddonar;


import java.sql.*;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PUJA BHOWMIK
 */
public class MyConnection {
    static Connection cn;
    public static Connection ConnectedDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/donar_information","root","");
            System.out.println("Connected!");
            return cn;
        }catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
