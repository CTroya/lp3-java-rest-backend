package py.edu.uc.lp3.service;

import java.util.ArrayList;

import py.edu.uc.lp3.domain.Producto;

public interface ProductoService {
	public Producto crearProducto(Producto producto);
	public Producto actualizarProducto(Producto producto);
	public void eliminarProducto(Long Id);
	public ArrayList<Producto> listarProductos();
	public ArrayList<Producto> listarProductosPorId(long Id);
}
