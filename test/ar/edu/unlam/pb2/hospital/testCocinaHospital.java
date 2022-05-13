package ar.edu.unlam.pb2.hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCocinaHospital {

	@Test
	public void testQueSePuedaCrearUnPlatoDeComida() {

		Cocina cocina=new Cocina("hospital Gutierrez");
		Ingrediente carne=new Ingrediente("carne",0.1,1.2);
		Ingrediente papas=new Ingrediente("papas",2.2,1.1);
		Plato carneConPapas=new Plato("carne con Papas", Coccion.HORNO);
		carneConPapas.agregarIngrediente(carne);
		carneConPapas.agregarIngrediente(papas);
		
		assertNotNull(carneConPapas.getIngredientes());
	
	}
	
	@Test
	public void testQueSePuedaAlimetentarUnPacienteHipertenso() {

		Cocina cocina=new Cocina("hospital Gutierrez");
		Paciente juan=new Hipertenso("Juan", 31981186);
		Ingrediente carne=new Ingrediente("carne",0.0,1.2);
		Ingrediente papas=new Ingrediente("papas",0.0,1.1);
		Plato carneConPapas=new Plato("carne con Papas", Coccion.HORNO);
		carneConPapas.agregarIngrediente(carne);
		carneConPapas.agregarIngrediente(papas);
		
		assertTrue(juan.alimentar(carneConPapas));
	
	}
	
	@Test
	public void testQueNOSePuedaAlimetentarUnPacienteHipertenso() {

		Cocina cocina=new Cocina("hospital Gutierrez");
		Paciente juan=new Hipertenso("Juan", 31981186);
		Ingrediente carne=new Ingrediente("carne",1.0,1.2);
		Ingrediente papas=new Ingrediente("papas",0.4,1.1);
		Plato carneConPapas=new Plato("carne con Papas", Coccion.HORNO);
		carneConPapas.agregarIngrediente(carne);
		carneConPapas.agregarIngrediente(papas);
		
		assertFalse(juan.alimentar(carneConPapas));
	
	}
	
	@Test
	public void testQueSePuedaAlimetentarUnPacienteDiabetico() {

		Cocina cocina=new Cocina("hospital Gutierrez");
		Paciente juan=new Diabetico("Juan", 31981186, TipoDiabetes.TIPO_1);
		Ingrediente carne=new Ingrediente("carne",1.0,0.0);
		Ingrediente papas=new Ingrediente("papas",0.4,0.0);
		Plato carneConPapas=new Plato("carne con Papas", Coccion.HORNO);
		carneConPapas.agregarIngrediente(carne);
		carneConPapas.agregarIngrediente(papas);
		
		assertTrue(juan.alimentar(carneConPapas));
		assertFalse(juan.aplicarInsulina());
	
	}
	
	@Test
	public void testQueNoSePuedaAlimetentarUnPacienteDiabetico() {

		Cocina cocina=new Cocina("hospital Gutierrez");
		Paciente juan=new Diabetico("Juan", 31981186,TipoDiabetes.TIPO_2);
		Ingrediente carne=new Ingrediente("carne",1.0,0.4);
		Ingrediente papas=new Ingrediente("papas",0.4,5.0);
		Plato carneConPapas=new Plato("carne con Papas", Coccion.HORNO);
		carneConPapas.agregarIngrediente(carne);
		carneConPapas.agregarIngrediente(papas);
		
		assertFalse(juan.alimentar(carneConPapas));
		assertTrue(juan.aplicarInsulina());
	
	}
	
	@Test
	public void testQueSePuedaAlimetentarUnPacienteOncologico() {

		Cocina cocina=new Cocina("hospital Gutierrez");
		Paciente juan=new Oncologico("Juan", 31981186);
		Ingrediente carne=new Ingrediente("carne",1.0,0.0);
		Ingrediente papas=new Ingrediente("papas",0.4,0.0);
		Plato carneConPapas=new Plato("carne con Papas", Coccion.HORNO);
		carneConPapas.agregarIngrediente(carne);
		carneConPapas.agregarIngrediente(papas);
		
		assertTrue(juan.alimentar(carneConPapas));
	
	}
	
	@Test
	public void testQueNoSePuedaAlimetentarUnPacienteOncologico() {

		Cocina cocina=new Cocina("hospital Gutierrez");
		Paciente juan=new Oncologico("Juan", 31981186);
		Ingrediente carne=new Ingrediente("carne",1.0,0.0);
		Ingrediente papas=new Ingrediente("papas",0.4,0.0);
		Plato carneConPapas=new Plato("carne con Papas", Coccion.SIN_COCION);
		carneConPapas.agregarIngrediente(carne);
		carneConPapas.agregarIngrediente(papas);
		
		assertFalse(juan.alimentar(carneConPapas));
	
	}
	
	@Test
	public void testQueNoSePuedaAlimetentarUnPacienteCeliaco() {

		Cocina cocina=new Cocina("hospital Gutierrez");
		Paciente juan=new Celiaco("Juan", 31981186);
		Ingrediente trigo=new Ingrediente("Trigo",1.0,0.0);// no diferencia entre mayusculas y minusculas
		Ingrediente ensalada=new Ingrediente("ensalada",0.4,0.0);
		Plato ensaldaConTrigo=new Plato("ensalada con trigo", Coccion.SIN_COCION);
		ensaldaConTrigo.agregarIngrediente(trigo);
		ensaldaConTrigo.agregarIngrediente(ensalada);
		
		assertFalse(juan.alimentar(ensaldaConTrigo));
	
	}
	
	

}
