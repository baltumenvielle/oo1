package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

import java.util.LinkedList;
import java.util.List;

public class Cliente extends Persona {
	private List<Pedido> pedidos;
	
	public Cliente(String nombre, String apellido, String direccion) {
		super(nombre, apellido, direccion);
		pedidos = new LinkedList<Pedido>();
	}
	
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}
	
	public void agregarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public int productosPorCategoria(String categoria) {
		return (int) pedidos.stream()
					.filter(pedido -> pedido.getProducto().getCategoria().equals(categoria))
					.mapToInt(pedido -> pedido.getCantidad())
					.sum();
	}
}
