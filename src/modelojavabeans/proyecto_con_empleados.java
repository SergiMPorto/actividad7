package modelojavabeans;

import java.util.Date;

public class Proyecto_con_Empleados {
	
	private int numero_orden;
    Proyectos id_proyecto;
    Empleados id_empl;
    private int horas_asignadas;
    private Date fecha_incorporacion; 
    private double precio_hora;



//Metodos

public double costeHorasAsignadas() {
	return horas_asignadas*precio_hora;
}
}
