package ar.edu.unlp.info.oo1.ej17_alquilerPropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservaTest {
	private Reserva reserva;
	private DateLapse periodo = new DateLapseA(LocalDate.now(), LocalDate.of(2024, 12, 1));
	
	@BeforeEach
	void setUp() {
		reserva = new Reserva(periodo, 46738108);
	}
	
	@Test
	void testConstructor() {
		assertEquals(46738108, reserva.getDNI());
		assertEquals(periodo, reserva.getPeriodo());
	}
}
