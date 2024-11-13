package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RetirarSucursalTest {
	private RetirarSucursal r;
	
	@BeforeEach
	void setUp() {
		r = new RetirarSucursal();
	}
	
	@Test
	void testCosto() {
		assertEquals(3000, r.costoEnvio());
	}
}
