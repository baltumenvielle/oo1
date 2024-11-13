package ar.edu.unlp.info.oo1.ej15_distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuadroTarifarioTest {
	private CuadroTarifario ct;
	
	@BeforeEach
	void setUp() {
		ct = new CuadroTarifario(230);
	}
	
	@Test
	void testConstructor() {
		assertEquals(230, ct.getPrecioKWh());
	}
}
