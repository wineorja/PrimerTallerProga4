package modelo;

public class NodoAsesor {
	
	private NodoAsesor siguiente;
	private Persona asesor;
	private Turnero colas;
	private boolean estado;
	
	public NodoAsesor() {
		
	}
	
	public NodoAsesor(String nombre, int id, int servicio1, int servicio2, int servicio3) {
		this.asesor = new Persona(nombre, id, estado, servicio1, servicio2, servicio3);
	}

	public NodoAsesor getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoAsesor siguiente) {
		this.siguiente = siguiente;
	}

	public Persona getAsesor() {
		return asesor;
	}

	public void setAsesor(Persona asesor) {
		this.asesor = asesor;
	}

	public Turnero getColas() {
		return colas;
	}

	public void setColas(Turnero colas) {
		this.colas = colas;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
