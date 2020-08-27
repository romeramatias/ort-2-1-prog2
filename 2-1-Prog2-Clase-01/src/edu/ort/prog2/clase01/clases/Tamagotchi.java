/** @author romeramatias 
 */
package edu.ort.prog2.clase01.clases;

public class Tamagotchi {

	private Estado estado;
	private String nombre;
	
	public Tamagotchi(Estado estado, String nombre) {
		super();
		this.estado = estado;
		this.nombre = nombre;
	}
	
	public void comer() {
		this.estado = this.estado.comer();
	}
	
	public void beber() {
		this.estado = this.estado.beber();
	}

	public void mimar() {
		this.estado = this.estado.mimar();
	}
	
	public void pegar() {
		this.estado = Estado.pegar();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void getNombreEstado() {
		this.estado.getNombre();;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
}
