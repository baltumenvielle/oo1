package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SeisCuotasTest {
	private SeisCuotas s;
	
	@BeforeEach
	void setUp() {
		s = new SeisCuotas();
	}
	
	@Test
	void testPrecio() {
		assertEquals(120, s.precioFinal(100));
	}
}
