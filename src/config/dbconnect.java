/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class dbconnect {
    
    private Connection connect;

       // constructor to connect to our database
        public dbconnect(){
            try{
                connect = (Connection)  DriverManager.getConnection("jdbc:mysql://localhost:3306/christian", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
    
}
