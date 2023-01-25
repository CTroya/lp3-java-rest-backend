package py.edu.uc.lp3.domain;

import java.util.ArrayList;

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
	public Almacenamiento addAlmacenamiento(ArrayList<Producto> productos){
		System.out.print("ME GUSTA LA CHOTA MUCHOOOOAAAAA PIJAS\n");
		productosATransportar.productosGuardados = new ArrayList<Producto>();
		productosATransportar.productosGuardados = productos;
		return productosATransportar;
	}
}
