package modelojavabeans;

public abstract class Perfiles {
	private int id_perfil;
	private String nombre;
	
	
	public Perfiles() {
		super();
	}


	public Perfiles(int id_perfil, String nombre) {
		super();
		this.id_perfil = id_perfil;
		this.nombre = nombre;
	}


	public int getId_perfil() {
		return id_perfil;
	}


	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
