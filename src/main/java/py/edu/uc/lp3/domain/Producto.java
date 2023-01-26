package py.edu.uc.lp3.domain;

import javax.persistence.Entity;

@Entity
public class Producto extends itemFacturable{
	int cantidad;
	String procedencia;
	float peso;
	long almacenamientoId;
	public long getAlmacenamientoId(){
		return almacenamientoId;
	}
	public void setAlmacenamientoId(long nuevoAlmacenamientoId){
		almacenamientoId = nuevoAlmacenamientoId;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}