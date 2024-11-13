package ar.edu.unlp.info.oo1.ej13_clienteCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
	private Email email;
	
	@BeforeEach
	void setUp() {
		email = new Email("bsdf", "sssa");
	}
	
	@Test
	void testConstructor() {
		assertEquals("bsdf", email.getTitulo());
		assertEquals("sssa", email.getCuerpo());
		assertEquals(0, email.adjuntos().size());
	}
	
	@Test
	void testContiene() {
		assertTrue(email.contiene("ss"));
	}
	
	@Test
	void testTamaño() {
		assertEquals(8, email.tamaño());
	}
	
	@Test
	void testAdjuntar() {
		assertEquals(0, email.adjuntos().size());
		email.adjuntarArchivo(null);
		assertEquals(1, email.adjuntos().size());
	}
}
