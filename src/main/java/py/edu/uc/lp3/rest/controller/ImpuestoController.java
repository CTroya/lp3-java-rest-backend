package py.edu.uc.lp3.rest.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.constants.ApiPaths;
import py.edu.uc.lp3.domain.Impuesto;
import py.edu.uc.lp3.service.ImpuestoService;

@RestController
@RequestMapping(ApiPaths.IMPUESTO)
public class ImpuestoController {
	@Autowired
	private ImpuestoService impuestoService;
	@RequestMapping(method=RequestMethod.POST)
    public Impuesto save(@RequestBody Impuesto impuesto) {
        return impuestoService.crearImpuesto(impuesto);
    }
	@RequestMapping(method=RequestMethod.GET)
    public ArrayList<Impuesto> findAll() {
        return impuestoService.listarImpuesto();
    }
	@RequestMapping(method=RequestMethod.PUT)
    public Impuesto update(@RequestBody Impuesto impuesto) {
        return impuestoService.actualizarImpuesto(impuesto);
    }
	@RequestMapping(value="/{impuestoId}",method=RequestMethod.DELETE)
    public void delete(@PathVariable Long impuestoId) {
        impuestoService.eliminarImpuesto(impuestoId);
    }
}
