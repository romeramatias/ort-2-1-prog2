/** @author romeramatias 
 */
package edu.ort.prog2.clase02;

import edu.ort.prog2.clase02.clases.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Categoria a = new CategoriaTipoA();
		Categoria b = new CategoriaTipoB();
		Categoria c = new CategoriaTipoC();

		Empleado e = new Empleado("Hoy", "Matias", 0, 1000, c);
		
		System.out.println(e.calcularSueldoAnual());
	}

}
