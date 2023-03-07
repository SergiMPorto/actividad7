package modelo.daojdbc;

import java.util.List;

import modelo.Dao.Proyecto_con_empleadosDao;
import modelojavabeans.Proyectos;

public class Poryecto_Con_EmpleadosDaoImpList implements Proyecto_Con_EmpleadosDao{

	@Override
	public int altaProyecto(Proyectos proyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Proyecto_con_empleadosDao buscarUno(String id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyecto_con_empleadosDao> empleadosByProyectos(String id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyecto_con_empleadosDao> asignarEmpleadosAProyecto() {
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
