package py.edu.uc.lp3.domain;

import java.util.ArrayList;
import javax.persistence.*;


@Entity
public class Almacenamiento extends itemFacturable {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	long Id;
	float capacidad;
	public ArrayList<Producto> productosGuardados;
	public float getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}
	public ArrayList<Producto> getProductosGuardados() {
		return productosGuardados;
	}
	public void setProductosGuardados(ArrayList<Producto> productosGuardados) {
		this.productosGuardados = productosGuardados;
	}
}
