package ar.edu.unlp.info.oo1.ej14_intervaloTiempo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	private DateLapseA fecha;
	private LocalDate from = LocalDate.of(2023, 7, 15);
	
	@BeforeEach
	void setUp() {
		fecha = new DateLapseA(from, LocalDate.now());
	}
	
	@Test
	void testConstructor() {
		assertEquals(from, fecha.getFrom());
		assertEquals(LocalDate.now(), fecha.getTo());
	}
	
	@Test
	void testSize() {
		assertEquals(475, fecha.sizeInDays());
	}
	
	@Test
	void testIncludes() {
		LocalDate date1 = LocalDate.of(2023, 10, 13);
		LocalDate date2 = LocalDate.of(2025, 1, 5);	
		assertTrue(fecha.includesDate(date1));
		assertFalse(fecha.includesDate(date2));
	}
}
