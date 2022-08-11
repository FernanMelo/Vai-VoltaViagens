package vVV.model;

import vVV.dao.DAOCliente;


public class CadastroCliente {
    private int codCliente;
    private String Nome;
    private String endereco;
    private String CPF;
    private String telefone1;
    private String telefone2;
    private String email;
    private String senha;
    
    public CadastroCliente(){
    
    }

    public CadastroCliente(String Nome, String endereco, String CPF, String telefone1, String telefone2, String email, String senha) {
        this.Nome = Nome;
        this.endereco = endereco;
        this.CPF = CPF;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
        this.senha = senha;
    }
    
    public CadastroCliente(int codCliente, String Nome, String endereco, String CPF, String telefone1, String telefone2, String email, String senha){
             this.codCliente = codCliente;
             this.Nome = Nome;
             this.endereco = endereco;
             this.CPF = CPF;
             this.telefone1 = telefone1;
             this.telefone2 = telefone2;
             this.email = email;
             this.senha = senha;
    
    }
    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelfone1() {
        return telefone1;
    }

    public void setTelfone1(String telefone1) {
        this.telefone1 = telefone1;
    }
    
     public String getTelfone2() {
        return telefone2;
    }

    public void setTelfone2(String telefone2) {
        this.telefone2 = telefone2;
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

	public void salvarCliente(){
    new DAOCliente().CadastroCliente(this);
   }

	public boolean matches(String string) {
		// TODO Auto-generated method stub
		return false;
	}
 }
