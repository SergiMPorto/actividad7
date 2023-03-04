package modelo.Dao;

import java.util.List;

import modelojavabeans.Empleados;


import modelojavabeans.Empleados;

public interface EmpleadoDao {

	
	int altaEmpleado(Empleados cliente);
	Empleados buscarUno(String id_empl);
	List<Empleados> buscarTodos();
	List<Empleados>empleadosByDepartamentos(int id_depar);
	List<Empleados>empleadosBySexo(char sexo);
	List<Empleados>empleadosByApellidos(String apellidos);
	
	
	

}
