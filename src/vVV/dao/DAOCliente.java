package vVV.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import vVV.model.CadastroCliente;


public class DAOCliente {
    
    public void CadastroCliente(CadastroCliente cadastroCliente){
       
    	
        String sql = "INSERT INTO CadastroCliente VALUES (null,?,?,?,?,?,?,?)";
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
           pStatement.setString(6, cadastroCliente.getEmail());
           pStatement.setString(7, cadastroCliente.getSenha());
           pStatement.execute();
           System.out.println("Registrado Cliente com SUCESSO");
             

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

