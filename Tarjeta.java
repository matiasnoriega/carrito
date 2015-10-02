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
		
		return this.numero.length()==16&&this.limite>valorCompra;
		
	}


}
