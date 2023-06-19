package ar.edu.unlam.hechizos;

import static org.junit.Assert.*;
import org.junit.Test;

public class Test_hechizos {

	@Test
	public void queSePuedaAgregarUnHechizoAlLibro() throws HechizoNoEncontradoException {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus("expelliarmus");
		libro.agregarHechizo(desarme);
		assertEquals(desarme, libro.buscar("expelliarmus"));
	}

	@Test
	public void queNoSePuedaAgregarUnHechizoRepetidoAlLibro() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus("expelliarmus");
		Hechizo desarmeB = new Expelliarmus("expelliarmus");
		libro.agregarHechizo(desarme);
		libro.agregarHechizo(desarmeB);
		assertEquals((Integer) 1, libro.getCantidadDeHechizos());
	}
	
	@Test (expected = HechizoNoEncontradoException.class)
	public void queNoSePuedaUsarUnHechizoQueNoEsteEnElLibro() throws HechizoNoEncontradoException {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizable perro = new Animal();
		Hechizo achicar = new Expelliarmus("desarme");
		Hechizo hechizo = libro.buscar(achicar.getNombre());
		hechizo.aplicarHechizo(perro);
		
	}

	@Test
	public void verSiUnHechizableEstaHechizado() throws HechizoNoEncontradoException {
		LibroDeHechizos libro = new LibroDeHechizos();
		Expelliarmus desarme = new Expelliarmus("expelliarmus");
		Hechizable perro = new Animal();
		libro.agregarHechizo(desarme);
		Hechizo hechizo = libro.buscar("expelliarmus");
		hechizo.aplicarHechizo(perro);
		assertEquals("Me desarmaron", perro.getEstado());
	}

	@Test
	public void verSiUnHechizableCrece() throws HechizoNoEncontradoException {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar("enormuvus");
		Hechizable mesa = new Mueble();
		libro.agregarHechizo(crecer);
		Hechizo hechizo = libro.buscar("enormuvus");
		hechizo.aplicarHechizo(mesa);
		assertEquals("Ahora soy más grande", mesa.getEstado());
	}
	

}
