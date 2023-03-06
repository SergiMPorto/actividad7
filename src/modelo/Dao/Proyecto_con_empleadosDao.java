package modelo.Dao;

import java.util.List;

import modelojavabeans.Proyectos;

public interface Proyecto_con_empleadosDao {

	int altaProyecto(Proyectos proyecto);
	Proyecto_con_empleadosDao buscarUno(String id_proyecto);
	List<Proyecto_con_empleadosDao> empleadosByProyectos(String id_proyecto);
	List<Proyecto_con_empleadosDao> asignarEmpleadosAProyecto();
	int horasAsignadasAlProyecto(String id_proyecto);
	double costeActualDeProyecto(String id_proyecto);
    double margenActualdelProyecto(String id_proyecto);
	
}