package ar.edu.unlp.info.oo1.ej13_clienteCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
	private ClienteDeCorreo cliente;
	
	@BeforeEach
	void setUp() {
		cliente = new ClienteDeCorreo();
	}
	
	@Test
	void testConstructor() {
		assertEquals(0, cliente.getCarpetas().size());
		assertEquals("inbox", cliente.getInbox().getNombre());
	}
	
	@Test
	void testRecibir() {
		assertEquals(0, cliente.getInbox().tamaño());
		Email email = new Email("ss", "s");
		cliente.recibir(email);
		assertEquals(3, cliente.getInbox().tamaño());
	}
	
	@Test
	void testBuscar() {
		Email e1 = new Email("anecdota fede", "no sabes lo que paso wach");
		Email e2 = new Email("no se que de cirte", "cortamos...");
		cliente.crearCarpeta("ad");
		Carpeta c = cliente.getCarpeta("ad");
		c.agregarEmail(e1);
		c.agregarEmail(e2);
		c.agregarEmail(e2);
		assertEquals(e2, cliente.buscar("cort"));
		assertNull(cliente.buscar("x"));
	}
	
	@Test
	void testEspacio() {
		assertEquals(0, cliente.espacioOcupado());
	}
}
