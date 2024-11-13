package ar.edu.unlp.info.oo1.ej11_elInversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInversionEnAcciones {
	
	private InversionEnAcciones inversion;
	
	@BeforeEach
	void setUp() {
		inversion = new InversionEnAcciones("MCU", 3, 4500);
	}
	
	@Test
	void testConstructor() {
		assertEquals("MCU", inversion.getNombre());
		assertEquals(3, inversion.getCantidad());
		assertEquals(4500, inversion.getValorUnitario());
	}
	
	@Test
	void testCalcularValor() {
		assertEquals(13500, inversion.calcularValor());
	}

}
