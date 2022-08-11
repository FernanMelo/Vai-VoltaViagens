package vVV.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vVV.model.Modal;

public class DAOModal {

	
	
	public ArrayList<Modal> BuscarAviao(String uf){
		
		String sql = "SELECT * FROM aviao WHERE UF = ?";
		PreparedStatement pStatement = null;
        Connection conn = null;
        Modal modal = null;
        ArrayList<Modal> modais = null;
       
        try {
        	 conn = new ConnectionBD().getConnection();
        	 pStatement = conn.prepareStatement(sql);
        	 pStatement.setString(1, uf);
        	 ResultSet rs = pStatement.executeQuery();
        	  if(rs != null) {
        		  modais = new ArrayList<Modal>();
        		 while(rs.next()) {
           	     modal = new Modal();
           	     modal.setCodModal(rs.getInt("codAviao"));
           	     modal.setQuatModal(rs.getInt("quatAviao"));
           	     modal.setUfOrigem(rs.getString("UF"));
           	     modal.setLocalPartida(rs.getString("Aeroporto"));
        	     modais.add(modal);
        		 }
        		 }
       	 
        	
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
		return modais;
	
	
     }
  
	
	public ArrayList<Modal> BuscarOnibus(String uf){
		
		String sql = "SELECT * FROM onibus WHERE UF = ?";
		PreparedStatement pStatement = null;
        Connection conn = null;
        Modal modal = null;
        ArrayList<Modal> modais = null;
       
        try {
        	 conn = new ConnectionBD().getConnection();
        	 pStatement = conn.prepareStatement(sql);
        	 pStatement.setString(1, uf);
        	 ResultSet rs = pStatement.executeQuery();
        	  if(rs != null) {
        		  modais = new ArrayList<Modal>();
        		 while(rs.next()) {
           	     modal = new Modal();
           	     modal.setCodModal(rs.getInt("codOnibus"));
           	     modal.setQuatModal(rs.getInt("quatOnibus"));
           	     modal.setUfOrigem(rs.getString("UF"));
           	     modal.setLocalPartida(rs.getString("Rodoviaria"));
        	     modais.add(modal);
        		 }
        		 }
       	 
        	
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
		return modais;
	
	
}
}
	

		
	
	

