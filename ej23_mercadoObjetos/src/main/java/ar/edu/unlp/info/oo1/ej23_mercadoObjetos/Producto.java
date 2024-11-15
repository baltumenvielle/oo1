package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

public class Producto {
	private String nombre, categoria;
	private double precio;
	private int stock;
	
	public Producto(String nombre, String categoria, double precio, int stock) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	private boolean verificarStock(int cantidad) {
		return cantidad <= stock;
	}
	
	public boolean comprarProducto(int cantidad) {
		if (this.verificarStock(cantidad)) {
			this.stock -= cantidad;
			return true;
		}
		return false;
	}
}
