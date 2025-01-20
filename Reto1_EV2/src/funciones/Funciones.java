package funciones;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int e = dimeEntero("Introduce un número entero", sc);
		double d = dimeDouble("Introduce un número decimal", sc);
	}

	public static boolean esInt(String s) {

		try {
			int num = Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean esDouble(String s) {
		try {
			double num = Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				int n = Integer.parseInt(s);
				return n;
			} catch (Exception ex) {
				System.out.println("Introduce un nº correcto");
			}
		} while (true);

	}

	public static double dimeDouble(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				double n = Double.parseDouble(s);
				return n;
			} catch (Exception ex) {
				System.out.println("Introduce un nº decimal correcto");
			}
		} while (true);

	}

	public static LocalDate dimeFecha(String texto, Scanner sc) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				System.out.println(texto);
				String fecha = sc.nextLine();
				LocalDate ld = LocalDate.parse(fecha, formato);
				return ld;
			} catch (Exception e) {
				System.out.println("Fecha incorrecta");
			}
		} while (true);

	}

	public static String menorAlf(String[] array, String peque) {

		String menor = array[0];

		for (int i = 1; i < array.length - 1; i++) {

			if (array[i].compareTo(peque) > 0 && menor.compareTo(array[i]) > 0) {
				menor = array[i];
			}
		}
		return menor;
	}

	public static boolean esta(int n, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n)
				return true;
		}
		return false;
	}

	public static boolean esPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void MuestraListaInt(List<Integer> lista) {

		boolean primero = true;
		for (int i = 0; i < lista.size(); i++) {
			if (primero) {
				System.out.print(lista.get(i));
				primero = false;
			} else {
				System.out.print("," + lista.get(i));
			}
		}
	}
	
	public static Map<String,String> rellena(Scanner sc)
	{
		Map<String,String> map = new HashMap<String,String>();
		String clave="",nombre="";
		//pido 5 parejas de valores
		for(int i=1;i<4;i++)
		{
			do
			{
				System.out.println("Introduce una clave");
				 clave=sc.nextLine();
			}while(clave.length()!=3);
			do
			{
				System.out.println("Introduce el nombre"+i);
				nombre=sc.nextLine();
			}while(nombre.equals(""));
			map.put(clave, nombre);
		}
		return map;
	}
	public static void muestra(Map<String,String> map)
	{
		String clave=""; 
		//iteramos sus claves
		Iterator<String> claves = map.keySet().iterator(); 
		while(claves.hasNext())
		{ 
			clave = claves.next(); 
			System.out.println(clave + " - " + map.get(clave)); 
		} 
	}
}
