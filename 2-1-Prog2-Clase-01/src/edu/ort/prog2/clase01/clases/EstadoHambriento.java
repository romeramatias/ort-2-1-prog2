/** @author romeramatias 
 */
package edu.ort.prog2.clase01.clases;

public class EstadoHambriento extends Estado{
	
	@Override
	public Estado comer() {
		System.out.println("Que rico, tenia hambre, gracias!");
		return new EstadoFeliz();
	}

	@Override
	public Estado beber() {
		System.out.println("No tengo sed, tengo hambre");
		return this;
	}

	@Override
	public Estado mimar() {
		System.out.println("Gracias por los mimos, sigo con hambre");
		return this;
	}

	@Override
	public void getNombre() {
		System.out.println("Hambriento");
	}

}
