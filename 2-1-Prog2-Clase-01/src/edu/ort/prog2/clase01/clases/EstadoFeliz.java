/** @author romeramatias 
 */
package edu.ort.prog2.clase01.clases;

public class EstadoFeliz extends Estado{

	@Override
	public Estado comer() {
		System.out.println("No tengo hambre, gracias!");
		return this; // Devuelve su propia instancia, ya que no cambia de estado por este metodo
	}

	@Override
	public Estado beber() {
		System.out.println("No tengo sed, gracias!");
		return this;
	}

	@Override
	public Estado mimar() {
		System.out.println("Gracias por los mimos");
		return this;
	}

	@Override
	public void getNombre() {
		System.out.println("Feliz!");
	}

}
