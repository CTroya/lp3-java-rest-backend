package py.edu.uc.lp3.rest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.constants.ApiPaths;
import py.edu.uc.lp3.domain.PedidoTransporte;
import py.edu.uc.lp3.service.PedidoTransporteService;

@RestController
@RequestMapping(ApiPaths.PEDIDOTRANSPORTE)
public class PedidoTransporteController{
	@Autowired
	private PedidoTransporteService pedidoTransporteService;
	@RequestMapping(method=RequestMethod.POST)
    public PedidoTransporte save(@RequestBody PedidoTransporte pedidoTransporte) {
        return pedidoTransporteService.crearPedidoTransporte(pedidoTransporte);
    }
	@RequestMapping(method=RequestMethod.GET)
    public ArrayList<PedidoTransporte> findAll() {
        return pedidoTransporteService.listarPedidoTransporte();
    }
	@RequestMapping(method=RequestMethod.PUT)
    public PedidoTransporte update(@RequestBody PedidoTransporte pedidoTransporte) {
        return pedidoTransporteService.actualizarPedidoTransporte(pedidoTransporte);
    }
	@RequestMapping(value="/{organizacionId}",method=RequestMethod.DELETE)
    public void delete(@PathVariable Long organizacionId){
		pedidoTransporteService.eliminarPedidoTransporte(organizacionId);
    }
    @RequestMapping(value="/{transportistaId}",method=RequestMethod.GET)
    public ArrayList<PedidoTransporte> findById(@PathVariable Long transportistaId){
        return pedidoTransporteService.listarPorTransportista(transportistaId);
    }
}
