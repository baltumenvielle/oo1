package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.time.LocalDate;

public class Balanza {

	private int cantidadDeProductos;
	private double precioTotal, pesoTotal;
	
	public void ponerEnCero() {
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		cantidadDeProductos++;
		precioTotal += producto.getPrecio();
		pesoTotal += producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket();
		ticket.setCantidadDeProductos(cantidadDeProductos);
		ticket.setPrecioTotal(precioTotal);
		ticket.setPesoTotal(pesoTotal);
		ticket.setFecha(LocalDate.now());
		return ticket;
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}

}
