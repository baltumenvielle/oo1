package ar.edu.unlp.info.oo1.ej24_poolCar;

public abstract class Usuario {
	private String nombre;
	protected double saldo;
	
	public Usuario(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
 	
	public void cargarSaldo(double monto) {
		this.saldo += monto - this.calcularComision(monto);
	}
	
	public void descontarSaldo(double monto) {
		this.saldo -= monto - this.calcularBonificacion();
	}
	
	protected abstract double calcularBonificacion();
	protected abstract double calcularComision(double monto);
}
