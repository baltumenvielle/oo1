package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExpressTest {
	private ExpressDomicilio e;
	
	@BeforeEach
	void setUp() {
		e = new ExpressDomicilio("493 bis 2129", "493 2061");
	}
	
	@Test
	void testConstructor() {
		assertEquals(e.getDireccionCliente(), "493 bis 2129");
		assertEquals(e.getDireccionVendedor(), "493 2061");
	}
	
	@Test
	void testCosto() {
		assertEquals(50, e.costoEnvio());
	}
}
