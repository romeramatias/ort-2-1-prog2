/** @author romeramatias 
 */
package edu.ort.prog2.clase02.clases;

public class Empleado {

	private String fechaDeIngreso;
	private String nombre;
	private int cantHijos;
	private double sueldoAnual;
	private Categoria categoria;

	public Empleado(String fechaDeIngreso, String nombre, int cantHijos, double sueldoAnual, Categoria categoria) {
		super();
		this.fechaDeIngreso = fechaDeIngreso;
		this.nombre = nombre;
		this.cantHijos = cantHijos;
		this.sueldoAnual = sueldoAnual;
		this.setCategoria(categoria);
	}

	public double calcularSueldoAnual() {
		return this.categoria.calcularSueldo(this);
	}	
	
	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public double getSueldoAnual() {
		return sueldoAnual;
	}

	public void setSueldoAnual(double sueldoAnual) {
		this.sueldoAnual = sueldoAnual;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
