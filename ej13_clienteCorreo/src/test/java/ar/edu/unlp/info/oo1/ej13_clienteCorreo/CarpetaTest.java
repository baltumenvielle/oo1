package ar.edu.unlp.info.oo1.ej13_clienteCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	private Carpeta carpeta, otraCarpeta;
	
	@BeforeEach
	void setUp() {
		carpeta = new Carpeta("amigos");
		otraCarpeta = new Carpeta("otra");
	}
	
	@Test
	void testConstructor() {
		assertEquals("amigos", carpeta.getNombre());
		assertEquals(0, carpeta.getEmails().size());
	}
	
	@Test
	void testTamaño() {
		Email email = new Email("rrrr", "tt");
		carpeta.agregarEmail(email);
		carpeta.agregarEmail(email);
		assertEquals(12, carpeta.tamaño());
	}
	
	@Test
	void testAgregar() {
		Email email = new Email("rrrr", "tt");
		carpeta.agregarEmail(email);
		assertEquals(1, carpeta.getEmails().size());
	}
	
	@Test
	void testMover() {
		Email email = new Email("sdf", "aa");
		carpeta.mover(email, otraCarpeta);
		assertTrue(otraCarpeta.getEmails().contains(email));
	}
	
	@Test
	void testEs() {
		assertTrue(carpeta.es("amigos"));
		assertFalse(carpeta.es("s:"));
	}
}
