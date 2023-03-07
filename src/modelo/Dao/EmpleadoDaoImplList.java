package modelo.Dao;

import java.util.ArrayList;
import java.util.List;

import modelo.daojdbc.EmpleadoDao;
import modelojavabeans.Empleados;
import modelojavabeans.*;

public class EmpleadoDaoImplList implements EmpleadoDao{
private ArrayList<Empleados> lista;
	
	public EmpleadoDaoImplList() {
		lista = new ArrayList<>();
		cargarDatos();
	}	
	private void cargarDatos() {
		EmpleadoDaoImplList Edao= new EmpleadoDaoImplList ();
		//lista.add(new Empleados(121, "Antonio", "Losada", 'H', "antoniolosada@gmail.com", "BlackSpace", 4500, "2021-02-23" , "1989-03-21", 4, 20);
		
	}
	@Override
	public int altaEmpleado(Empleados cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public List<Empleados> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleados> empleadosByDepartamentos(int id_depar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleados> empleadosBySexo(char sexo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleados> empleadosByApellidos(String apellidos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double salarioTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double salarioTotalDepartamento(int id_depar) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Empleados buscarUno(int id_empl) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
