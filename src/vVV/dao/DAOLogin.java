package vVV.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vVV.model.Login;


public class DAOLogin {
    
   
	public void Login(Login login){
    
             String sql = "INSERT INTO Login VALUES (?,?)";
             PreparedStatement pStatement = null;
             Connection conn = null;
             
             
              
             try {
                  conn = new ConnectionBD().getConnection();
                  pStatement = conn.prepareStatement(sql);
                  pStatement.setString(1, login.getEmail());
                  pStatement.setString(2, login.getSenha());
                  pStatement.execute();
                  
                  System.out.println("Registrado Login com SUCESSO");
            
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
            
    public boolean LoginValidar(Login login) {
    	String sql = "SELECT * FROM Login WHERE email = ? and senha = ?";
        PreparedStatement pStatement = null;
        Connection conn = null;	
        
        boolean status = false;
        
        try {
            conn = new ConnectionBD().getConnection();
            pStatement = conn.prepareStatement(sql);
            pStatement.setString(1, login.getEmail());
            pStatement.setString(2, login.getSenha());
            pStatement.execute();
            
            System.out.println(pStatement);
            ResultSet rs = pStatement.executeQuery();
            status = rs.next();
            
      
       } catch (SQLException e) {
            e.printStackTrace();
      } 
         
    	return status;
    }

	      
            
}
