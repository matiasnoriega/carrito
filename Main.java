package ar.edu.uno.progconobjetos1.carritodecompras.modulo;

public class Main {
	
	public static void main(String[] args) {
		Tarjeta tarjetaJuan = new Tarjeta("500000185410111",200000.00);
		Cliente juan = new Cliente("Juan Marin", "Antofagasta 1960", "Antofagasta 1960", "juanmarin@hotmail.com", tarjetaJuan);
		Carrito carritoJuan = new Carrito("Tecnologia");
		
		Producto p1 = new Producto("Codigo Da Vinci", 150.0, 100);
		Producto p2 = new Producto("Tablet Samsung", 2500.0, 750);
		Producto p3 = new Producto("Huevos", 15.0, 985);
		Producto p4 = new Producto("TV Phillips 50' 3D", 15000.0, 10);
		Producto p5 = new Producto("Led Zeppelin: The Songs Remains The Same DVD Extended Version", 150.0, 101);
		Producto p6 = new Producto("Iphone S4", 8500.0, 1000);
		Producto p7 = new Producto("Mouse Razer DeathAdder", 300.0, 392);
		Producto p8 = new Producto("Raspberry PI", 455.0, 111);
		Producto p9 = new Producto("Arroz para Sushi", 15.0, 12);
		Producto p10 = new Producto("Auriculares Seinheisser 202HD", 600.0, 934);
		
		ItemCarrito item1 = new ItemCarrito(p2, 2);
		ItemCarrito item2 = new ItemCarrito(p5, 1);
		ItemCarrito item3 = new ItemCarrito(p3, 12);
		ItemCarrito item4 = new ItemCarrito(p4, 1);
		ItemCarrito item5 = new ItemCarrito(p10, 1);
		
		carritoJuan.agregarItemCarrito(item1);
		//carritoJuan.agregarItemCarrito(item4);
		carritoJuan.agregarItemCarrito(item5);
		
		juan.comprar(carritoJuan);
		
		
	}

}
