package py.edu.uc.lp3.service;

import java.util.ArrayList;
import py.edu.uc.lp3.domain.*;

public interface DespachanteService {
	float generarPresupuesto(ArrayList<Producto> productos);
	Pedido generarPedidoTransporte(Pedido pedido,Transportista transportista);
	
}
