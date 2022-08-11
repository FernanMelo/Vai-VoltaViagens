package vVV.model;

import vVV.dao.DAOCliente;
import vVV.dao.DAOFuncionario;

public class CadastroFuncionario {
	private int codFuncionario;
    private String Nome;
    private String cargo;
    private String email;
    private String senha;
	
    public CadastroFuncionario(){
        
    }
   	      
    public CadastroFuncionario(String nome, String cargo, String email, String senha) {
	    this.Nome = nome;
		this.cargo = cargo;
		this.email = email;
		this.senha = senha;
	}
   
    public CadastroFuncionario(int codFuncionario, String nome, String cargo, String email, String senha) {
		this.setCodFuncionario(codFuncionario);
		this.Nome = nome;
		this.cargo = cargo;
		this.email = email;
		this.senha = senha;
	}


	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}
    
	public void salvarFuncionario(){
	    new DAOFuncionario().CadastroFuncionario(this);
	   }

}
