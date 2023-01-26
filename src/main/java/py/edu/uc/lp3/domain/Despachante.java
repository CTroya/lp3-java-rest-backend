package py.edu.uc.lp3.domain;

import javax.persistence.Entity;

@Entity
public class Despachante extends Usuario{
	float honorarios;
	public Despachante() {
		super();
	}
	public float getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(float honorarios) {
		this.honorarios = honorarios;
	}	
}
