package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RetirarComercioTest {
	private RetirarComercio r;
	
	@BeforeEach
	void setUp() {
		r = new RetirarComercio();
	}
	
	@Test
	void testCosto() {
		assertEquals(0, r.costoEnvio());
	}
}
