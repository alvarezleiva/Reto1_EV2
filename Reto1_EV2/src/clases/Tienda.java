package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import funciones.Funciones;

public class Tienda {
	private int id;
	private String nombre;
	private Empleado gerente;
	private List<Producto> productos;
	public Tienda() {
		super();
		productos=new ArrayList<Producto>();
	}
	public Tienda(int id, String nombre, Empleado empleado, List<Producto> productos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.gerente = empleado;
		this.productos = productos;
		productos=new ArrayList<Producto>();
	}
	public void reponerProductos(int cantidad) {
		List<Integer> numerosRandom=Funciones.generarAleatoriosSinRepetir(1, cantidad, cantidad);
		Random r = new Random();
		for (int i = 0; i < cantidad; i++) {
			Producto producto = new Producto(i+1,"Producto "+numerosRandom.get(i),r.nextDouble(10,101));
			this.productos.add(producto);
		}
	}
	public void venderProducto(int id) {
		int i=0,j=0;
		for (Producto producto : productos) {
			if (producto.getId()==id) {
				j=i;
			}
			i++;
		}
		this.productos.remove(j);
		if (productos.size()<5) {
			reponerProductos(5);
		}
	}
	@Override
	public String toString() {
		return "Tienda [id=" + id + ", nombre=" + nombre + ", gerente=" + gerente + ", productos=" + productos + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Empleado getGerente() {
		return gerente;
	}
	public void setGerente(Empleado gerente) {
		this.gerente = gerente;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
