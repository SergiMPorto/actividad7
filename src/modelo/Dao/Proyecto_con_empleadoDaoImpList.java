package modelo.Dao;

import java.util.List;

import modelojavabeans.Proyectos;

public class Proyecto_con_empleadoDaoImpList implements Proyecto_con_empleadosDao {

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
