package vVV.model;

import java.util.ArrayList;

import vVV.dao.DAOModal;

public class Modal {

	

	private int  codModal;
	private int quatModal;
	private String ufOrigem;
	private String localPartida;

	
	public Modal() {
		
		
	}

	public Modal(String ufOrigem){
		
		this.ufOrigem = ufOrigem;
    }
	
	
	public Modal(int codModal, int quatModal, String ufOrigem, String ufPartida, String localPartida,
			String localChegada) {
		
		this.codModal = codModal;
		this.quatModal = quatModal;
		this.ufOrigem = ufOrigem;
		this.localPartida = localPartida;

	}
	
	public Modal(int quatModal, String ufOrigem, String ufPartida, String localPartida,
			String localChegada) {
		
		this.quatModal = quatModal;
		this.ufOrigem = ufOrigem;
		this.localPartida = localPartida;
	}
	
	
	
	public int getCodModal() {
		return codModal;
	}
	public void setCodModal(int codModal) {
		this.codModal = codModal;
	}
	public int getQuatModal() {
		return quatModal;
	}
	public int setQuatModal(int quatModal) {
		return this.quatModal = quatModal;
	}
	public String getUfOrigem() {
		return ufOrigem;
	}
	public void setUfOrigem(String ufOrigem) {
		this.ufOrigem = ufOrigem;
	}

   public String getLocalPartida() {
		return localPartida;
	}
	public void setLocalPartida(String localPartida) {
		this.localPartida = localPartida;
	}

	public ArrayList<Modal> BuscarAviao(String uf) {

		return new DAOModal().BuscarAviao(uf);
		
		
	}
	
}
