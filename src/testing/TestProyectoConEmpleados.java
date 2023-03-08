package testing;

import modelo.daojdbc.Proyecto_Con_EmpleadosDaoImpList;
import modelojavabeans.Proyectos;

public class TestProyectoConEmpleados {

	public static void main(String[] args) {
		
		Proyecto_Con_EmpleadosDaoImpList empleado_proye = new Proyecto_Con_EmpleadosDaoImpList();
		
		
		System.out.println("Empleados por proyectos");
		
		System.out.println(empleado_proye.empleadosByProyectos("FOR2020001"));
		
		
//------------------------------------------------------------------------------------------//
		System.out.println("Horas asignadas del proyecto");
		
		
	System.out.println("El coste actual por proyecto es: "+ empleado_proye.horasAsignadasAlProyecto("FOR2020001"));
	
	
	//------------------------------------------------------------------------------------------------//
           System.out.println("Coste actual del proyecto");
           
           System.out.println("El coste actual del proyecto es: "+ empleado_proye.costeActualDeProyecto("FOR2020001"));
           
           
    //--------------------------------------------------------------------//
           System.out.println("Margen Actual Proyecto");
           
           System.out.println(empleado_proye.margenActualdelProyecto("FOR2020001"));
     
     
           
           
           ///-----------------------------------------------------------------------------------------------//
           
           System.out.println("Margen actuald el proyecto");
          
           System.out.println("El margen actual del proyecto es: "+ empleado_proye.margenActualdelProyecto("FOR2020001"));
          

}
	
}