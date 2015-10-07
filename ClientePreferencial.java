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
		if(carrito.getEstadoVendido()==false){
			if(this.getTarjeta().verificarTarjeta(carrito.getCostoCarrito()*getPorcentajeDescuento())==true){
				System.out.println("Felicidades "+this.getNombre()+", la compra de su carrito "+carrito.getNombreCarrito()+" ha sido realizada con exito!\nSu descuento ha sido del "+(100-(this.getPorcentajeDescuento()*100))+"% y se han debitado $"+carrito.getCostoCarrito()*getPorcentajeDescuento()+" de su tarjeta.\n\nLos productos seran enviados a "+this.getDireccionEnvio()+"\n-------------------------------------------------------");
				carrito.setEstadoVendido(true);
			}
		}
		else
			System.out.println("El carrito ya fue comprado!");
	}
	
}

