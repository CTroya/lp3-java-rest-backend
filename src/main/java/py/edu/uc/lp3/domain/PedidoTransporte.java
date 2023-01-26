package py.edu.uc.lp3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PedidoTransporte {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
    long transportistaId;
    long almacenamientoId;
    String origen;
    String destino;
    String estado;
	public PedidoTransporte() {
	}
	public PedidoTransporte(long id, long transportistaId, long almacenamientoId, String origen, String destino,
			String estado) {
		this.id = id;
		this.transportistaId = transportistaId;
		this.almacenamientoId = almacenamientoId;
		this.origen = origen;
		this.destino = destino;
		this.estado = estado;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTransportistaId() {
		return transportistaId;
	}
	public void setTransportistaId(long transportistaId) {
		this.transportistaId = transportistaId;
	}
	public long getAlmacenamientoId() {
		return almacenamientoId;
	}
	public void setAlmacenamientoId(long almacenamientoId) {
		this.almacenamientoId = almacenamientoId;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
    
}
