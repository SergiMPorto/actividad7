package modelojavabeans;

import java.util.Date;

public class proyectos {
	
	
	private String id_proyecto;
	private String descripcion;
	private Date fecha_inicio;
	private Date fecha_fin_previsto;
	private double venta_previsto;
	private double coste_previsto;
	private double coste_real;
	private String estado;
	private int jefe_proyecto;
	private String cif;
	
	
	// constructor sin parametros 
	
	public proyectos() {
		super();
	}
	// contructor con parametros 
	public proyectos(String id_proyecto, String descripcion, Date fecha_inicio, Date fecha_fin_previsto,
			double venta_previsto, double coste_previsto, double coste_real, String estado, int jefe_proyecto,
			String cif) {
		super();
		this.id_proyecto = id_proyecto;
		this.descripcion = descripcion;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin_previsto = fecha_fin_previsto;
		this.venta_previsto = venta_previsto;
		this.coste_previsto = coste_previsto;
		this.coste_real = coste_real;
		this.estado = estado;
		this.jefe_proyecto = jefe_proyecto;
		this.cif = cif;
	}

//Getter and setter

public String getId_proyecto() {
		return id_proyecto;
	}
	public void setId_proyecto(String id_proyecto) {
		this.id_proyecto = id_proyecto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin_previsto() {
		return fecha_fin_previsto;
	}
	public void setFecha_fin_previsto(Date fecha_fin_previsto) {
		this.fecha_fin_previsto = fecha_fin_previsto;
	}
	public double getVenta_previsto() {
		return venta_previsto;
	}
	public void setVenta_previsto(double venta_previsto) {
		this.venta_previsto = venta_previsto;
	}
	public double getCoste_previsto() {
		return coste_previsto;
	}
	public void setCoste_previsto(double coste_previsto) {
		this.coste_previsto = coste_previsto;
	}
	public double getCoste_real() {
		return coste_real;
	}
	public void setCoste_real(double coste_real) {
		this.coste_real = coste_real;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getJefe_proyecto() {
		return jefe_proyecto;
	}
	public void setJefe_proyecto(int jefe_proyecto) {
		this.jefe_proyecto = jefe_proyecto;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	
		//toString
	
	@Override
	public String toString() {
		return "proyectos [id_proyecto=" + id_proyecto + ", descripcion=" + descripcion + ", fecha_inicio="
				+ fecha_inicio + ", fecha_fin_previsto=" + fecha_fin_previsto + ", venta_previsto=" + venta_previsto
				+ ", coste_previsto=" + coste_previsto + ", coste_real=" + coste_real + ", estado=" + estado
				+ ", jefe_proyecto=" + jefe_proyecto + ", cif=" + cif + "]";
	}
	
	
	// metodos propios 
	
	public double margerPrevisto() {
		return (venta_previsto - coste_previsto);
	}
	
	
	public double margenReal() {
		return (venta_previsto - coste_real);
	}
	
	
	public double  diferenciasGastos() {
		return (coste_real - coste_previsto );
	}
	
	public Date diferenciaFinPrevistoReal() {
		return (fecha_fin_previsto-fecha_inicio);
	}
	
	

}
