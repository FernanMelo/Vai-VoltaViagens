/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaVVv.DAO;

import JavaVVv.Model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DAOLogin {
    
    
    public void Login(Login login){
    
             String sql = "INSERT INTO Login VALUES (?,?)";
             PreparedStatement pStatement  = null;
             Connection conn = null;
             
             
             try {
                  conn = new ConnectionBD().getConnection();
                  pStatement.setString(1, login.getEmail());
                  pStatement.setString(2, login.getSenha());
                  pStatement.execute();
            
             } catch (Exception e) {
                  e.printStackTrace();
            } finally{
                  
                 try {
                     if(pStatement != null)
                       pStatement.close();
                } catch (Exception e2) {
                       e2.printStackTrace();
                }
               
                  try {
                     if(conn != null)
                       conn.close();
                    
                }  catch (Exception e2) {
                     e2.printStackTrace();
                }
             }   
    }
            
            
            
}