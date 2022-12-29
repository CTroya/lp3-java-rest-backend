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
	@RequestMapping(value="/usuario/auditor")
	public Auditor save(@RequestBody Auditor auditor) {
		return usuarioService.crearAuditor(auditor);
	}
	@RequestMapping(value="/usuario/transportista")
	public Transportista save(@RequestBody Transportista transportista) {
		return usuarioService.crearTransportista(transportista);
	}
	@RequestMapping(method=RequestMethod.GET , value="/usuario")
    public ArrayList<Usuario> findAll() {
        return usuarioService.listarUsuarios();
    }
	@RequestMapping(method=RequestMethod.PUT,path="/usuario/administrador")
	public Administrador update(Administrador administrador) {
		return usuarioService.actualizarAdministrador(administrador);
	}
	public Despachante update(Despachante despachante) {
		return usuarioService.actualizarDespachante(despachante);
	}
	@RequestMapping(method=RequestMethod.DELETE)
	public void delete(@PathVariable Long usuarioId) {
		usuarioService.eliminarUsuario(usuarioId);
	}
}
