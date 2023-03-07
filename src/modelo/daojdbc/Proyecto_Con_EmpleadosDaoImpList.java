package modelo.daojdbc;

import java.util.List;



import modelojavabeans.Proyectos;
import modelojavabeans.Proyectos_con_Empleados;

public class Proyecto_Con_EmpleadosDaoImpList extends AbstractDaoMy8 implements Proyecto_Con_EmpleadosDao{

	@Override
	public int altaProyecto(Proyectos proyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Proyectos_con_Empleados buscarUno(String id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyectos_con_Empleados> empleadosByProyectos(String id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyectos_con_Empleados> asignarEmpleadosAProyecto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int horasAsignadasAlProyecto(String id_proyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double costeActualDeProyecto(String id_proyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double margenActualdelProyecto(String id_proyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

}