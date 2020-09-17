/** @author romeramatias 
 */
package edu.ort.prog2.clase06.clases;

public abstract class Maquina {

	private Paciente paciente;
	
	public void notificar() {
		
	}
	
	public abstract void medir();

	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}

	/**
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
