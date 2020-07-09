/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author altha
 */
public class DBConnection {
    public Connection open(){
        Connection con;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");            
            String url = "jdbc:mysql://localhost:3306/latihanjava";
            String user = "root";
            String pass = "";
            con = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Connected!");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }   
}
