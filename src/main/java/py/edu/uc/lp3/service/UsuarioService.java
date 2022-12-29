package py.edu.uc.lp3.service;

import py.edu.uc.lp3.domain.Usuario;
import py.edu.uc.lp3.domain.Administrador;
import py.edu.uc.lp3.domain.Auditor;
import py.edu.uc.lp3.domain.Despachante;
import py.edu.uc.lp3.domain.Transportista;
import java.util.ArrayList;

public interface UsuarioService{
	
	public Administrador crearAdministrador(Administrador administrador);
	public Administrador actualizarAdministrador(Administrador administrador);
	
	public Despachante crearDespachante(Despachante despachante);
	public Despachante actualizarDespachante(Despachante despachante);
	
	public Transportista crearTransportista(Transportista transportista);
	public Transportista actualizarTransportista(Transportista transportista);

	public Auditor crearAuditor(Auditor auditor);
	public Auditor actualizarAuditor(Auditor auditor);
	
	public void eliminarUsuario(long id);
	
	public ArrayList<Usuario> listarUsuarios();
}
