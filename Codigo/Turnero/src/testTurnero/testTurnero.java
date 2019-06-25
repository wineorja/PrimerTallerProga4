package testTurnero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Servicio;

class testTurnero {

	@Test
	void testCrearServicio() {
		Servicio prueba= new Servicio();
		prueba.crearServicios("willington");
		prueba.crearServicios("alejandro");
		assertEquals(prueba.getInicio().getNombre(),"willington");
		assertEquals(prueba.getUltimo().getNombre(),"alejandro");
		
	}

}
