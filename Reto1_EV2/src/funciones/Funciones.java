package funciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Funciones {
	public static boolean esInt(String num) {
		try {
			Integer.parseInt(num);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean esDouble(String num) {
		try {
			Double.parseDouble(num);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static int dimeEntero(String texto, Scanner sc) {
		int num = 0;
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				num = Integer.parseInt(s);
				return num;
			} catch (Exception e) {
				System.out.println("Numero no valido");
			}
		} while (true);
	}

	public static double dimeDouble(String texto, Scanner sc) {
		double num = 0;
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				num = Double.parseDouble(s);
				return num;
			} catch (Exception e) {
				System.out.println("Numero no valido");
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

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i == 0 ? array[i] : ", " + array[i]);
		}
		System.out.println();
	}

	public static void displayArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i == 0 ? array[i] : ", " + array[i]);
		}
		System.out.println();
	}

	public static void displayArrayPares(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] % 2 == 0 ? array[i] + " " : "");
		}
		System.out.println();
	}

	public static String[] arrayString(Scanner sc, int arrayPos) {
		String[] array = new String[arrayPos];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLine();

		}
		return array;
	}

	public static String[] arraySplit(String texto, Scanner sc) {
		System.out.println(texto);
		String s = sc.nextLine();
		String array[] = s.split(" ");
		return array;
	}

	public static boolean buscarIguales(int[] array, int num) {
		boolean igual = false;
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				return true;

			}
		}
		return igual;

	}

	public static void muestraListaInt(List<Integer> listaNum) {
		boolean primero = true;
		for (Integer elementos : listaNum) {
			System.out.print(primero ? elementos : ", " + elementos);
			primero = false;
		}
		System.out.println();
	}

	public static void muestraListaString(List<String> listaS) {
		boolean primero = true;
		for (String elementos : listaS) {
			System.out.print(primero ? elementos : ", " + elementos);
			primero = false;
		}
		System.out.println();
	}

	public static void rellenoArrayRandom(int[] array, int min, int max, Random random) {
		for (int i = 0; i < array.length; i++) {
			array[i]=random.nextInt(min,max);
		}
	}
	public static void rellenoListaRandom(List<Integer> lista, int cantidad, int min, int max, Random random) {
		for (int i = 0; i < cantidad; i++) {
			lista.add(random.nextInt(min, max));
		}
	}
	public static boolean esPrimo(int num) {
		boolean primo=true;
		for (int i =2; i < num; i++) {
			if (num%i==0) {
				return false;
			}
		}
		return primo;
	}
	public static List<Integer> rellenoListaRandoms(int cantidad ,int min,int max) {
		Random r = new Random();
		List<Integer> list= new ArrayList<Integer>();
		for (int i = 0; i < cantidad; i++) {
			list.add(r.nextInt(min,max));
		}
		return list;
	}
	public static void mostrarMap(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+" - "+val);
			
		}
	}
	public static double redondeoDosDecimales(double num) {
		return Math.round(num*100)/100;
	}
	public static List<Integer> generarAleatoriosSinRepetir(int min,int max, int cantidad) {
		Random r = new Random();
		List<Integer> list= new ArrayList<Integer>();
		for (int i = 0; i < cantidad; i++) {
			boolean esta=false;
			int nr=r.nextInt(min,max);
			do {
				esta=false;
				nr=r.nextInt(min,max);
				for (Integer integer : list) {
					if (nr==integer) {
						esta=true;
						break;
					}
				}
			} while (esta);
			list.add(nr);
		}
		
		
		return list;
	}
}
