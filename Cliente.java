package ar.edu.uno.progconobjetos1.carritodecompras.modulo;

import java.util.*;

public class Cliente {
	private String nombre;
	private String direccionEnvio;
	private String direccionCobro;
	private String email;
	private Tarjeta tarjeta;
	private ArrayList<Carrito> listaCarritos = new ArrayList<Carrito>();



	public Cliente(String nombre, String direccionEnvio, String direccionCobro, String email, Tarjeta tarjeta){
		this.setNombre(nombre);
		this.setDireccionEnvio(direccionEnvio);
		this.setDireccionCobro(direccionCobro);
		this.setEmail(email);
		this.setTarjeta(tarjeta);

	}
	//Getters y setters de la clase
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setDireccionEnvio(String direccionEnvio){
		this.direccionEnvio=direccionEnvio;
	}
	public String getDireccionEnvio(){
		return this.direccionEnvio;
	}
	public void setDireccionCobro(String direccionCobro){
		this.direccionCobro=direccionCobro;
	}
	public String getDireccionCobro(){
		return this.direccionCobro;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	//Metodo que genera un nuevo carrito en el cliente.
	public void agregarCarrito(Carrito carrito){
		this.listaCarritos.add(carrito);
	}
	//Metodo que remueve de la listaCarritos el carrito que le ordenemos.
	public void eliminarCarrito(Carrito carrito){
		this.listaCarritos.remove(carrito);
		System.out.println("Se elimino el carrito "+carrito.getNombreCarrito()+"!");
	}
	
	public String mostrarCarritos(){
		String mostrarCarritos = "\n";
		for(int i=0;i<listaCarritos.size();i++){
			mostrarCarritos+=listaCarritos.get(i).getNombreCarrito()+"\n";}
		return mostrarCarritos;
	}

	//El metodo compra el carrito que pidammos, y verifica primero que el carrito ya no haya sido comprado, y luego verifica si es posible realizar la compra con la tarjeta del cliente.
	
	public void comprar(Carrito carrito){
		if(carrito.getEstadoVendido()==false){
			if(this.tarjeta.verificarTarjeta(carrito.getCostoCarrito())==true){
				System.out.println("Felicidades "+this.getNombre()+", la compra de su carrito "+carrito.getNombreCarrito()+" ha sido realizada con exito!\nSe han debitado $"+carrito.getCostoCarrito()+" de su tarjeta.\n\nLos productos seran enviados a "+this.getDireccionEnvio()+"\n-------------------------------------------------------");
				carrito.setEstadoVendido(true);
			}
		}
		else
			System.out.println("El carrito ya fue comprado!");
	}

}
