package modelo.Dao;

import java.util.List;

import modelojavabeans.Empleados;
import modelojavabeans.Proyectos;

public interface ProyectoDao {

	int altaProyecto(Proyectos proyecto);
	Proyectos buscarUno(String id_proyecto);
	List<Proyectos> buscarTodos();
	List<Proyectos>proyectosByEstado(String estado);
	List<Proyectos>proyectosByCliente(String cif);
	List<Proyectos>proyectosByJefeProyectosAndByEstado(int jefeProyecto, String estado);
	double importesVentasProyectosTerminados(String estado, String id_proyecto);
	double margenBrutosProyectosTerminados(String estado, String id_proyecto);
	
	
	
	
	

}