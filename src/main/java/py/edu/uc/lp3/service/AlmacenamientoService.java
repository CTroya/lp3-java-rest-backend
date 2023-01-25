package py.edu.uc.lp3.service;

import java.util.ArrayList;

import py.edu.uc.lp3.domain.Almacenamiento;

public interface AlmacenamientoService {
	public Almacenamiento crearAlmacenamiento(Almacenamiento almacenamiento);
	public Almacenamiento actualizarAlmacenamiento(Almacenamiento almacenamiento);
	public void eliminarAlmacenamiento(Long Id);
	public ArrayList<Almacenamiento> listarAlmacenamientos();
}
