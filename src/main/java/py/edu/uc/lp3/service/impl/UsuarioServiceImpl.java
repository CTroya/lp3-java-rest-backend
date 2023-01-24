package py.edu.uc.lp3.service.impl;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.domain.Administrador;
import py.edu.uc.lp3.domain.Auditor;
import py.edu.uc.lp3.domain.Despachante;
import py.edu.uc.lp3.domain.Transportista;
import py.edu.uc.lp3.domain.Usuario;

import py.edu.uc.lp3.repository.UsuarioRepository;
import py.edu.uc.lp3.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	@Override
	public Administrador crearAdministrador(Administrador administrador){
		Optional <Usuario> usrBD=usuarioRepository.findById(administrador.getId());
		if(usrBD.isEmpty()) {
			return usuarioRepository.save(administrador);
		}
		return null;
	}
	@Override
	public Administrador actualizarAdministrador(Administrador administrador){
		Optional <Usuario> usrBD=usuarioRepository.findById(administrador.getId());
		if(usrBD.isPresent()) {
			return usuarioRepository.save(administrador);
		}
		return null;
	}
	@Override
	public Despachante crearDespachante(Despachante despachante){
		Optional <Usuario> usrBD=usuarioRepository.findById(despachante.getId());
		if(usrBD.isEmpty()) {
			return usuarioRepository.save(despachante);
		}
		return null;
	}
	@Override
	public Despachante actualizarDespachante(Despachante despachante){
		Optional <Usuario> usrBD=usuarioRepository.findById(despachante.getId());
		System.out.print(despachante.getId());
		if(usrBD.isPresent()) {
			return usuarioRepository.save(despachante);
		}
		return null;
	}
	@Override
	public Transportista crearTransportista(Transportista transportista){
		Optional<Usuario> usrBD=usuarioRepository.findById(transportista.getId());
		if(usrBD.isEmpty()) {
			return usuarioRepository.save(transportista);
		}
		return transportista;
	}
	@Override
	public Transportista actualizarTransportista(Transportista transportista){
		Optional<Usuario> usrBD=usuarioRepository.findById(transportista.getId());
		if(usrBD.isPresent()) {
			return usuarioRepository.save(transportista);
		}
		return transportista;
	}
	@Override
	public Auditor crearAuditor(Auditor auditor){
		Optional <Usuario> usrBD=usuarioRepository.findById(auditor.getId());
		if(usrBD.isEmpty()) {
			return usuarioRepository.save(auditor);
		}
		return auditor;
	}
	@Override
	public Auditor actualizarAuditor(Auditor auditor){
		Optional <Usuario> usrBD=usuarioRepository.findById(auditor.getId());
		if(usrBD.isPresent()) {
			return usuarioRepository.save(auditor);
		}
		return null;
	}
	@Override
	public void eliminarUsuario(long id){
		usuarioRepository.deleteById(id);
	}
	@Override
	public ArrayList<Usuario> listarUsuarios(){
		return (ArrayList<Usuario>)usuarioRepository.findAll();
	}
	
}
