/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.overtime.connection;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.overtime.controller.Home;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Hannah
 */

@ManagedBean(name="ConnDb")
@RequestScoped
public class ConnDb {

    public static void main(String[] args) throws Exception {

     Connection conn = connectToDB();
     

    }

        public ConnDb(){
    }
    
    public static Connection connectToDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/overtime?autoReconnect=true&useSSL=false", "root", "admin");
            
            
           return con;
//            if(!con.isClosed()){
//                System.err.println("Connection Successfull");
//                return con;
//            }else if(con!=null){
//                System.err.println("Connection Successfull");
//                return con;
//            }
//            else{
//                System.err.println("Something else");
//               return null;
//            }
        } 
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            Logger.getLogger(ConnDb.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error");
            ex.printStackTrace();
            return null;
        }   
      }
    
    public static String verifyUser(){
        String user, user1 = "'asaidoo'";
        //user = new Home().getUsername();
        PreparedStatement checkUser;
        try {
            
            Connection connection = connectToDB();
            if(connection != null){
                
                System.err.println("Connection Successfull!!!");
                  checkUser = (PreparedStatement) connection.prepareStatement("SELECT USERNAME FROM user_account WHERE USERNAME ='asaidoo'");
            
                 ResultSet rs = checkUser.executeQuery();
                 
                while(rs.next()) {
                     
                     user1 = rs.getString(1);
                     System.err.println("User ::: "+user1);
                    
                }
                return "response";
            }else{
                System.err.println("Connection failed!!!");
                return "index";
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(ConnDb.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error sql");
            ex.printStackTrace();
            return null;
        }
    }
    
}
