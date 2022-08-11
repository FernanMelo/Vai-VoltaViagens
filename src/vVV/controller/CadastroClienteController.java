package vVV.controller;

import java.io.IOException;
import java.util.InputMismatchException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vVV.dao.DAOLogin;
import vVV.model.CadastroCliente;
import vVV.model.Login;


// Implementação do Controller Cliente + Login dele junto com a DAO/MODEL 1° dia (7 HORAS TRABALHADAS) + 2° ( 9 HORAS TRABALHADAS)


@WebServlet("/CadastroClienteController")
public class CadastroClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private DAOLogin DAOLogin;  
    
    public void init() {
    	DAOLogin = new DAOLogin();
    }  
	public CadastroClienteController(){
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
	
	// Validação do cpf se for um cpf valido retorna verdadeiro
	  public static boolean isCPF(String CPF) {
	     
		  
	     
		  if (CPF.equals("00000000000") ||
	          CPF.equals("11111111111") ||
	          CPF.equals("22222222222") || CPF.equals("33333333333") ||
	          CPF.equals("44444444444") || CPF.equals("55555555555") ||
	          CPF.equals("66666666666") || CPF.equals("77777777777") ||
	          CPF.equals("88888888888") || CPF.equals("99999999999") ||
	          (CPF.length() != 11))
	          return false;

	      char dig10, dig11;
	      int sm, i, r, num, peso;

	      try {
	          sm = 0;
	          peso = 10;
	          for (i=0; i<9; i++) {
	     
	          num = (int)(CPF.charAt(i) - 48);
	          sm = sm + (num * peso);
	          peso = peso - 1;
	          }

	          r = 11 - (sm % 11);
	          if ((r == 10) || (r == 11))
	              dig10 = '0';
	          else dig10 = (char)(r + 48); 

	      
	          sm = 0;
	          peso = 11;
	          for(i=0; i<10; i++) {
	          num = (int)(CPF.charAt(i) - 48);
	          sm = sm + (num * peso);
	          peso = peso - 1;
	          }

	          r = 11 - (sm % 11);
	          if ((r == 10) || (r == 11))
	               dig11 = '0';
	          else dig11 = (char)(r + 48);

	          if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
	              return true;
	          else 
	             return false;
	              
	     } catch (InputMismatchException erro) {
	              return false;
	          }
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

	  @Override
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       this.doPost(request, response);
	  }


	  @Override
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	   request.setCharacterEncoding("UTF-8");
	   response.setContentType("text/html; charset=UTF-8");
	   
	// recebe oque ta sendo digitado pelo usuario vindo la do front
	  
	   String Nome = request.getParameter("nome");
	   String endereco = request.getParameter("endereco");
	   String telefone1 = request.getParameter("telefone1");
	   String telefone2 = request.getParameter("telefone2");
	   String email = request.getParameter("email");
	   String senha = request.getParameter("senha");
	   String CPF = request.getParameter("cpf");
	   String mensagem;
	  
	         // Testa se os campos estão nulos se estiver retorna mensagem "Um ou mais campos estão vazios"      
	        
	          if(request.getParameter("nome") != null && !request.getParameter("nome").isEmpty() 
	          && request.getParameter("endereco") != null && !request.getParameter("endereco").isEmpty()
	          && request.getParameter("telefone1") != null && !request.getParameter("telefone1").isEmpty()
	          && request.getParameter("telefone2") != null &&  !request.getParameter("telefone2").isEmpty()
	          && request.getParameter("email") != null && !request.getParameter("email").isEmpty()){  
	          
	        	 
	       // testa se o cadastro já existe e retona para mesma tela com a mensagem
	        	  
	       if (isCadastrado(email, senha, DAOLogin) == true) {
	      		   
	   			  mensagem = "Login já existente";
	   	          request.setAttribute("mensagem", mensagem);
	   	          RequestDispatcher dispatcher = request.getRequestDispatcher("CadastroCliente.jsp");
	   	          dispatcher.forward(request, response);
	   	      }
	   		   else {
	   			    // Se o cadastro não existe testa CPF, SENHA E O EMAIL se forem todos verdadeiros retorna uma mensagem e vai para
	   			    // tela de login envia para a Model se não retorna uma mensagem para algum erro para a mesma tela em um determinado campo 
	   			   
	   			   if(isCPF(CPF) == true && isPassword(senha) == true) {
	        		 if(isEmail(email) == true){
	        		  mensagem = "Registrado com sucesso";
	       	          request.setAttribute("mensagem", mensagem);
	       	          RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
	       	          dispatcher.forward(request, response);
	       	 
	       	           Login login = new Login(email, senha);
	       	           CadastroCliente cadastroCliente = new CadastroCliente(Nome, endereco, CPF, telefone1, telefone2, email, senha);

	       	           login.salvarLogin();
	        		   cadastroCliente.salvarCliente();
	        		 }
	        		 else{
	       	          mensagem = "Email Errado";
	       	          request.setAttribute("mensagem", mensagem);
	       	          RequestDispatcher dispatcher = request.getRequestDispatcher("CadastroCliente.jsp");
	       	          dispatcher.forward(request, response);}
	        	 }
	        	 
	        	 
	        	 else if (isCPF(CPF) == true && isPassword(senha) == false){
	       	          mensagem = "Senha Invalida";
	       	          request.setAttribute("mensagem", mensagem);
	       	          RequestDispatcher dispatcher = request.getRequestDispatcher("CadastroCliente.jsp");
	       	          dispatcher.forward(request, response); }
	       	     
	        	 
	        	 
	        	 else if (isCPF(CPF) == false && isPassword(senha) == true){
	       	          mensagem = "CPF invalido";
	       	          request.setAttribute("mensagem", mensagem);
	       	          RequestDispatcher dispatcher = request.getRequestDispatcher("CadastroCliente.jsp");
	       	          dispatcher.forward(request, response);}
	   		   }
	        }
	        else {
	          mensagem = "Um ou mais campos estão vazios";
  	          request.setAttribute("mensagem", mensagem);
  	          RequestDispatcher dispatcher = request.getRequestDispatcher("CadastroCliente.jsp");
  	          dispatcher.forward(request, response);}
	       }
	  
	 
	  @Override
	  public String getServletInfo() {
	      return "Short description";
	  }
	

	}
