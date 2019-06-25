package modelo;

public class NodoServicio {
	
	private NodoServicio siguiente;
	private Turnero colas;
	private String nombre;
	
	public NodoServicio() {
		
	}
	
	public NodoServicio(String nombre) {
	//	super();
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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
