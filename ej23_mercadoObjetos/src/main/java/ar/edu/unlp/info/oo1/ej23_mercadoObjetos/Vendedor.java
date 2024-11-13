package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

import java.util.LinkedList;
import java.util.List;

public class Vendedor extends Persona {
	private List<Producto> productos;
	
	public Vendedor(String nombre, String apellido, String direccion) {
		super(nombre, apellido, direccion);
		productos = new LinkedList<Producto>();
	}
	
	public List<Producto> getProductos() {
		return this.productos;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
}
