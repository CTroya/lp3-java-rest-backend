package py.edu.uc.lp3.rest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.constants.ApiPaths;
import py.edu.uc.lp3.domain.Almacenamiento;
import py.edu.uc.lp3.service.AlmacenamientoService;

@RestController
@RequestMapping(ApiPaths.ALMACENAMIENTO)
public class AlmacenamientoController {
	@Autowired
	private AlmacenamientoService almacenamientoService;
	@RequestMapping(method=RequestMethod.POST)
    public Almacenamiento save(@RequestBody Almacenamiento almacenamiento) {
        return almacenamientoService.crearAlmacenamiento(almacenamiento);
    }
	@RequestMapping(method=RequestMethod.GET)
    public ArrayList<Almacenamiento> findAll() {
        return almacenamientoService.listarAlmacenamientos();
    }
	@RequestMapping(method=RequestMethod.PUT)
    public Almacenamiento update(@RequestBody Almacenamiento almacenamiento) {
        return almacenamientoService.actualizarAlmacenamiento(almacenamiento);
    }
	@RequestMapping(value="/{almacenamientoId}",method=RequestMethod.DELETE)
    public void delete(@PathVariable Long almacenamientoId){
		almacenamientoService.eliminarAlmacenamiento(almacenamientoId);
    }
}
