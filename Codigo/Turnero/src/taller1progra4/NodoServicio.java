package taller1progra4;

public class NodoServicio {
	
	private NodoServicio siguiente;
	private Turnero colas;
	
	public NodoServicio() {
		
	}

	public NodoServicio getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoServicio siguiente) {
		this.siguiente = siguiente;
	}

	public Turnero getColas() {
		return colas;
	}

	public void setColas(Turnero colas) {
		this.colas = colas;
	}
	
	

}
