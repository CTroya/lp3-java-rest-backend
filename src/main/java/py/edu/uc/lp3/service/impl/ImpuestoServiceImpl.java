package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.domain.Impuesto;
import py.edu.uc.lp3.repository.ImpuestoRepository;
import py.edu.uc.lp3.service.ImpuestoService;

@Service
public class ImpuestoServiceImpl implements ImpuestoService {
	
	@Autowired
	ImpuestoRepository impuestoRepository;
	@Override
	public Impuesto crearImpuesto(Impuesto impuesto) {
		Optional<Impuesto> impBD=impuestoRepository.findById(impuesto.getId());
		if(impBD.isEmpty()) {
			return impuestoRepository.save(impuesto);
		}else {
			return null;
		}
	}

	@Override
	public Impuesto actualizarImpuesto(Impuesto impuesto) {
		System.out.print("PILINEEEEES\n");
		Optional<Impuesto> impBD=impuestoRepository.findById(impuesto.getId());
		if(impBD.isPresent()) {
			return impuestoRepository.save(impuesto);
		}else {
			return null;
		}
	}

	@Override
	public void eliminarImpuesto(long id) {
		impuestoRepository.deleteById(id);
	}

	@Override
	public ArrayList<Impuesto> listarImpuesto() {
		return (ArrayList<Impuesto>)impuestoRepository.findAll();
	}

}
