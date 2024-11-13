package ar.edu.unlp.info.oo1.ej12_volumenYSuperficie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEsfera {
	private Esfera esfera;
	
	@BeforeEach
	void setUp() {
		esfera = new Esfera("madera", "negro", 5);
	}
	
	@Test
	void testConstructor() {
		assertEquals("madera", esfera.getMaterial());
		assertEquals("negro", esfera.getColor());
		assertEquals(5, esfera.getRadio());
	}
	
	@Test
	void testVolumen() {
		assertEquals(523.5987755982989, esfera.getVolumen());
	}
	
	@Test
	void testSuperficie() {
		assertEquals(314.1592653589793, esfera.getSuperficie());
	}
}
