package vVV.model;

import vVV.dao.DAOLogin;

 public class Login {
   
	private String email;
    private String senha;

    public Login(Login login){
        
    }
    
    public Login(){
        
    }
    
    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void salvarLogin(){
        new DAOLogin().Login(this);
    }
    
    public boolean LoginValidar(Login login) {
		return false;
	} 
   
}