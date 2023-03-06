package modelo.Dao;

import java.util.List;

import modelojavabeans.Proyectos;

public class ProyectoDaoImplList implements ProyectoDao {

	@Override
	public int altaProyecto(Proyectos proyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Proyectos buscarUno(String id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyectos> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyectos> proyectosByEstado(String estado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyectos> proyectosByCliente(String cif) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyectos> proyectosByJefeProyectosAndByEstado(int jefeProyecto, String estado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyectos importesVentasProyectosTerminados(double ventas_previstas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyectos margenBrutosProyectosTerminados(double ventas_previstas, double costes_reales) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double importesVentasProyectosTerminados(String estado, String id_proyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double margenBrutosProyectosTerminados(String estado, String id_proyecto) {
		// TODO Auto-generated method stub
		return 0;
	}


}
