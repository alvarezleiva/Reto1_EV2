package reto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import clases.Empleado;

public class Main {
	public static void main(String[] args) {
		
		Random r  = new Random();
		
		//Generando 20 empleados
		 List<Empleado> empleados = new ArrayList<>();
	        for (int i = 1; i < 21; i++) {
	        	 
	           Empleado e = new Empleado();
	           e.setNombre("Empleado "+ i);
	           e.setAnteguedad(r.nextInt(10,101));
	           empleados.add(e);
	        }

	}
}
