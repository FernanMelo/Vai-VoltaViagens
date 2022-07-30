/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaVVv.DAO;

import JavaVVv.Model.CadastroCliente;

import JavaVVv.DAO.ConnectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;



public class DAOCliente {
    /*
     public void CadastroCliente(CadastroCliente cadastroCliente){
             
         String sql = "INSERT INTO CadastroCliente VALUES (null,?,?,?,?,?,null,null)";
         PreparedStatement pStatement = null;
         Connection conn = null;
         
         try {
            conn = new ConnectionBD().getConnection();
            pStatement = conn.prepareStatement(sql);
            pStatement.setString(1, cadastroCliente.getNome());
            pStatement.setString(2, cadastroCliente.getEndereco());
            pStatement.setString(3, cadastroCliente.getCPF());
            pStatement.setString(4, cadastroCliente.getTelfone1());
            pStatement.setString(5, cadastroCliente.getTelfone2());
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
                    
             } catch (Exception e2) {
                       e2.printStackTrace();
             }
        
         }
     
     }
 */
}
