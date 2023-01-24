package py.edu.uc.lp3.domain;

public class Pedido {
	long id;
	Almacenamiento Producto;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Almacenamiento getProducto() {
		return Producto;
	}
	public void setProducto(Almacenamiento producto) {
		Producto = producto;
	}
	
}
