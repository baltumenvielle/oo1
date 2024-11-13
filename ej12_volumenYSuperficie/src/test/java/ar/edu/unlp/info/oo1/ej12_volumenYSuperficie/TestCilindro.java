package ar.edu.unlp.info.oo1.ej12_volumenYSuperficie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCilindro {
	private Cilindro cilindro;
	
	@BeforeEach
	void setUp() {
		cilindro = new Cilindro("acero", "verde", 7, 9);
	}
	
	@Test
	void testConstructor() {
		assertEquals("acero", cilindro.getMaterial());
		assertEquals("verde", cilindro.getColor());
		assertEquals(7, cilindro.getRadio());
		assertEquals(9, cilindro.getAltura());
	}
	
	@Test
	void testVolumen() {
		assertEquals(1385.4423602330988181620257320263, cilindro.getVolumen());
	}
	
	@Test
	void testSuperficie() {
		assertEquals(703.71675440411368541563211785461, cilindro.getSuperficie());
	}
}
