package ar.edu.unlp.info.oo1.ej12_volumenYSuperficie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestReporte {
	private ReporteDeConstruccion reporte;
	
	@BeforeEach
	void setUp() {
		reporte = new ReporteDeConstruccion();
	}
	
	@Test
	void testConstructor() {
		assertEquals(0, reporte.getPiezas().size());
	}
	
	@Test
	void testAgregar() {
		reporte.agregarPieza(null);
		assertEquals(1, reporte.getPiezas().size());
	}
	
	@Test
	void testVolumen() {
		PrismaRectangular prisma = new PrismaRectangular("metal", "blanco", 3, 2, 5);
		Esfera esfera = new Esfera("madera", "negro", 5);
		reporte.agregarPieza(prisma);
		reporte.agregarPieza(esfera);
		assertEquals(30, reporte.volumenDeMaterial("metal"));
	}
	
	@Test
	void testSuperficie() {
		PrismaRectangular prisma = new PrismaRectangular("metal", "blanco", 3, 2, 5);
		Esfera esfera = new Esfera("madera", "negro", 5);
		reporte.agregarPieza(prisma);
		reporte.agregarPieza(esfera);
		assertEquals(62, reporte.superficieDeColor("blanco"));
	}
}
