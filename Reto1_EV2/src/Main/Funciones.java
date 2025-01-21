package Main;

import java.util.List;

import clases.Tienda;

public class Funciones {
	public static void verTiendas(List<Tienda> tiendas) {
		for (Tienda tienda : tiendas) {
			System.out.println(tienda.toString());
		}
	}
	
}
