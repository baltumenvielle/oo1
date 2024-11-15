package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

public class Pedido {
	private FormasDePago formaPago;
	private FormasDeEnvio formaEnvio;
	private Producto producto;
	private int cantidad;
	
	public Pedido(FormasDePago formaPago, FormasDeEnvio formaEnvio, Producto producto, int cantidad) {
		if (producto.comprarProducto(cantidad)) {
			this.formaPago = formaPago;
			this.formaEnvio = formaEnvio;
			this.producto = producto;
			this.cantidad = cantidad;
		}
	}
	
	public Producto getProducto() {
		return this.producto;
	}
	
	public FormasDePago getFormaPago() {
		return this.formaPago;
	}

	public FormasDeEnvio getFormaEnvio() {
		return this.formaEnvio;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public double calcularCostoTotal() {
		return formaPago.precioFinal(producto.getPrecio()) + formaEnvio.costoEnvio() * cantidad;
	}
}
