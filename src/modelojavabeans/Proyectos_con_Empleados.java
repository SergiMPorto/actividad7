package modelojavabeans;

import java.util.Date;

public class Proyectos_con_Empleados {
	
	private int numero_orden;
    Proyectos id_proyecto;
    Empleados id_empl;
    private int horas_asignadas;
    private Date fecha_incorporacion; 
    private double precio_hora;



 

	public Proyectos_con_Empleados() {
		super();
	}



	public Proyectos_con_Empleados(int numero_orden, Proyectos id_proyecto, Empleados id_empl, int horas_asignadas,
			Date fecha_incorporacion, double precio_hora) {
		super();
		this.numero_orden = numero_orden;
		this.id_proyecto = id_proyecto;
		this.id_empl = id_empl;
		this.horas_asignadas = horas_asignadas;
		this.fecha_incorporacion = fecha_incorporacion;
		this.precio_hora = precio_hora;
	}



	public int getNumero_orden() {
		return numero_orden;
	}



	public void setNumero_orden(int numero_orden) {
		this.numero_orden = numero_orden;
	}



	public Proyectos getId_proyecto() {
		return id_proyecto;
	}



	public void setId_proyecto(Proyectos id_proyecto) {
		this.id_proyecto = id_proyecto;
	}



	public Empleados getId_empl() {
		return id_empl;
	}



	public void setId_empl(Empleados id_empl) {
		this.id_empl = id_empl;
	}



	public int getHoras_asignadas() {
		return horas_asignadas;
	}



	public void setHoras_asignadas(int horas_asignadas) {
		this.horas_asignadas = horas_asignadas;
	}



	public Date getFecha_incorporacion() {
		return fecha_incorporacion;
	}



	public void setFecha_incorporacion(Date fecha_incorporacion) {
		this.fecha_incorporacion = fecha_incorporacion;
	}



	public double getPrecio_hora() {
		return precio_hora;
	}



	public void setPrecio_hora(double precio_hora) {
		this.precio_hora = precio_hora;
	}



	@Override
	public String toString() {
		return "Proyectos_con_Empleados [numero_orden=" + numero_orden + ", id_proyecto=" + id_proyecto + ", id_empl="
				+ id_empl + ", horas_asignadas=" + horas_asignadas + ", fecha_incorporacion=" + fecha_incorporacion
				+ ", precio_hora=" + precio_hora + "]";
	}



	public double costeHorasAsignadas() {
		return horas_asignadas*precio_hora;
	}
}

