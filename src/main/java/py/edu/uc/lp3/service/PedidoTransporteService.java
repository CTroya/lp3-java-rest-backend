package py.edu.uc.lp3.service;

import java.util.ArrayList;

import py.edu.uc.lp3.domain.PedidoTransporte;

public interface PedidoTransporteService {
	public PedidoTransporte crearPedidoTransporte(PedidoTransporte pedidoTransporte);
	public PedidoTransporte actualizarPedidoTransporte(PedidoTransporte pedidoTransporte);
	public void eliminarPedidoTransporte(Long Id);
	public ArrayList<PedidoTransporte> listarPedidoTransporte();
}
