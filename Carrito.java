package ar.edu.uno.progconobjetos1.carritodecompras.modulo;

import java.util.*	;

public class Carrito {
	//La clase carrito va a tener 4 variables: Su nombre, el costo total, la fecha actual y el array de items que tenga.
	private String nombreCarrito;
	private Double costoCarrito;
	private ArrayList<ItemCarrito> listaItems= new ArrayList<ItemCarrito>();

	//Constructor de la clase Carrito, solamente pide al cliente el nombre del carrito
	public Carrito(String nombre){
		this.setNombreCarrito(nombre);
	}
	//Metodos

	//Metodo para agregar items al carrito
	public void agregarItemCarrito(ItemCarrito item){
		listaItems.add(item);
	}
	//Metodo para eliminar el ultimo item del carrito
	public void eliminarItemCarrito(){
		listaItems.remove(listaItems.size());
	}
	public void eliminarItemCarrito(Integer a){
		listaItems.remove(a);
	}
	public void eliminarItemCarrito(ItemCarrito item){
		listaItems.remove(item);
	}
	

	//Getters y setters de la clase
	public String getNombreCarrito() {
		return nombreCarrito;
	}
	public void setNombreCarrito(String nombreCarrito) {
		this.nombreCarrito = nombreCarrito;
	}
	public void setCostoCarrito(Carrito carrito){
		this.costoCarrito = carrito.getCostoCarrito();

	}
	public Double getCostoCarrito(){
		Double sumaItems = 0.0;
		for(int i=0; i<listaItems.size(); i++){
			sumaItems += listaItems.get(i).getCostoItem();				
		}
		return sumaItems;
	}



}
