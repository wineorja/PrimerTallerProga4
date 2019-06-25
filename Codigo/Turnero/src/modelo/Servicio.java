package modelo;

public class Servicio {
	
	private NodoServicio inicio;
	private NodoServicio ultimo;
	private String servicio1;
	private String servicio2;
	private String servicio3;
	private int tamaño = 0;
	
	public Servicio() {
		
	}
	
	public void crearServicios(String nombre) {
		NodoServicio nodo = new NodoServicio(nombre);
		if(this.inicio==null) {
			this.inicio=nodo;
			this.ultimo=nodo;
		}
		else {
			this.ultimo.setSiguiente(nodo);
			this.ultimo=nodo;
		}
		System.out.println("se ha creado el sevicio " + nombre);
		this.tamaño = this.tamaño + 1;
		System.out.println("la lista tiene " + this.tamaño + " servicios.");
	}
	
	

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public NodoServicio getInicio() {
		return inicio;
	}

	public void setInicio(NodoServicio inicio) {
		this.inicio = inicio;
	}

	public NodoServicio getUltimo() {
		return ultimo;
	}

	public void setUltimo(NodoServicio ultimo) {
		this.ultimo = ultimo;
	}

	public String getServicio1() {
		return servicio1;
	}

	public void setServicio1(String servicio1) {
		this.servicio1 = servicio1;
	}

	public String getServicio2() {
		return servicio2;
	}

	public void setServicio2(String servicio2) {
		this.servicio2 = servicio2;
	}

	public String getServicio3() {
		return servicio3;
	}

	public void setServicio3(String servicio3) {
		this.servicio3 = servicio3;
	}
	
	

}
