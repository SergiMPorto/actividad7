package testing;

import modelo.daojdbc.EmpleadoDao;
import modelo.daojdbc.EmpleadoDaoImplList;
import modelojavabeans.Empleados;

public class TestEmpleado {

	public static void main(String[] args) {
		
	EmpleadoDaoImplList Emp = new EmpleadoDaoImplList();
	
	System.out.println("Buscar uno");
	
	System.out.println(Emp.buscarUno(105));
	
	System.out.println("Buscar todos");
	
	
	for( Empleados ele : Emp.buscarTodos())
    System.out.println(ele);
	
	
	System.out.println("Empleado por departamento");
	
	for(Empleados ele : Emp.empleadosByDepartamentos(30))
		System.out.println(ele);
	
	
	System.out.println("Empleado por apellido");
	
	for(Empleados ele : Emp.empleadosByApellidos("Diaz"))
		System.out.println("ele");
	
	
	System.out.println("Empleado por sexo");
	
	for(Empleados ele : Emp.empleadosBySexo('H'))
		System.out.println(ele);
	
	
	System.out.println("Empleado por departamento");
	
	
	System.out.println("Empleado por departamento");
	
	
	System.out.println("Salario total por departamentos");
	
	System.out.println(Emp.salarioTotalDepartamento(20));
	
	
	
		
	
	
	
	
	
	
	
			
	

	}

}
