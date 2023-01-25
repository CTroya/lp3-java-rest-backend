package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
