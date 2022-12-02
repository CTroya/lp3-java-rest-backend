package py.edu.uc.lp3.service;

import java.util.ArrayList;
import py.edu.uc.lp3.domain.Organizacion;

public interface OrganizacionService {
	public Organizacion crearOrganizacion(Organizacion organizacion);
	public Organizacion actualizarOrganizacion(Organizacion organizacion);
	public void eliminarOrganizacion(Organizacion organizacion);
	public ArrayList<Organizacion> listarOrganizaciones();
	public ArrayList<Organizacion> listarPorTipo(String tipo);
}
