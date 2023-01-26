package py.edu.uc.lp3.domain;

import javax.persistence.Entity;

@Entity
public class Administrador extends Usuario{

	public Administrador() {
		super();
		this.rol="ADMINISTRADOR";
	}
	
}
