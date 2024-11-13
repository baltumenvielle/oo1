package ar.edu.unlp.info.oo1.ej12_volumenYSuperficie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPrisma {
	private PrismaRectangular prisma;
	
	@BeforeEach
	void setUp() {
		prisma = new PrismaRectangular("metal", "blanco", 3, 2, 5);
	}
	
	@Test
	void testConstructor() {
		assertEquals("metal", prisma.getMaterial());
		assertEquals("blanco", prisma.getColor());
		assertEquals(3, prisma.getLadoMayor());
		assertEquals(2, prisma.getLadoMenor());
		assertEquals(5, prisma.getAltura());
	}
	
	void testVolumen() {
		assertEquals(30, prisma.getVolumen());
	}
	
	void testSuperficie() {
		assertEquals(62, prisma.getSuperficie());
	}
}
