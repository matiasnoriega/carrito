package ar.edu.uno.progconobjetos1.carritodecompras.modulo;


public class Tarjeta {
	private String numero;
	private Double limite;

	//Constructor de la clase
	public Tarjeta(String numero, Double limite){
		this.setNumero(numero);
		this.setLimite(limite);
	}

	//Getters y setters de la clase
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	//Metodos	
	
	public Boolean verificarTarjeta(Double valorCompra){
		
		if(this.numero.length()!=16)
			System.out.println("El numero de la tarjeta no es valido.\n------------------------------");
		
		if(this.limite<valorCompra)
			System.out.println("Su compra de $"+valorCompra+" excede el limite de su tarjeta.\n------------------------------");
		
		return (this.numero.length()==16&&this.limite>valorCompra);
	}


}
