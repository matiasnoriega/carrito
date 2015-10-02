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
	public void agregarCarrito(Carrito nuevocarrito){
	listaCarritos.add(nuevocarrito);
	}
	
	
	public void comprar(Carrito carrito){	
		if(this.tarjeta.verificarTarjeta(carrito.getCostoCarrito())==true)
			System.out.println("Se han debitado $"+carrito.getCostoCarrito()+" de su tarjeta. Su compra ha sido realizada con exito!");
		else
			System.out.println("La operacion no pudo ser completada."+carrito.getCostoCarrito());
		
	}
	
}
