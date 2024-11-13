package ar.edu.unlp.info.oo1.ej24_poolCar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasajeroTest {
	private Pasajero p;
	
	@BeforeEach
	void setUp() {
		p = new Pasajero("Baltazar", 2300);
	}
	
	@Test
	void testConstructor() {
		assertEquals("Baltazar", p.getNombre());
		assertEquals(2300, p.getSaldo());
		assertEquals(0, p.getViajes().size());
	}
}
