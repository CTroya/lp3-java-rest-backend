package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.edu.uc.lp3.domain.Organizacion;
import py.edu.uc.lp3.repository.OrganizacionRepository;
import py.edu.uc.lp3.service.OrganizacionService;

@Service
public class OrganizacionServiceImpl implements OrganizacionService {
	
	@Autowired
	OrganizacionRepository organizacionRepository;
	@Override
	public Organizacion crearOrganizacion(Organizacion organizacion) {
		Optional<Organizacion> orgBD=organizacionRepository.findById(organizacion.getId());
		if(orgBD.isEmpty()) {
			return organizacionRepository.save(organizacion);
		}
		return null;
	}
	@Override
	public Organizacion actualizarOrganizacion(Organizacion organizacion) {
		Optional<Organizacion> orgBD=organizacionRepository.findById(organizacion.getId());
		if(orgBD.isPresent()) {
			return organizacionRepository.save(organizacion);
		}
		return null;
		
	}
	@Override
	public void eliminarOrganizacion(Long id) {
		organizacionRepository.deleteById(id);
	}
	@Override
	public ArrayList<Organizacion> listarOrganizaciones() {
		return (ArrayList<Organizacion>)organizacionRepository.findAll();
	}
	@Override
	public ArrayList<Organizacion> listarPorTipo(String tipo) {
		return (ArrayList<Organizacion>)organizacionRepository.findByTipo(tipo);
	}
	
}
