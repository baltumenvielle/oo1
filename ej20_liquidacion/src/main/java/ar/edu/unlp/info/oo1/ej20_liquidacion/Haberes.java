package ar.edu.unlp.info.oo1.ej20_liquidacion;

import java.util.List;

public class Haberes {
	List<Empleado> empleados;
	
	public Recibo generarRecibo(Empleado empleado) {
		return new Recibo(empleado.getNombre(), empleado.getApellido(), empleado.getCUIL(), empleado.getAntiguedad(), empleado.calcularMonto());
	}
}
