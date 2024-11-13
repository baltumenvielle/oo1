package ar.edu.unlp.info.oo1.ej19_servicioPaquetes;

public class ClienteCorporativo extends Cliente {
	private int CUIT;
	
	public ClienteCorporativo(String nombre, String direccion, int CUIT) {
		super(nombre, direccion);
		this.CUIT = CUIT;
	}
}
