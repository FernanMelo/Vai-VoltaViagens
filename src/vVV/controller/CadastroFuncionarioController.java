package vVV.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vVV.dao.DAOLogin;
import vVV.model.CadastroFuncionario;
import vVV.model.Login;

//Implementação da Servlet Controller Funcionario + Login dele junto com a DAO/MODEL 3° dia (6 HORAS TRABALHADAS 20 min)


@WebServlet("/CadastroFuncionarioController")
public class CadastroFuncionarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DAOLogin DAOLogin;  
    
    public void init() {
    	DAOLogin = new DAOLogin();
    }
    
    public CadastroFuncionarioController() {
        super();
    }
    
   
 // Validação de cadastro (conectar a dao e retorna verdadeiro se existe registro)
    public static boolean isCadastrado(String email, String senha, DAOLogin DAOLogin){
		Login login = new Login();
		
		login.setEmail(email);
		login.setSenha(senha);

		if (DAOLogin.LoginValidar(login)) 
			  return true;
		    
		return false;
    
    }
  
 // Validação do email se for um email valido retorna verdadeiro
    public static boolean isEmail(String email){
        
        if (email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) 
		    return true;
         
        return false;
    }
 
   
 // Validação da senha se for um senha valida retorna verdadeiro
    public static boolean isPassword(String senha){
      
         if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%¨^¬&*+=])(?=\\S+$).{4,10}$"))
              return true;
         
         return false;  
   }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doPost(request, response);
	 
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   request.setCharacterEncoding("UTF-8");
		   response.setContentType("text/html; charset=UTF-8");
		   
		   // recebe oque ta sendo digitado pelo usuario vindo la do front
		   
		   String Nome = request.getParameter("nome");
		   String cargo = request.getParameter("cargo");
		   String email = request.getParameter("email");
		   String senha = request.getParameter("senha");
           String mensagem;
           
        // testa se o cadastro já existe e retona para mesma tela com a mensagem
		   if (isCadastrado(email, senha, DAOLogin) == true) {
		   
			  mensagem = "Login já existente";
	          request.setAttribute("mensagem", mensagem);
	          RequestDispatcher dispatcher = request.getRequestDispatcher("CadastroFuncionario.jsp");
	          dispatcher.forward(request, response);
	          }
		   
		   else {
			    // Se o cadastro não existe testaSENHA E O EMAIL se forem todos verdadeiros retorna uma mensagem e vai para
  			    // tela de principal e envia para a Model se não retorna uma mensagem para algum erro para a mesma tela em um 
			    // determinado campo
			   
			   if(isEmail(email) == true && isPassword(senha) == true) { 
				      if(request.getParameter("nome") != null && !request.getParameter("nome").isEmpty() 
					  && request.getParameter("cargo") != null && !request.getParameter("cargo").isEmpty()) {
				    	  
				    	  mensagem = "Registrado com sucesso";
		       	          request.setAttribute("mensagem", mensagem);
		       	          RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
		       	          dispatcher.forward(request, response);
		       	 
		       	          Login login = new Login(email, senha);
		       	          CadastroFuncionario cadastroFuncionario = new CadastroFuncionario(Nome, cargo, email, senha);

		       	          login.salvarLogin();
		        		  cadastroFuncionario.salvarFuncionario();
			  	       }
				      else{
				    	  mensagem = "Campos vazio";
				          request.setAttribute("mensagem", mensagem);
				          RequestDispatcher dispatcher = request.getRequestDispatcher("CadastroFuncionario.jsp");
				          dispatcher.forward(request, response);
				    	  }
				      }
		      else{
	       	       mensagem = "Email Errado ou Senha não Validada";
	       	       request.setAttribute("mensagem", mensagem);
	       	       RequestDispatcher dispatcher = request.getRequestDispatcher("CadastroFuncionario.jsp");
	       	       dispatcher.forward(request, response);
	       	     }
			    
		      }
	

}
}
