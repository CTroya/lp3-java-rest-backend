package py.edu.uc.lp3.rest.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import py.edu.uc.lp3.constants.ApiPaths;
import py.edu.uc.lp3.domain.Organizacion;
import py.edu.uc.lp3.service.OrganizacionService;

@RestController
@RequestMapping(ApiPaths.ORGANIZACION)
public class OrganizacionController {
	@Autowired
	private OrganizacionService organizacionService;
	@RequestMapping(method=RequestMethod.POST)
    public Organizacion save(@RequestBody Organizacion organizacion) {
        return organizacionService.crearOrganizacion(organizacion);
    }
	@RequestMapping(method=RequestMethod.GET)
    public ArrayList<Organizacion> findAll() {
        return organizacionService.listarOrganizaciones();
    }
	@RequestMapping(value="/{organizacionTipo}" ,method=RequestMethod.GET)
    public ArrayList<Organizacion> findByTipo(@PathVariable String organizacionTipo) {
        return organizacionService.listarPorTipo(organizacionTipo);
    }
	@RequestMapping(method=RequestMethod.PUT)
    public Organizacion update(@RequestBody Organizacion organizacion) {
        return organizacionService.actualizarOrganizacion(organizacion);
    }
	@RequestMapping(value="/{organizacionId}",method=RequestMethod.DELETE)
    public void delete(@PathVariable Long organizacionId){
		organizacionService.eliminarOrganizacion(organizacionId);
    }
}
