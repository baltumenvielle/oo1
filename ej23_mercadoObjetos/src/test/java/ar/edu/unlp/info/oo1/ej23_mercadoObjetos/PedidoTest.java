package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
	private Producto pr = new Producto("Pelota", "Niños", 5000, 13);
	private Pedido p;
	private AlContado a;
	private RetirarSucursal e;
	
	
	@BeforeEach
	void setUp() {
		a = new AlContado();
		e = new RetirarSucursal();
		p = new Pedido(a, e, pr, 2);
	}
	
	@Test
	void testConstructor() {
		assertEquals(a, p.getFormaPago());
		assertEquals(e, p.getFormaEnvio());
		assertEquals(pr, p.getProducto());
		assertEquals(2, p.getCantidad());
	}
	
	@Test
	void testCalcularCosto() {
		assertEquals(5000 + 3000, p.calcularCostoTotal());
	}
}
