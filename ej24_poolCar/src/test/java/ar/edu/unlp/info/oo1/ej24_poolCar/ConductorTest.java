package ar.edu.unlp.info.oo1.ej24_poolCar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConductorTest {
	private Conductor c;
	private Vehiculo v = new Vehiculo(c, "va", 4, 2005, 76000);
	
	@BeforeEach
	void setUp() {
		c = new Conductor("Baltazar", 2300, v);
	}
	
	@Test
	void testConstructor() {
		assertEquals("Baltazar", c.getNombre());
		assertEquals(2300, c.getSaldo());
		assertEquals(v, c.getVehiculo());
	}
	
	@Test
	void testBonificacion() {
		assertEquals(7600, c.calcularBonificacion());
	}
	
	@Test
	void testComision() {
		assertEquals(700, c.calcularComision(7000));
	}
}
