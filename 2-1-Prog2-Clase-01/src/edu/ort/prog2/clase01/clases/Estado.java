/** @author romeramatias 
 */
package edu.ort.prog2.clase01.clases;

public abstract class Estado {

	public abstract void getNombre();
	
	public abstract Estado comer();
	
	public abstract Estado beber();

	public abstract Estado mimar();

	public static Estado pegar() {
		System.out.println(":((");
		return new EstadoTriste();
	}

	
}
