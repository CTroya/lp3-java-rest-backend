package py.edu.uc.lp3.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
@Entity
public class Usuario {
	@Id
	//Crea una primary key en la base de datos.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String userName;
	String userEmail;
	String hash;
	int idOrganizacion;
	String rol;
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public int getIdOrganizacion() {
		return idOrganizacion;
	}
	public void setIdOrganizacion(int idOrganizacion) {
		this.idOrganizacion = idOrganizacion;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
}
