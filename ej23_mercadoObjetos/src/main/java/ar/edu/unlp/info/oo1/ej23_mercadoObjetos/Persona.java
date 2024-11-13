package ar.edu.unlp.info.oo1.ej23_mercadoObjetos;

public abstract class Persona {
	private String nombre, apellido, direccion;
	
	public Persona(String nombre, String apellido, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}
	
	
}
