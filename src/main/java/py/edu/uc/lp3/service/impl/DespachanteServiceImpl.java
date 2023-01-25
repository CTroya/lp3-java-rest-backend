package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.domain.Almacenamiento;
import py.edu.uc.lp3.domain.Pedido;
import py.edu.uc.lp3.domain.Producto;
import py.edu.uc.lp3.domain.Transportista;
import py.edu.uc.lp3.repository.PedidoRepository;
import py.edu.uc.lp3.service.DespachanteService;
import py.edu.uc.lp3.repository.*;
import java.util.Optional;
@Service
public class DespachanteServiceImpl implements DespachanteService {
    @Autowired
    PedidoRepository pedidoRepository;
    AlmacenamientoRepository almacenamientoRepository; 
    @Override
    public ArrayList<Producto> generarPresupuesto(Pedido pedido) {
        // TODO Auto-generated method stub

        return null;
    }

    @Override
    public Pedido generarPedidoTransporte(Pedido pedido, Transportista transportista) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pedido cargarDato(ArrayList<Producto> productos,Long pedidoIdLong) {
        Optional<Pedido> reqBD = pedidoRepository.findById(pedidoIdLong);
        if(reqBD.isPresent()){
            Pedido pedido = reqBD.get();
            productos.addAll(pedido.getProducto().getProductosGuardados());
            pedido.getProducto().setProductosGuardados(productos);
            return pedido;
        }
        return null;
    }
    
}
