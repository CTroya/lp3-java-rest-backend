package py.edu.uc.lp3.service;

import java.util.ArrayList;

import py.edu.uc.lp3.domain.Impuesto;

public interface ImpuestoService {
	public Impuesto crearImpuesto(Impuesto impuesto);
	public Impuesto actualizarImpuesto(Impuesto impuesto);
	public void eliminarImpuesto(long id);
	public ArrayList<Impuesto> listarImpuesto();
}
