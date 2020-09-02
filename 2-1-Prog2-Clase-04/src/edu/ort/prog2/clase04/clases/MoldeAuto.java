/** @author romeramatias 
 */
package edu.ort.prog2.clase04.clases;

public class MoldeAuto extends Molde{

	@Override
	public Juguete crear() {
		return new JugueteAuto();
	}

}
