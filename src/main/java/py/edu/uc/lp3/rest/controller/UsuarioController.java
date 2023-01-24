package py.edu.uc.lp3.rest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import py.edu.uc.lp3.domain.Administrador;
import py.edu.uc.lp3.domain.Auditor;
import py.edu.uc.lp3.domain.Despachante;
import py.edu.uc.lp3.domain.Transportista;
import py.edu.uc.lp3.domain.Usuario;
import py.edu.uc.lp3.service.UsuarioService;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	@RequestMapping(method=RequestMethod.POST,path="/usuario/administrador")
    public Administrador save(@RequestBody Administrador administrador) {
        return usuarioService.crearAdministrador(administrador);
    }
	@RequestMapping(method=RequestMethod.POST , path="/usuario/despachante")
	public Despachante save(@RequestBody Despachante despachante) {
		return usuarioService.crearDespachante(despachante);
	}
	@RequestMapping(method=RequestMethod.POST,value="/usuario/auditor")
	public Auditor save(@RequestBody Auditor auditor) {
		return usuarioService.crearAuditor(auditor);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/usuario/auditor")
	public Auditor update(@RequestBody Auditor auditor) {
		return usuarioService.actualizarAuditor(auditor);
	}
	@RequestMapping(method=RequestMethod.POST,value="/usuario/transportista")
	public Transportista save(@RequestBody Transportista transportista) {
		return usuarioService.crearTransportista(transportista);
	}
	@RequestMapping(method=RequestMethod.GET , value="/usuario")
    public ArrayList<Usuario> findAll() {
        return usuarioService.listarUsuarios();
    }
	@RequestMapping(method=RequestMethod.PUT,path="/usuario/administrador")
	public Administrador update(@RequestBody Administrador administrador) {
		return usuarioService.actualizarAdministrador(administrador);
	}
	@RequestMapping(method=RequestMethod.PUT,path="/usuario/despachante")
	public Despachante update(@RequestBody Despachante despachante) {
		return usuarioService.actualizarDespachante(despachante);
	}
	@RequestMapping(value="/usuario/{usuarioId}",method=RequestMethod.DELETE)
	public void delete(@PathVariable Long usuarioId) {
		usuarioService.eliminarUsuario(usuarioId);
	}
}
