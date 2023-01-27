package py.edu.uc.lp3.rest.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import py.edu.uc.lp3.constants.ApiPaths;
import py.edu.uc.lp3.domain.Organizacion;
import py.edu.uc.lp3.exceptions.GeneralExceptions;
import py.edu.uc.lp3.service.OrganizacionService;

@RestController
@RequestMapping(ApiPaths.ORGANIZACION)
public class OrganizacionController {
	@Autowired
	private OrganizacionService organizacionService;
	/*
	 * Llama a la funcion para crear una organizacion.
	 * */
	@RequestMapping(method=RequestMethod.POST)
    public Organizacion save(@RequestBody Organizacion organizacion) {
        return organizacionService.crearOrganizacion(organizacion);
    }
	/*
	 * Llama a la funcion para desplegar una lista de organizaciones.
	 * */
	@RequestMapping(method=RequestMethod.GET)
    public ArrayList<Organizacion> findAll() {
        return organizacionService.listarOrganizaciones();
    }
	/*
	 *Llama a la funcion para desplegar una lista de organizaciones por tipo.
	 * */
	@RequestMapping(value="/{organizacionTipo}" ,method=RequestMethod.GET)
    public ArrayList<Organizacion> findByTipo(@PathVariable String organizacionTipo) {
        return organizacionService.listarPorTipo(organizacionTipo);
    }
	/*
	 * Llama a la funcion para actualizar una organizacion.
	 * */
	@RequestMapping(method=RequestMethod.PUT)
    public Organizacion update(@RequestBody Organizacion organizacion) {
        return organizacionService.actualizarOrganizacion(organizacion);
    }
	/*
	 * Llama a la funcion para eliminar una organizacion con un determinado id.
	 * */
	@RequestMapping(value="/{organizacionId}",method=RequestMethod.DELETE)
    public void delete(@PathVariable Long organizacionId){
		try {
			organizacionService.eliminarOrganizacion(organizacionId);
		}catch(GeneralExceptions e) {
			System.out.println("Ocurrió un error al tratar de eliminar la organizacion: " + e.getMessage());
		}
		
    }
}
