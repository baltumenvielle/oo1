package ar.edu.unlp.info.oo1.ej13_clienteCorreo;

import java.util.List;
import java.util.LinkedList;

public class Email {
	private String titulo, cuerpo;
	private List<Archivo> archivos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.archivos = new LinkedList<Archivo>();
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public void adjuntarArchivo(Archivo archivo) {
		archivos.add(archivo);
	}
	
	public List<Archivo> adjuntos() {
		return this.archivos;
	}
	
	public boolean contiene(String texto) {
		return this.titulo.contains(texto) || this.cuerpo.contains(texto);
	}
	
	public int tamaño() {
		return this.titulo.length() + this.cuerpo.length() 
		+ archivos.stream()
		.mapToInt(adjunto -> adjunto.tamaño())
		.sum();
	}
}
