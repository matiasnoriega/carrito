package ar.edu.uno.progconobjetos1.carritodecompras.modulo;

public class ItemCarrito {
	private Producto producto;
	private Integer cantidad;
	private Double costoItem;
	
	//Constructor de la clase
	public ItemCarrito(Producto producto, Integer cantidad){
		this.setCantidad(cantidad);
		this.setProducto(producto);
		this.setCostoItem(cantidad*(producto.getPrecio()));
	}
	


	//Getters y setters
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getCostoItem() {
		return costoItem;
	}
	public void setCostoItem(Double costoItem) {
		this.costoItem = costoItem;
	}
	
	public String toString(){
		return "Tiene "+this.cantidad+" unidades del producto: "+this.producto.getNombre();
	}
	
	
}
