package Main;

import java.util.Scanner;

import funciones.Funciones;

public class Reto1_2ev {

	public static void main(String[] args) {


		
		Scanner sc = new Scanner(System.in);

		// Menú

		int opcion;

		do {
			System.out.println("1- Ver tiendas\n2- Comprar\n3- Mostrar Compras\n4- Realizar una queja\n5- Salir");
			opcion = Funciones.dimeEntero("---Introduce una opción---", sc);

			switch (opcion) {
			case 1:

				break;

			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:
				System.out.println("Saliendo del programa...");
			default:
				break;
			}

		} while (opcion != 5);
	}

}
