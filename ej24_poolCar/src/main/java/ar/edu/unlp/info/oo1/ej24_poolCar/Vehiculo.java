package ar.edu.unlp.info.oo1.ej24_poolCar;

public class Vehiculo {
	private Conductor dueño;
	private String descripcion;
	private int capacidad, añoFabricacion;
	private double valorMercado;
	
	public Conductor getDueño() {
		return dueño;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public int getAñoFabricacion() {
		return añoFabricacion;
	}
	
	public double getValorMercado() {
		return valorMercado;
	}
	
}
