/** @author romeramatias 
 */
package edu.ort.prog2.clase06.clases;

public class DoctorNutricionista extends Doctor{

	private MaquinaBalanza balanza;
	
	@Override
	public void recibirNotificacion() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the balanza
	 */
	public MaquinaBalanza getBalanza() {
		return balanza;
	}

	/**
	 * @param balanza the balanza to set
	 */
	public void setBalanza(MaquinaBalanza balanza) {
		this.balanza = balanza;
	}

	
	
}
