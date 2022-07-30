/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaVVv.DAO;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author filty
 */
public class ConnectionBD {
    
      
      public Connection getConnection(){
      
      Connection conn = null;
    
      
          try {
              Class.forName("com.mysql.jdbc.Driver");
          } catch (ClassNotFoundException e) {
          }
          
          try {
              conn = DriverManager.getConnection("jdbc:myql://localhost:3306/VaieVoltaViagens", "root", "Cefet123");
          } catch (Exception e) {
          }
       
      
      return conn;
      }
      
}
