package py.edu.uc.lp3.rest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import py.edu.uc.lp3.constants.ApiPaths;
import py.edu.uc.lp3.domain.Presupuesto;
import py.edu.uc.lp3.domain.Producto;
import py.edu.uc.lp3.service.ProductoService;


@RestController
@RequestMapping(ApiPaths.PRODUCTO)
public class ProductoController {
    @Autowired
	private ProductoService productoService;
    @RequestMapping(method=RequestMethod.GET,value="/generarPresupuesto/{listaProductosId}")
    public Presupuesto generarPresupuesto(@PathVariable(name = "listaProductosId") long listaProductosId){
        return productoService.generarPresupuesto(listaProductosId);
    }
	@PostMapping
    public Producto save(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }
	@RequestMapping(method=RequestMethod.GET)
    public ArrayList<Producto> findAll() {
        return productoService.listarProductos();
    }
    @RequestMapping(method=RequestMethod.GET,value="/{Id}")
    public ArrayList<Producto> findById(@PathVariable long Id){
        return productoService.listarProductosPorId(Id);
    }
	@RequestMapping(method=RequestMethod.PUT)
    public Producto update(@RequestBody Producto producto){
        return productoService.actualizarProducto(producto);
    }
	@RequestMapping(value="/{productoId}",method=RequestMethod.DELETE)
    public void delete(@PathVariable Long productoId){
		productoService.eliminarProducto(productoId);
    }
}
