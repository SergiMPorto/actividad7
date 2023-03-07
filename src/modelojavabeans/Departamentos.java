package modelojavabeans;

public class Departamentos {
	
	private int id_depar;
	private String nombre;
	private String direccion;
	
	public Departamentos() {
		super();
	}

	public Departamentos(int id_depar, String nombre, String direccion) {
		super();
		this.id_depar = id_depar;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public int getId_depar() {
		return id_depar;
	}

	public void setId_depar(int id_depar) {
		this.id_depar = id_depar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	

}
