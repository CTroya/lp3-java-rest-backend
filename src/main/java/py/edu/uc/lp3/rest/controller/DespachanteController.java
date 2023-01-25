package py.edu.uc.lp3.rest.controller;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.constants.ApiPaths;
import py.edu.uc.lp3.domain.Producto;

@RestController
@RequestMapping(ApiPaths.DESPACHANTE)
public class DespachanteController {
    @Autowired
    //private DespachanteService despachanteService;
    @RequestMapping(value="/generarPresupuesto", method=RequestMethod.GET)
    public ArrayList<Producto> generarPresupuesto() {
        return null;
    }
    
    
}
