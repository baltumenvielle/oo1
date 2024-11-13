package ar.edu.unlp.info.oo1.ej15_distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaTest {
	private Factura factura;
	
	@BeforeEach
	void setUp() {
		factura = new Factura("Baltazar Menvielle", 400, 6000);
	}
	
	@Test
	void testConstructor() {
		assertEquals("Baltazar Menvielle", factura.getUsuario());
		assertEquals(400, factura.getBonificacion());
		assertEquals(6000, factura.getMontoFinal());
		assertEquals(LocalDate.now(), factura.getFechaEmision());
	}
}
