package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlContadoTest {
	private AlContado a;
	
	@BeforeEach
	void setUp() {
		a = new AlContado();
	}
	
	@Test
	void testPrecioFinal() {
		assertEquals(23, a.precioFinal(23));
	}
}
