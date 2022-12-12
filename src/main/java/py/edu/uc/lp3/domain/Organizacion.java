package py.edu.uc.lp3.domain;

import javax.persistence.*;

@Entity
public class Organizacion {
	@Id
	//Crea una primary key en la base de datos.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nombre;
	String tipo;
	String ubicacion;
	int telefono;
	protected Organizacion() {
		
	}
	public Organizacion(Long id, String nombre, String tipo, String ubicacion, int telefono) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
	}
	
	public Organizacion(String nombre, String tipo, String ubicacion, int telefono) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Organizacion [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", ubicacion=" + ubicacion
				+ ", telefono=" + telefono + "]";
	}
	
}
