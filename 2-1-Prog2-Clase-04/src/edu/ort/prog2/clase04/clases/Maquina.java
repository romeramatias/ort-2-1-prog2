/** @author romeramatias 
 */
package edu.ort.prog2.clase04.clases;

public class Maquina {

	private Molde molde;

	public Juguete fabricar() {
		return molde.crear();
	}
	
	public Molde getMolde() {
		return molde;
	}

	public void setMolde(Molde molde) {
		this.molde = molde;
	}
	
	
	
}
