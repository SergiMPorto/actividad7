package modelo.daojdbc;

import java.util.List;

import modelojavabeans.Proyectos;
import modelojavabeans.Proyectos_con_Empleados;

public interface Proyecto_Con_EmpleadosDao {
	
	int altaProyecto(Proyectos_con_Empleados proyecto_empl);
	Proyectos_con_Empleados buscarUno(String id_proyecto);
	List<Proyectos_con_Empleados> empleadosByProyectos(String id_proyecto);
	int asignarEmpleadosAProyecto(List<Proyectos_con_Empleados> lista);
	int horasAsignadasAlProyecto(String id_proyecto);
	double costeActualDeProyecto(String id_proyecto);
    double margenActualdelProyecto(String id_proyecto);
}
