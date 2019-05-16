package importandoClaseTurnerotests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import importandoClaseTurnero.Persona;


public class TestsPersona {
	
	private static EntityManager manager;
	
	private static EntityManagerFactory emf;
	
	//@SuppressWarnings("unchecked")
	public static  void main(String[] args) {
		/* CREAR EL GESTOR DE PERSISTENCIA (EM) */
		emf = Persistence.createEntityManagerFactory("claseTurnero");
		manager = emf.createEntityManager();
		
		/*List<Persona> personas = (List<Persona>) manager.createQuery("FROM Persona").getResultList();
		System.out.println("En eta base de datos hay "+ personas.size() + "personas." );*/
		
		Persona a = new Persona ("Alejandra", 001, "serivicio 1", 0);
		Persona b = new Persona ("Alejandro", 002, "serivicio 2", 1);
		Persona c = new Persona ("Willington", 003, "serivicio 1", 1);
		
		manager.getTransaction().begin();
		manager.persist(a);
		manager.persist(b);
		manager.persist(c);
		manager.getTransaction().commit();
		
		imprimirTodo();
		
	}
	@SuppressWarnings("unchecked")
	private static void imprimirTodo() {
		List<Persona> personas = (List<Persona>) manager.createQuery("FROM Persona").getResultList();
		System.out.println("En eta base de datos hay " + personas.size() + "personas." );
		for(Persona pers : personas) {
			System.out.println(pers.toString());
		}

	}

}
