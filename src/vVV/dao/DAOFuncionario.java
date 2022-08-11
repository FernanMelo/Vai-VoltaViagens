package vVV.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import vVV.model.CadastroFuncionario;

public class DAOFuncionario {

	public void CadastroFuncionario(CadastroFuncionario cadastroFuncionario){
       
    	
        String sql = "INSERT INTO CadastroFuncionario VALUES (null,?,?,?,?)";
        PreparedStatement pStatement = null;
        Connection conn = null;
        
        try {
           conn = new ConnectionBD().getConnection();
           pStatement = conn.prepareStatement(sql);
           pStatement.setString(1, cadastroFuncionario.getCargo());
           pStatement.setString(2, cadastroFuncionario.getNome());
           pStatement.setString(3, cadastroFuncionario.getEmail());
           pStatement.setString(4, cadastroFuncionario.getSenha());
           pStatement.execute();
           
           System.out.println("Registrado Funcionario com SUCESSO");
             

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

