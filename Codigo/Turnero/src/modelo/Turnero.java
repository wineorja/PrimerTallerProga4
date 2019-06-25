package modelo;

public class Turnero {
	
	private NodoTurnero inicio = null;
	private NodoTurnero ultimo = null;
	private int tamañoCola = 0;
	
	
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


	public int getTamañoCola() {
		return tamañoCola;
	}


	public void setTamañoCola(int tamañoCola) {
		this.tamañoCola = tamañoCola;
	}


	
	

}
