package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.domain.Presupuesto;
import py.edu.uc.lp3.domain.Producto;
import py.edu.uc.lp3.repository.ProductoRepository;
import py.edu.uc.lp3.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	@Autowired
	ProductoRepository productoRepository;
	@Override
	public Producto crearProducto(Producto producto) {
		Optional<Producto> orgBD=productoRepository.findById(producto.getId());
		if(orgBD.isEmpty()) {
			return productoRepository.save(producto);
		}
		return null;
	}
	@Override
	public Producto actualizarProducto(Producto producto) {
		Optional<Producto> orgBD=productoRepository.findById(producto.getId());
		if(orgBD.isPresent()) {
			return productoRepository.save(producto);
		}
		return null;
	}
	@Override
	public void eliminarProducto(Long Id) {
		productoRepository.deleteById(Id);
	}
	@Override
	public ArrayList<Producto> listarProductos() {
		return (ArrayList<Producto>)productoRepository.findAll();
	}
	@Override
	public ArrayList<Producto> listarProductosPorId(long Id){
		ArrayList<Producto> bruh = (ArrayList<Producto>)productoRepository.findAll();
		System.out.println(bruh);
		for(Iterator<Producto> iter = bruh.iterator();iter.hasNext();){
			Producto xd = iter.next();
			if(xd.getAlmacenamientoId() != Id){
				System.out.println(Id);
				iter.remove();
			}
		}
		return bruh;
	}
	@Override
	public Presupuesto generarPresupuesto(long almacenamientoId) {
		ArrayList<Producto> listaItems = listarProductosPorId(almacenamientoId);
		for(Iterator<Producto> iter = listaItems.iterator();iter.hasNext();){
			Producto producto = iter.next();
			System.out.println(producto.getNombre());
			System.out.println(producto.getIdImpuestos());
		}
		Presupuesto presuCalculado;
		/*
		 * PrecioProducto+HonorarioDespachante+ImpuestoG
		 */
		//return presuCalculado;
		return null;
	}
}
