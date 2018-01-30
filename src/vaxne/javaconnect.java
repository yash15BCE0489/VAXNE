/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaxne;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Yash Agarwal
 */

class javaconnect {
    
    Connection conn = null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaxne","root","Yash");
            //JOptionPane.showMessageDialog(null,"Connection Established");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
       
    }
    
}
