package testing;

import modelo.daojdbc.ProyectoDaoImplList;
import modelojavabeans.Proyectos;

public class TestProyectos {

	public static void main(String[] args) {
		
		ProyectoDaoImplList  proyect = new ProyectoDaoImplList();
		
		System.out.println("Proyecto por Estado");
		
		
		for( Proyectos ele : proyect.proyectosByEstado("activo"))
			System.out.println("ele");
		
		
	//---------------------------------------------------------------------------	
		
		
		System.out.println("Proyecto por Jefe y Estado");
		
		for (Proyectos ele : proyect.proyectosByJefeProyectosAndByEstado(114,"TERMINADO"))
			System.out.println(ele);
		
		//--------------------------------------------------------------------------------
		
		
		System.out.println("Margen bruto");
		
		System.out.println("El margen bruto es: "+ proyect.margenBrutosProyectosTerminados("Terminado", "FOR2020001"));
		
		//---------------------------------------------------------//
		
		System.out.println("Importe venta proyectos terminados");
		
	 System.out.println(proyect.importesVentasProyectosTerminados("TERMINADO", "FOR2020001"));
		
	 //-----------------------------------------------------------------//
	 
	 System.out.println("Días que quedan para terminar el proyecto");
	 
	 System.out.println(proyect.diasATerminoProyectoActivo("FOR2021002"));
		
	}
	
}
