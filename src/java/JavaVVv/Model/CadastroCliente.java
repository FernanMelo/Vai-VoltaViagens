/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaVVv.Model;

import JavaVVv.DAO.DAOCliente;
import java.util.Date;


public class CadastroCliente {
    private int codCliente;
    private String Nome;
    private String endereco;
    private String CPF;
    private String telefone1;
    private String telefone2;
    
    public CadastroCliente(){
    
    }

    public CadastroCliente(String Nome, String endereco, String CPF, String telefone1, String telefone2) {
        this.Nome = Nome;
        this.endereco = endereco;
        this.CPF = CPF;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
    }
    
    public CadastroCliente(int codCliente, String Nome, String endereco, String CPF, String telefone1, String telefone2){
             this.codCliente = codCliente;
             this.Nome = Nome;
             this.endereco = endereco;
             this.CPF = CPF;
             this.telefone1 = telefone1;
             this.telefone2 = telefone2;
    
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

    public void setTelfone1(String telfone1) {
        this.telefone1 = telefone1;
    }
    
     public String getTelfone2() {
        return telefone2;
    }

    public void setTelfone2(String telfone2) {
        this.telefone2 = telefone2;
    }

   // public void salvarCliente(){
     //   new DAOCliente().CadastroCliente(this);
    //}

 
    
    
}
