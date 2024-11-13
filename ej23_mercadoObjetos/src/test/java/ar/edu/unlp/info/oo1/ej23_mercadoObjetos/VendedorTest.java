package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VendedorTest {
	private Vendedor v;
	
	@BeforeEach
	void setUp() {
		v = new Vendedor("Baltazar", "Menvielle", "493 bis 2129");
	}
	
	@Test
	void testConstructor() {
		assertEquals("Baltazar", v.getNombre());
		assertEquals("Menvielle", v.getApellido());
		assertEquals("493 bis 2129", v.getDireccion());
		assertEquals(0, v.getProductos().size());
	}
	
	@Test
	void testAgregar() {
		assertEquals(0, v.getProductos().size());
		v.agregarProducto(null);
		assertEquals(1, v.getProductos().size());
	}
}
