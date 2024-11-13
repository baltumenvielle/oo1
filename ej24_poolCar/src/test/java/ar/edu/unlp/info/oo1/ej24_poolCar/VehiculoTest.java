package ar.edu.unlp.info.oo1.ej24_poolCar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehiculoTest {
	private Vehiculo v;
	private Conductor d = new Conductor("Baltazar", 500, v);
	
	@BeforeEach
	void setUp() {
		v = new Vehiculo(d, "va", 4, 2005, 76000);
	}
	
	@Test
	void testConstructor() {
		assertEquals(d, v.getDueño());
		assertEquals("va", v.getDescripcion());
		assertEquals(4, v.getCapacidad());
		assertEquals(2005, v.getAñoFabricacion());
		assertEquals(76000, v.getValorMercado());
	}
}