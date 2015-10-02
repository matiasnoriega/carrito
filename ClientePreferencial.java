package ar.edu.uno.progconobjetos1.carritodecompras.modulo;

public class ClientePreferencial extends Cliente{
	private Double porcentajeDescuento;
	
	public ClientePreferencial(String nombre, String direccionEnvio, String direccionCobro, Tarjeta tarjeta, String email, Double porcentajeDescutitularento){
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
	
	
}

