package ar.edu.unlp.info.oo1.ej13_clienteCorreo;

import java.util.List;
import java.util.LinkedList;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("inbox");
		this.carpetas = new LinkedList<Carpeta>();
	}
	
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public List<Carpeta> getCarpetas() {
		return this.carpetas;
	}
	
	public Carpeta getCarpeta(String nombre) {
		return carpetas.stream()
				.filter(carpeta -> carpeta.es(nombre))
				.findFirst().orElse(null);
	}
	
	public void crearCarpeta(String nombre) {
		Carpeta c = new Carpeta(nombre);
		carpetas.add(c);
	}
	
	public Carpeta getInbox() {
		return this.inbox;
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream()
	            .flatMap(carpeta -> carpeta.getEmails().stream()
	                    .filter(email -> email.contiene(texto))
	            )
	            .findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream()
		.mapToInt(carpeta -> carpeta.tamaño())
		.sum();
	}
}
