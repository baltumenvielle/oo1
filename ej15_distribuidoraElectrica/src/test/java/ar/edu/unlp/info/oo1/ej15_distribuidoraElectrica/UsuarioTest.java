package ar.edu.unlp.info.oo1.ej15_distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario usuario;
	
	@BeforeEach
	void setUp() {
		usuario = new Usuario("Baltazar Menvielle", "493 bis 2129");
	}
	
	@Test
	void testConstructor() {
		assertEquals(0, usuario.getConsumos().size());
		assertEquals("Baltazar Menvielle", usuario.getNombre());
		assertEquals("493 bis 2129", usuario.getDomicilio());
	}
	
	@Test
	void testAgregarConsumo() {
		assertEquals(0, usuario.getConsumos().size());
		usuario.agregarConsumo(null);
		assertEquals(1, usuario.getConsumos().size());
	}
	
	@Test
	void testEmitirFactura() {
		usuario.agregarConsumo(new Consumo(6000, 5600));
		Factura f = usuario.emitirFactura(new CuadroTarifario(254));
		assertEquals(f.getUsuario(), usuario.getNombre());
		assertEquals(f.getFechaEmision(), LocalDate.now());
		assertEquals(f.getBonificacion(), 0);
		assertEquals(f.getMontoFinal(), 5600 * 254);
	}
}
