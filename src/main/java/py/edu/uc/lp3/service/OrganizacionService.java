package py.edu.uc.lp3.service;

import java.util.ArrayList;
import java.util.Optional;

import py.edu.uc.lp3.domain.Organizacion;
import py.edu.uc.lp3.exceptions.GeneralExceptions;

public interface OrganizacionService {

	/*
	 * Funcion para crear una organizacion.
	 * Parametros:
	 * 				Organizacion organizacion : la organizacion que deseamos guardar.
	 * Retorno:
	 * 				Organizacion: para la visualizacion en el insomnia.
	 * */
	public Organizacion crearOrganizacion(Organizacion organizacion);
	/*
	 * Funcion para actualizar una organizacion.
	 * Parametros:
	 * 				Organizacion organizacion : la organizacion que deseamos actualizar.
	 * Retorno:
	 * 				Organizacion: para la visualizacion en el insomnia.
	 * */
	public Organizacion actualizarOrganizacion(Organizacion organizacion);
	/*
	 * Funcion para eliminar una organizacion.
	 * Parametros:
	 * 				Long Id : Id de la organizacion que se desea eliminar.
	 * Retorno:
	 * 				Ninguno.
	 * */
	public void eliminarOrganizacion(Long Id) throws GeneralExceptions;
	/*
	 * Funcion para encontrar una organizacion por Id.
	 * Parametros:
	 * 				Long Id : Id de la organizacion.
	 * Retorno:
	 * 				Optional<Organizacion>: La organizacion encontrada por el id.
	 * */
	public Optional<Organizacion> encontrarOrganizacionPorId(Long id);
	/*
	 * Funcion para desplegar una lista de las organizaciones que se encuentran en la base de datos.
	 * Parametros:
	 * 				Ninguno.
	 * Retorno:
	 * 				ArrayList<Organizacion>: Lista de organizacion.
	 * */
	public ArrayList<Organizacion> listarOrganizaciones();
	/*
	 * Funcion para desplegar una lista de las organizaciones pro tipo que se encuentran en la base de datos.
	 * Parametros:
	 * 				String tipo: El tipo de la organizacion que se desea ver
	 * Retorno:
	 * 				ArrayList<Organizacion>: Lista de organizacion por tipo.
	 * */
	public ArrayList<Organizacion> listarPorTipo(String tipo);
}
