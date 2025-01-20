package clases;

public class Empleado {

	private String nombre;
	private int anteguedad;
	private double sueldo;
	
	public Empleado() {
		
	}
	
	
	public Empleado(String nombre, int anteguedad, double sueldo) {
		super();
		this.nombre = nombre;
		this.anteguedad = anteguedad;
		this.sueldo = sueldo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getAnteguedad() {
		return anteguedad;
	}


	public void setAnteguedad(int anteguedad) {
		this.anteguedad = anteguedad;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	
	
}
