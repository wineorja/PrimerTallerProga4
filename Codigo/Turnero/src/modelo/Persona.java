package modelo;

public class Persona {
	
	private String nombre;
	private int id;
	private String servicio;
	private int prioridad;
	
	public Persona(String nombre, int id, String servicio, int prioridad) {
		
		this.nombre = nombre;
		this.id = id;
		this.servicio = servicio;
		this.prioridad = prioridad;
		       
	}
	public Persona(String nombre2, int id2, boolean estado, int servicio1, int servicio2, int servicio3) {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	} 
	public void setId(int id) {
		this.id = id;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	

}
