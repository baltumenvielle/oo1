package ar.edu.unlp.info.oo1.ej24_poolCar;

public class Vehiculo {
	private Conductor dueño;
	private String descripcion;
	private int capacidad, añoFabricacion;
	private double valorMercado;
	
	public Vehiculo(Conductor dueño, String descripcion, int capacidad, int añoFabricacion, double valorMercado) {
		this.dueño = dueño;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.añoFabricacion = añoFabricacion;
		this.valorMercado = valorMercado;
	}

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
