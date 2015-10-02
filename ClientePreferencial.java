package ar.edu.uno.progconobjetos1.carritodecompras.modulo;

public class ClientePreferencial extends Cliente{
	private Double porcentajeDescuento;
	
	public ClientePreferencial(String nombre, String direccionEnvio, String direccionCobro, String email,  Tarjeta tarjeta, Double porcentajeDescuento){
		super(nombre, direccionEnvio, direccionCobro, email, tarjeta);
		this.setPorcentajeDescuento(porcentajeDescuento);
	}
	
	//El porcentaje de descuento que setea es un double entre 0 y 1 que luego va a multiplicar al costo final del carrito, realizando el descuento que se haya ingresado (Por ejemplo "20.00")
	public void setPorcentajeDescuento(Double descuento){
		this.porcentajeDescuento=((100-descuento)/100);
	}
	public Double getPorcentajeDescuento(){
		return this.porcentajeDescuento;
	}
	
	public void comprar(Carrito carrito){
		
		if(this.getTarjeta().verificarTarjeta((carrito.getCostoCarrito())*(this.getPorcentajeDescuento()))==true)
			System.out.println("Se han debitado $"+carrito.getCostoCarrito()+" de su tarjeta. Su compra ha sido realizada con exito!");
		else
			System.out.println("La operacion no pudo ser completada."+carrito.getCostoCarrito());
		
	}
	
}
