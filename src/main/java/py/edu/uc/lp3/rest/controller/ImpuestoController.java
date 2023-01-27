package py.edu.uc.lp3.rest.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import py.edu.uc.lp3.constants.ApiPaths;
import py.edu.uc.lp3.domain.Impuesto;
import py.edu.uc.lp3.service.ImpuestoService;

@RestController
@RequestMapping(ApiPaths.IMPUESTO)
public class ImpuestoController {
	@Autowired
	private ImpuestoService impuestoService;
	@PostMapping
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
