package clases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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


	public void comprarProducto (Tienda tienda,int idProducto) {	
		List<Producto> productos=new ArrayList<Producto>();
		for (Producto producto : tienda.getProductos()) {
			if (producto.getId()==idProducto) {
				productos.add(producto);
				break;
			}
		}
		this.listaCompras.put(tienda, productos);
		tienda.venderProducto(idProducto);
		
	}
	public double gastoTotal () {
		double total=0;
		for (Tienda tienda : listaCompras.keySet()) {
			for (Producto producto : tienda.getProductos()) {
				total+=producto.getPrecio();
			}
		}
		return total;
	}
	
}
