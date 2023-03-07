package modelo.daojdbc;

import java.util.List;

import modelojavabeans.Empleados;

public class EmpleadoDaoImplList extends AbstractDaoMy8 implements EmpleadoDao {

	@Override
	public int altaEmpleado(Empleados empleado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Empleados buscarUno(String id_empl) {
		// TODO Auto-generated method stub
		return null;
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

	