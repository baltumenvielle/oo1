package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {
	private Producto p;
	
	@BeforeEach
	void setUp() {
		p = new Producto("Pelota", "Niños", 5000, 13);
	}
	
	@Test
	void testConstructor() {
		assertEquals("Pelota", p.getNombre());
		assertEquals("Niños", p.getCategoria());
		assertEquals(5000, p.getPrecio());
		assertEquals(13, p.getStock());
	}
	
	@Test
	void testComprar() {
		assertTrue(p.comprarProducto(11));
		assertTrue(p.comprarProducto(2));
		assertFalse(p.comprarProducto(1));
	}
}
