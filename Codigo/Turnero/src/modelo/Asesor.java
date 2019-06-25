package modelo;

public class Asesor {
	
	private NodoAsesor inicio;
	private NodoAsesor ultimo;
	private int tamaño;
	
	public Asesor() {
		
	}

	public NodoAsesor getInicio() {
		return inicio;
	}

	public void setInicio(NodoAsesor inicio) {
		this.inicio = inicio;
	}

	public NodoAsesor getUltimo() {
		return ultimo;
	}

	public void setUltimo(NodoAsesor ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	

}
