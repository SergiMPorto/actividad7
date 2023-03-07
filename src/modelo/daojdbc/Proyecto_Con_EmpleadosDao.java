package modelo.daojdbc;

import java.util.List;

import modelo.Dao.Proyecto_con_empleadosDao;
import modelojavabeans.Proyectos;

public interface Proyecto_Con_EmpleadosDao {
	int altaProyecto(Proyectos proyecto);
	Proyecto_con_empleadosDao buscarUno(String id_proyecto);
	List<Proyecto_con_empleadosDao> empleadosByProyectos(String id_proyecto);
	List<Proyecto_con_empleadosDao> asignarEmpleadosAProyecto();
	int horasAsignadasAlProyecto(String id_proyecto);
	double costeActualDeProyecto(String id_proyecto);
    double margenActualdelProyecto(String id_proyecto);
}
