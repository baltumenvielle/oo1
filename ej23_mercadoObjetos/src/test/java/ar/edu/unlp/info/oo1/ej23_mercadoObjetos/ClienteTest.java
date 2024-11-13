package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
	private Cliente c;
	
	@BeforeEach
	void setUp() {
		c = new Cliente("Baltazar", "Menvielle", "493 bis 2129");
	}
	
	@Test
	void testConstructor() {
		assertEquals("Baltazar", c.getNombre());
		assertEquals("Menvielle", c.getApellido());
		assertEquals("493 bis 2129", c.getDireccion());
		assertEquals(0, c.getPedidos().size());
	}
	
	@Test
	void testAgregarPedido() {
		assertEquals(0, c.getPedidos().size());
		c.agregarPedido(null);
		assertEquals(1, c.getPedidos().size());
		c.agregarPedido(null);
		assertEquals(2, c.getPedidos().size());
	}
	
	@Test
	void testProductosPorCategoria() {
		assertEquals(0, c.productosPorCategoria("Electrodomésticos"));
		Producto p1 = new Producto(null, "Electrodomésticos", 0, 5000);
		Producto p2 = new Producto(null, "Electrodomésticos", 0, 200);
		c.agregarPedido(new Pedido(null, null, p1, 1));
		c.agregarPedido(new Pedido(null, null, p2, 2));
		assertEquals(3, c.productosPorCategoria("Electrodomésticos"));
	}
}
