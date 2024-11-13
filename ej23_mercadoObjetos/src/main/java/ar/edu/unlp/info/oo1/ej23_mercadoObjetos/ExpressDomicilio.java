package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

public class ExpressDomicilio implements FormasDeEnvio {
	
	private String direccionCliente, direccionVendedor;
	
	public ExpressDomicilio(String direccionCliente, String direccionVendedor) {
		this.direccionCliente = direccionCliente;
		this.direccionVendedor = direccionVendedor;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public String getDireccionVendedor() {
		return direccionVendedor;
	}

	@Override
	public double costoEnvio() {
		return 0.5 * 100;
	}

}
