package py.edu.uc.lp3.domain;

import javax.persistence.Entity;

@Entity
public class Transportista extends Usuario {
	public Transportista() {
		super();
		this.rol="TRANSPORTISTA";
	}
	String contratante;
	int idAlmacen;
	int idTransporte;
	public String getContratante() {
		return contratante;
	}
	public void setContratante(String contratante) {
		this.contratante = contratante;
	}
	public int getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public int getIdTransporte() {
		return idTransporte;
	}
	public void setIdTransporte(int idTransporte) {
		this.idTransporte = idTransporte;
	}
}
