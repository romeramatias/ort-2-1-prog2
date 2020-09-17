/** @author romeramatias 
 */
package edu.ort.prog2.clase06.clases;

public class DoctorCardiologo extends Doctor {

	private MaquinaTomadorDePulso tomadorDePulso;
	private MaquinaTermometro termometro;
	
	@Override
	public void recibirNotificacion() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the tomadorDePulso
	 */
	public MaquinaTomadorDePulso getTomadorDePulso() {
		return tomadorDePulso;
	}

	/**
	 * @param tomadorDePulso the tomadorDePulso to set
	 */
	public void setTomadorDePulso(MaquinaTomadorDePulso tomadorDePulso) {
		this.tomadorDePulso = tomadorDePulso;
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
