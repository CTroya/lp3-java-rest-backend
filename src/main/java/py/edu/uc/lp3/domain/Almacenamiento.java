package py.edu.uc.lp3.domain;

import java.util.ArrayList;

public class Almacenamiento extends itemFacturable {
	float capacidad;
	ArrayList<Producto> productosGuardados;
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
