/** @author romeramatias 
 */
package edu.ort.prog2.clase06.clases;

public class DoctorTraumatologo extends Doctor {

	private MaquinaTermometro termometro;
	
	@Override
	public void recibirNotificacion() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the termometro
	 */
	public MaquinaTermometro getTermometro() {
		return termometro;
	}

	/**
	 * @param termometro the termometro to set
	 */
	public void setTermometro(MaquinaTermometro termometro) {
		this.termometro = termometro;
	}

}
