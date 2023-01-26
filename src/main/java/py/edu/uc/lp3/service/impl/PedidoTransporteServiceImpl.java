package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.domain.PedidoTransporte;
import py.edu.uc.lp3.repository.PedidoTransporteRepository;
import py.edu.uc.lp3.service.PedidoTransporteService;

@Service
public class PedidoTransporteServiceImpl implements PedidoTransporteService {
	@Autowired
	PedidoTransporteRepository pedidoTransporteRepository;
	@Override
	public PedidoTransporte crearPedidoTransporte(PedidoTransporte pedidoTransporte) {
		Optional<PedidoTransporte> ptBD=pedidoTransporteRepository.findById(pedidoTransporte.getId());
		if(ptBD.isEmpty()) {
			return pedidoTransporteRepository.save(pedidoTransporte);
		}
		return null;
	}
	@Override
	public PedidoTransporte actualizarPedidoTransporte(PedidoTransporte pedidoTransporte) {
		Optional<PedidoTransporte> ptBD=pedidoTransporteRepository.findById(pedidoTransporte.getId());
		if(ptBD.isPresent()) {
			return pedidoTransporteRepository.save(pedidoTransporte);
		}
		return null;
	}

	@Override
	public void eliminarPedidoTransporte(Long Id) {
		pedidoTransporteRepository.deleteById(Id);		
	}

	@Override
	public ArrayList<PedidoTransporte> listarPedidoTransporte() {
		return (ArrayList<PedidoTransporte>)pedidoTransporteRepository.findAll();
	}

}
