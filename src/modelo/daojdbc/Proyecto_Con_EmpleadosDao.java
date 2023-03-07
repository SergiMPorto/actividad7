package modelo.daojdbc;

import java.util.List;

import modelojavabeans.Proyecto_con_Empleados;
import modelojavabeans.Proyectos;

public interface Proyecto_con_EmpleadosDao 
{
	int altaProyecto(Proyectos proyecto);
	Proyecto_con_Empleados buscarUno(String id_proyecto);
	List<Proyecto_con_Empleados> empleadosByProyectos(String id_proyecto);
	List<Proyecto_con_Empleados> asignarEmpleadosAProyecto();
	int horasAsignadasAlProyecto(String id_proyecto);
	double costeActualDeProyecto(String id_proyecto);
    double margenActualdelProyecto(String id_proyecto);
}
