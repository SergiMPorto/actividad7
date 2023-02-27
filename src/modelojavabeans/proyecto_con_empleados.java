package modelojavabeans;

import java.util.Date;

public class proyecto_con_empleados {
	
	private int numero_orden;
    proyectos id_proyecto;
    empleados id_empl;
    private int horas_asignadas;
    private Date fecha_incorporacion; 
    private double precio_hora;



//Metodos

public double costeHorasAsignadas() {
	return horas_asignadas*precio_hora;
}
}
