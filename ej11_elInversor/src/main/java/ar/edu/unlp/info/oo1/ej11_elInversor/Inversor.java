package ar.edu.unlp.info.oo1.ej11_elInversor;

import java.util.List;
import java.util.LinkedList;

public class Inversor {
	
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		inversiones = new LinkedList<Inversion>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double valorActual() {
		return inversiones.stream()
				.mapToDouble(inversion -> inversion.calcularValor())
				.sum();
	}
	
	public void agregarInversion(Inversion inversion) {
		inversiones.add(inversion);
	}
	
	public List<Inversion> getInversiones() {
		return this.inversiones;
	}

}
