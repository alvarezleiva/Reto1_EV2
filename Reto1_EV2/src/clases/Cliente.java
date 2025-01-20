package clases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import funciones.Funciones;

public class Cliente {

	private String nombre;
	private Map <Tienda, List<Producto>> listaCompras;
	
	
	public Cliente() {
		this.listaCompras =  new HashMap <Tienda, List<Producto>> ();
	}


	public Cliente(String nombre) {
		this.nombre = nombre;
		this.listaCompras =  new HashMap <Tienda, List<Producto>> ();
	}
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Map<Tienda, List<Producto>> getListaCompras() {
		return listaCompras;
	}


	public void setListaCompras(Map<Tienda, List<Producto>> listaCompras) {
		this.listaCompras = listaCompras;
	}


	public void comprarProducto (int idTienda, Producto producto) {
		
		do {
			
			
		}while()
		
		
		
		
	}
	public double gastoTotal (List<Producto> listaCompras) {
		
		
		
		
		
		
	}
	
}
