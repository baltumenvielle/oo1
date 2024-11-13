package ar.edu.unlp.info.oo1.ej13_clienteCorreo;

import java.util.List;
import java.util.LinkedList;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new LinkedList<Email>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public void mover(Email email, Carpeta destino) {
		destino.agregarEmail(email);
	}
	
	public List<Email> getEmails() {
		return this.emails;
	}
	
	public boolean es(String nombre) {
		return this.nombre.equals(nombre);
	}
	
	public int tamaño() {
		return this.emails.stream()
		.mapToInt(email -> email.tamaño())
		.sum();
	}

}
