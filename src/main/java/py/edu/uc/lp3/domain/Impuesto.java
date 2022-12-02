package py.edu.uc.lp3.domain;

public class Impuesto {
	int id;
	String tipo;
	float porcentaje;
	float flete;
	
	public float getFlete() {
		return flete;
	}
	public void setFlete(float flete) {
		this.flete = flete;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
