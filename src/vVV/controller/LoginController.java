package vVV.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vVV.dao.DAOLogin;
import vVV.model.Login;


/**
 * Implementação da Servlet do Login
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DAOLogin DAOLogin;  
    
    public void init() {
    	DAOLogin = new DAOLogin();
    }
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// recebe oque ta sendo digitado pelo usuario vindo la do front
		// Faz instancia de novos objetos e testa se ja existe com que tem lá no banco 
		// se não for encontrado retorna uma mensagem para a mesma tela login
		
		String mensagem;
		String email = request.getParameter("userName");
		String senha = request.getParameter("password");
		
		Login login = new Login();
		
		login.setEmail(email);
		login.setSenha(senha);
   
		if (DAOLogin.LoginValidar(login)) {
		     RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		     dispatcher.forward(request, response);
	     }
		 else
		 {
			 mensagem = "Conta não encontrado";
			 request.setAttribute("mensagem", mensagem);
		     RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
		     dispatcher.forward(request, response);
		 }
	  
	}

}
