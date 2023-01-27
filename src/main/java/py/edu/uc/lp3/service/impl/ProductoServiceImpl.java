package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.domain.Impuesto;
import py.edu.uc.lp3.domain.Presupuesto;
import py.edu.uc.lp3.domain.Producto;
import py.edu.uc.lp3.repository.ImpuestoRepository;
import py.edu.uc.lp3.repository.ProductoRepository;
import py.edu.uc.lp3.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	@Autowired
	ProductoRepository productoRepository;
	@Autowired
	ImpuestoRepository impuestoRepository;
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
		ArrayList<Producto> listaProducto = (ArrayList<Producto>)productoRepository.findAll();
		for(Iterator<Producto> iter = listaProducto.iterator();iter.hasNext();){
			Producto productoIt = iter.next();
			if(productoIt.getAlmacenamientoId() != Id){
				System.out.println(Id);
				iter.remove();
			}
		}
		return listaProducto;
	}
	@Override
	public Presupuesto generarPresupuesto(long almacenamientoId) {
		ArrayList<Impuesto> impBD = (ArrayList<Impuesto>)impuestoRepository.findAll();
		ArrayList<Producto> listaItems = listarProductosPorId(almacenamientoId);
		Presupuesto presuCalc = new Presupuesto();
		presuCalc.setListItems(listaItems);
		for(Iterator<Producto> iter = listaItems.iterator();iter.hasNext();){
			Producto producto = iter.next();
			presuCalc.setTotalCosto(presuCalc.getTotalCosto()+producto.getPrecio());;
			presuCalc.setTotalFlete(presuCalc.getTotalFlete()+producto.getFlete());
			//For para calcular los impuestos
			for(Iterator<Long> it = producto.idImpuestos.iterator();it.hasNext();){
				if(producto.idImpuestos != null){
					for(Iterator<Impuesto> itImp = impBD.iterator();itImp.hasNext();){
						Impuesto imp = itImp.next();
						if(imp.getId() == it.next()){
							presuCalc.setTotalImpuesto(presuCalc.getTotalImpuesto() + imp.getPorcentaje() * producto.getPrecio());
						}
					}
				}
			}
			presuCalc.setTotal(presuCalc.getTotalCosto()+presuCalc.getTotalFlete()+presuCalc.getTotalImpuesto());
		}
		return presuCalc;
	}
}
