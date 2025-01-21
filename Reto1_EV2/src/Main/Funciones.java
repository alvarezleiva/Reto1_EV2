package Main;

import java.util.List;
import java.util.Scanner;

import clases.Tienda;

public class Funciones {
	public static void verTiendas(List<Tienda> tiendas) {
		for (Tienda tienda : tiendas) {
			System.out.println(tienda.toString());
		}
	}
	public static Tienda buscarTienda(List<Tienda> tiendas) {
		boolean esta=false;
		Tienda tienda2=null;
		Scanner sc = new Scanner(System.in);
		int idTienda=funciones.Funciones.dimeEntero("Dime id tienda", sc);
		for (Tienda tienda : tiendas) {
			if (tienda.getId()==idTienda) {
				esta=true;
				tienda2=tienda;
			}
		}
		while (!esta) {
			idTienda=funciones.Funciones.dimeEntero("ID incorrecto, dime id tienda", sc);
			for (Tienda tienda : tiendas) {
				if (tienda.getId()==idTienda) {
					esta=true;
					tienda2=tienda;
				}
			}
		}
		return tienda2;
	}
	
}
