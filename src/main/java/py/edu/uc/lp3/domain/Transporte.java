package py.edu.uc.lp3.domain;

import java.util.ArrayList;

public class Transporte extends itemFacturable{
	float capacidad;
	ArrayList<Producto> productosTransportados;
	int distancia;
	public float getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}
	public ArrayList<Producto> getProductosTransportados() {
		return productosTransportados;
	}
	public void setProductosTransportados(ArrayList<Producto> productosTransportados) {
		this.productosTransportados = productosTransportados;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
}
