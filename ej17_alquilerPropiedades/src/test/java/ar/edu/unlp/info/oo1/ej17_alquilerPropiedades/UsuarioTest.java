package ar.edu.unlp.info.oo1.ej17_alquilerPropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario usu;
	
	@BeforeEach
	void setUp() {
		usu = new Usuario("Baltazar Menvielle", "493 bis 2129", 46738108);
	}
	
	@Test
	void testConstructor() {
		assertEquals("Baltazar Menvielle", usu.getNombre());
		assertEquals("493 bis 2129", usu.getDireccion());
		assertEquals(46738108, usu.getDNI());
		assertEquals(0, usu.propiedades.size());
	}
	
	@Test
	void testDisponible() {
		assertTrue();
	}
}
