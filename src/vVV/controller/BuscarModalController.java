package vVV.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vVV.dao.DAOModal;
import vVV.model.Modal;

/**
 * Servlet implementation class BuscarModalController
 */
@WebServlet("/BuscarModalController")
public class BuscarModalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DAOModal DAOModal;  
    
    public void init() {
    	DAOModal = new DAOModal();
    }  
    
    // retira da uf os dois ultimos digitos retorna eles novamente para a servlet dopost (incompleto)
   
    public String ControllerUF(String uf) {
		
		return uf.substring(uf.length() - 2);
    	  	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// recebe do front os campos selecionados
		
		String ufo = request.getParameter("origem");
		String companhia = request.getParameter("companhia");
		String horaPartida = request.getParameter("horaPartida");
		String modalreceb = request.getParameter("modal");
		String ufd = request.getParameter("destino");
		
		// faz uma validação do da UF
		ControllerUF(ufo);
		
		
		 
		   // buscar no BD se há modal disponivel (incompleto)
		
		   if(modalreceb == "Aviao") {
			   ArrayList<Modal> modais = new DAOModal().BuscarAviao(ufo);
			   for(Modal modal : modais) 
			    if(modal.getQuatModal() != 0) 
					System.out.println("teste 1"+ modal.getQuatModal());
				else 
					System.out.println("teste 2"+ modal.getQuatModal());
		   } 
		   else if(modalreceb == "Onibus") {
			   ArrayList<Modal> modais = new DAOModal().BuscarOnibus(ufo);
			   for(Modal modal : modais) 
				    if(modal.getQuatModal() != 0) 
						System.out.println("teste 3"+ modal.getQuatModal());
					else 
						System.out.println("teste 4"+ modal.getQuatModal());
		
		   }
		
		
		
		
		
	
	
	}
}		
		
	
	


