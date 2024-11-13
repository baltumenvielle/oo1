package ar.edu.unlp.info.oo1.ej15_distribuidoraElectrica;

import java.util.List;
import java.util.LinkedList;

public class Usuario {
	private String nombre, domicilio;
	private List<Consumo> consumos;
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		consumos = new LinkedList<Consumo>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	public void agregarConsumo(Consumo consumo) {
		this.consumos.add(consumo);
	}
	
	public List<Consumo> getConsumos() {
		return this.consumos;
	}
	
	public Factura emitirFactura(CuadroTarifario tarifa) {
		Consumo consumo = this.consumos.remove(consumos.size()-1);
		double costoConsumo = consumo.getEnergiaActiva() * tarifa.getPrecioKWh();
		double bonificacion = 0;
		if (consumo.getFPE() > 0.8) bonificacion = costoConsumo / 100 * 10;
		return new Factura(this.getNombre(), bonificacion, (costoConsumo - bonificacion));
	}
}
