package py.edu.uc.lp3.rest.controller;
import java.util.ArrayList;

//import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.constants.ApiPaths;
//import py.edu.uc.lp3.domain.Producto;
import py.edu.uc.lp3.domain.Almacenamiento;
import py.edu.uc.lp3.domain.Pedido;
import py.edu.uc.lp3.domain.Producto;
import py.edu.uc.lp3.service.DespachanteService;

@RestController
@RequestMapping(ApiPaths.DESPACHANTE)
public class DespachanteController {
    @Autowired
    private DespachanteService despachanteService;
    @RequestMapping(value="/generarPresupuesto", method=RequestMethod.GET)
    public float generarPresupuesto() {
        return 0;
    }
    @RequestMapping(value="/cargarDato/{AlmacenamientoId}",method=RequestMethod.POST)
    public Pedido cargarDato(@PathVariable Long Id,@RequestBody ArrayList<Producto> productos){
        return despachanteService.cargarDato(productos,Id);
    }
    
}
