package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

public class SeisCuotas implements FormasDePago {

	@Override
	public double precioFinal(double precio) {
		return precio + precio * 0.2;
	}

}
