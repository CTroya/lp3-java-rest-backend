package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.domain.Pedido;
import py.edu.uc.lp3.domain.Producto;
import py.edu.uc.lp3.domain.Transportista;
import py.edu.uc.lp3.repository.PedidoRepository;
import py.edu.uc.lp3.service.DespachanteService;
@Service
public class DespachanteServiceImpl implements DespachanteService {
    @Autowired
    PedidoRepository pedidoRepository;
    @Override
    public ArrayList<Producto> generarPresupuesto(Pedido pedido) {
        // TODO Auto-generated method stub
        Optional <Pedido> reqBD = pedidoRepository.findById(pedido.getId());
        if(reqBD.isPresent()){
            Pedido reqObj = reqBD.get();
            System.out.print(reqObj);
        }
        return null;
    }

    @Override
    public Pedido generarPedidoTransporte(Pedido pedido, Transportista transportista) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pedido cargarDato(ArrayList<Producto> productos) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
