package ar.edu.unlp.info.oo1.ej13_clienteCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {
	private Archivo archivo;
	
	@BeforeEach
	void setUp() {
		archivo = new Archivo("test");
	}
	
	@Test
	void testConstructor() {
		assertEquals("test", archivo.getNombre());
	}
	
	@Test
	void testTamaño() {
		assertEquals(4, archivo.tamaño());
	}
}
