package py.edu.uc.lp3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Impuesto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String tipo;
	float porcentaje;
	float flete;
	public Impuesto() {
		super();
	}
	
	public Impuesto(long id, String tipo, float porcentaje, float flete) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.porcentaje = porcentaje;
		this.flete = flete;
	}
	
	public Impuesto(String tipo, float porcentaje, float flete) {
		super();
		this.tipo = tipo;
		this.porcentaje = porcentaje;
		this.flete = flete;
	}
	public float getFlete() {
		return flete;
	}
	public void setFlete(float flete) {
		this.flete = flete;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}
}
