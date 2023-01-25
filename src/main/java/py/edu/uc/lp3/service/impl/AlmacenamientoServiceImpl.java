package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.domain.Almacenamiento;
import py.edu.uc.lp3.repository.AlmacenamientoRepository;
import py.edu.uc.lp3.service.AlmacenamientoService;

@Service
public class AlmacenamientoServiceImpl implements AlmacenamientoService{
	@Autowired
	AlmacenamientoRepository almacenamientoRepository;
	@Override
	public Almacenamiento crearAlmacenamiento(Almacenamiento almacenamiento) {
		Optional<Almacenamiento> almBD=almacenamientoRepository.findById(almacenamiento.getId());
		if(almBD.isEmpty()) {
			return almacenamientoRepository.save(almacenamiento);
		}
		return null;
	}

	@Override
	public Almacenamiento actualizarAlmacenamiento(Almacenamiento almacenamiento) {
		Optional<Almacenamiento> almBD=almacenamientoRepository.findById(almacenamiento.getId());
		if(almBD.isPresent()) {
			return almacenamientoRepository.save(almacenamiento);
		}
		return null;
	}

	@Override
	public void eliminarAlmacenamiento(Long Id) {
		almacenamientoRepository.deleteById(Id);
	}

	@Override
	public ArrayList<Almacenamiento> listarAlmacenamientos() {
		return (ArrayList<Almacenamiento>)almacenamientoRepository.findAll();
	}

}
