package modelo.daojdbc;

import java.util.List;

import modelojavabeans.Empleados;

public interface EmpleadoDao {

	
	int altaEmpleado(Empleados empleado);
	Empleados buscarUno(int id_empl);
	List<Empleados> buscarTodos();
	List<Empleados>empleadosByDepartamentos(int id_depar);
	List<Empleados>empleadosBySexo(char sexo);
	List<Empleados>empleadosByApellidos(String apellidos);
	double salarioTotal();
	double salarioTotalDepartamento(int id_depar);
	
	

}
