package modelo;

public class Turnero {
	
	private NodoTurnero inicio = null;
	private NodoTurnero ultimo = null;
	private int tama�oCola = 0;
	
	
	public Turnero() {
		
	}


	public NodoTurnero getInicio() {
		return inicio;
	}


	public void setInicio(NodoTurnero inicio) {
		this.inicio = inicio;
	}


	public NodoTurnero getUltimo() {
		return ultimo;
	}


	public void setUltimo(NodoTurnero ultimo) {
		this.ultimo = ultimo;
	}


	public int getTama�oCola() {
		return tama�oCola;
	}


	public void setTama�oCola(int tama�oCola) {
		this.tama�oCola = tama�oCola;
	}


	
	

}
