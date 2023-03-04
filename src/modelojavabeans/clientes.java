package modelojavabeans;

public class Clientes {
	
	private String cif;
	private String nombre;
	private String apellidos;
	private String direccion;
	private double facturacion_anual;
	private int numero_empleado;
	
	
	public Clientes() {
		super();
	}


	public Clientes(String cif, String nombre, String apellidos, String direccion, double facturacion_anual,
			int numero_empleado) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.facturacion_anual = facturacion_anual;
		this.numero_empleado = numero_empleado;
	}


	public String getCif() {
		return cif;
	}


	public void setCif(String cif) {
		this.cif = cif;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public double getFacturacion_anual() {
		return facturacion_anual;
	}


	public void setFacturacion_anual(double facturacion_anual) {
		this.facturacion_anual = facturacion_anual;
	}


	public int getNumero_empleado() {
		return numero_empleado;
	}


	public void setNumero_empleado(int numero_empleado) {
		this.numero_empleado = numero_empleado;
	}
	
	

}
