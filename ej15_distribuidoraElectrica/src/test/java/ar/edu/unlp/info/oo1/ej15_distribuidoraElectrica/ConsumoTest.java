package ar.edu.unlp.info.oo1.ej15_distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsumoTest {
	private Consumo consumo;
	
	@BeforeEach
	void setUp() {
		consumo = new Consumo(300, 4000);
	}
	
	@Test
	void testConstructor() {
		assertEquals(4000, consumo.getEnergiaActiva());
		assertEquals(300, consumo.getEnergiaReactiva());
	}
	
	@Test
	void testFPE() {
		assertEquals(0.9971993098884563, consumo.getFPE());
	}
}
