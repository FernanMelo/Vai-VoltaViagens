package vVV.testjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vVV.controller.CadastroClienteController;
import vVV.model.CadastroFuncionario;
import vVV.model.CadastroCliente;

class CadastroClienteControllerTest {

	@Test
	// teste em junit Unitario (INCOMPLETO)
	
	void testIsCPF() {
		fail("Not yet implemented");
	}

	@Test
	
	// teste em junit Unitario (INCOMPLETO)
	
	void testIsEmail() {
		CadastroCliente email = new CadastroCliente();
		
	    email.setEmail("teste@teste.com");
	    
	    
	    if (email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"))
	        System.out.println("Email correto");
	    else
	    	System.out.println("Email Invalido");
	    
	   }

}
