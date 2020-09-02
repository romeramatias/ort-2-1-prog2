/** @author romeramatias 
 */
package edu.ort.prog2.clase04.clases;

public class MoldeAvion extends Molde{

	@Override
	public Juguete crear() {
		// TODO Auto-generated method stub
		return new JugueteAvion();
	}

}
