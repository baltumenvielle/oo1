package ar.edu.unlp.info.oo1.ej11_elInversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInversor {
	
	private Inversor inversor;
	
	@BeforeEach
	void setUp() {
		inversor = new Inversor("Baltazar");
	}
	
	@Test
	void testConstructor() {
		assertEquals("Baltazar", inversor.getNombre());
	}
	
	@Test
	void testAgregar() {
		assertEquals(0, inversor.getInversiones().size());
		inversor.agregarInversion(null);
		assertEquals(1, inversor.getInversiones().size());
	}
	
	@Test
	void testValorActual() {
		inversor.agregarInversion(new InversionEnAcciones("MCU", 3, 4500));
		inversor.agregarInversion(new PlazoFijo(4500, 15));
		assertEquals(18000, inversor.valorActual());
	}
}
