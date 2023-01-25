package py.edu.uc.lp3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	@OneToOne
	Almacenamiento productosATransportar;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Almacenamiento getProducto() {
		return productosATransportar;
	}
	public void setProducto(Almacenamiento producto) {
		productosATransportar = producto;
	}
	
}
