package reto;

import java.util.List;
import java.util.Random;

import clases.Cliente;
import clases.Empleado;
import clases.Tienda;

public class FuncionesGerman {

	public static void generadorTiendas(List<Empleado>empleados) {
		Random r = new Random();
		Empleado empleado = new Empleado();

		for (int i = 1; i < 6; i++) {
			Tienda tienda = new Tienda();
			tienda.setNombre("Tienda" + i);
			tienda.getId();
			tienda.setGerente(empleados.get(r.nextInt(1,empleados.size())));
			
			tienda.reponerProductos(r.nextInt(5,11));
			
		}
	}
	
	public static Cliente generarCliente() {
		Random r = new Random();
		Cliente cliente = new Cliente("Cliente " + r.nextInt(1,100));
		
		return cliente;
	}

}
