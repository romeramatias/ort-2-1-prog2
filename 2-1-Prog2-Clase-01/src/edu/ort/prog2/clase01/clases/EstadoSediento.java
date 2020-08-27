/** @author romeramatias 
 */
package edu.ort.prog2.clase01.clases;

public class EstadoSediento extends Estado{

	@Override
	public Estado comer() {
		System.out.println("No, gracias, tengo sed");
		return this;
	}

	@Override
	public Estado beber() {
		System.out.println("Graciaaaaaaaaaaas");
		return new EstadoFeliz();
	}

	@Override
	public Estado mimar() {
		System.out.println(":) tengo sed");
		return this;
	}

	@Override
	public void getNombre() {
		System.out.println("Sediento");
	}

}
