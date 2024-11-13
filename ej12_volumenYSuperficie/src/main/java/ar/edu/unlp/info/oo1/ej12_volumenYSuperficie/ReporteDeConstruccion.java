package ar.edu.unlp.info.oo1.ej12_volumenYSuperficie;

import java.util.List;
import java.util.LinkedList;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new LinkedList<Pieza>();
	}
	
	public List<Pieza> getPiezas() {
		return this.piezas;
	}
	
	public void agregarPieza(Pieza pieza) {
		piezas.add(pieza);
	}
	
	public double volumenDeMaterial(String material) {
		return piezas.stream()
				.filter(pieza -> pieza.getMaterial().equals(material))
				.mapToDouble(pieza -> pieza.getVolumen())
				.sum();
	}
	
	public double superficieDeColor(String color) {
		return piezas.stream()
				.filter(pieza -> pieza.getColor().equals(color))
				.mapToDouble(pieza -> pieza.getSuperficie())
				.sum();
	}
}
