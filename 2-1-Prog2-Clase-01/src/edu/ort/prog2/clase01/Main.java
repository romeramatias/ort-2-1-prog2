/** @author romeramatias 
 */
package edu.ort.prog2.clase01;

import edu.ort.prog2.clase01.clases.EstadoFeliz;
import edu.ort.prog2.clase01.clases.Tamagotchi;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creo un estado feliz para enviar al tamagotchi
		EstadoFeliz feliz = new EstadoFeliz();
		
		// Inicio mi mascota en estado feliz
		Tamagotchi mascota = new Tamagotchi(feliz, "Lolo");
		
		// Consultas y acciones
		mascota.getNombreEstado();
		mascota.beber();
		mascota.comer();
		mascota.mimar();
		mascota.pegar();
		
		mascota.getNombreEstado();
		mascota.mimar();
		
		mascota.getNombreEstado();
		
	}

}
