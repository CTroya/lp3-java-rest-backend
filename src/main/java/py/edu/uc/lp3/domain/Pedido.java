package py.edu.uc.lp3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
