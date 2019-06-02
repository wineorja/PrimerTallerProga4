package taller1progra4;

public class NodoTurnero {
	
	private NodoTurnero siguiente;
	private Persona cliente;
	
	
	public NodoTurnero() {
		
	}
	
	public NodoTurnero(String nombre, int id, String servicio, int prioridad) {
		this.cliente = new Persona(nombre, id, servicio, prioridad);
		
	}
	
	
	public NodoTurnero getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(NodoTurnero siguiente) {
		this.siguiente = siguiente;
	}


	public Persona getCliente() {
		return cliente;
	}


	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	

	
}
	