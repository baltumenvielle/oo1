package ar.edu.unlp.info.oo1.ej24_poolCar;

public abstract class Usuario {
	private String nombre;
	protected double saldo;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void  cargarSaldo(double monto) {
		this.saldo += monto - this.calcularComision(monto);
	}
	
	public abstract void descontarSaldo(double costo);
	public abstract double calcularComision(double monto);
}
