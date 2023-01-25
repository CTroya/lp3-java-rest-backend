package py.edu.uc.lp3.service;

import java.util.ArrayList;
import py.edu.uc.lp3.domain.*;

public interface DespachanteService {
	ArrayList<Producto> generarPresupuesto(Pedido pedido);
	Pedido generarPedidoTransporte(Pedido pedido,Transportista transportista);
	Pedido cargarDato(ArrayList<Producto> productos,Long almacenamientoId);
}
