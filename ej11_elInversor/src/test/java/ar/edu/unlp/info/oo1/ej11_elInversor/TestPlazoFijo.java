package ar.edu.unlp.info.oo1.ej11_elInversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPlazoFijo {
	
	private PlazoFijo plazoFijo;
	
	@BeforeEach
	void setUp() {
		plazoFijo = new PlazoFijo(4500, 15);
	}
	
	@Test
	void testConstructor() {
		assertEquals(LocalDate.now(), plazoFijo.getFechaDeConstitucion());
		assertEquals(4500, plazoFijo.getMontoDepositado());
		assertEquals(15, plazoFijo.getPorcentajeDeInteresDiario());
	}
	
	@Test
	void testCalcularValor() {
		assertEquals(4500, plazoFijo.calcularValor());
	}

}
