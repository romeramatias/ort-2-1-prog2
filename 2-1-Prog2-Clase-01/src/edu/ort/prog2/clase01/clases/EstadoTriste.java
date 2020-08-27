/** @author romeramatias 
 */
package edu.ort.prog2.clase01.clases;

public class EstadoTriste extends Estado{

	@Override
	public Estado comer() {
		System.out.println("No tengo hambre :(");
		return this;
	}

	@Override
	public Estado beber() {
		System.out.println("No tengo sed :(");
		return this;
	}

	@Override
	public Estado mimar() {
		System.out.println(":DDDDDDDDDDDDDDDDDD");
		return new EstadoFeliz();
	}

	@Override
	public void getNombre() {
		System.out.println("Triste");
	}


}
