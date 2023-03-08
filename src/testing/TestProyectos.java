package testing;

import modelo.daojdbc.ProyectoDaoImplList;
import modelojavabeans.Proyectos;

public class TestProyectos {

	public static void main(String[] args) {
		
		ProyectoDaoImplList  proyect = new ProyectoDaoImplList();
		
		System.out.println("Proyecto por Estado");
		
		
		for( Proyectos ele : proyect.proyectosByEstado("activo"))
			System.out.println("ele");
		
		System.out.println("Proyecto por jefe");
		
		for (Proyectos ele : proyect.proyectosByJefeProyectosAndByEstado(114,"TERMINADO"))
			System.out.println(ele);
		
		
		
		
		
	}
	
}
