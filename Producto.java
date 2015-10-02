package ar.edu.uno.progconobjetos1.carritodecompras.modulo;

public class Producto {
	private String nombre;
	private Double precio;
	private Integer codigo;
	private String descripcion;
	
	//Constructor de la clase
	public Producto(String nombre, Double precio, Integer codigo) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setCodigo(codigo);
		this.setDescripcion("Sin drescripcion disponible.");
	}
	
	//Getters y setters de la clase
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
