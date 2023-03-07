package modelojavabeans;

import java.util.Date;

public class Empleados {
	
	private int id_empl;
	private String nombre;
	private String apellidos;
	private char genero; 
	private String mail;
	private String pwd;
	private double salario;
	private Date fecha_ingreso;
	private Date fecha_nacimiento;
	Perfiles id_perfil;
	Departamentos id_depar;
	
	
	//Constructor  sin parametros

	public Empleados() {
		super();
	}
	//Constructor con parametros. 

public Empleados(int id_empl, String nombre, String apellidos, char genero, String mail, String pwd, double salario,
			Date fecha_ingreso, Date fecha_nacimiento, Perfiles id_perfil, Departamentos id_depar) {
		super();
		this.id_empl = id_empl;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.mail = mail;
		this.pwd = pwd;
		this.salario = salario;
		this.fecha_ingreso = fecha_ingreso;
		this.fecha_nacimiento = fecha_nacimiento;
		this.id_perfil = id_perfil;
		this.id_depar = id_depar;
	}


		// getter and setter
		public int getId_empl() {
			return id_empl;
		}
		
		public void setId_empl(int id_empl) {
			this.id_empl = id_empl;
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
		
		public char getGenero() {
			return genero;
		}
		
		public void setGenero(char genero) {
			this.genero = genero;
		}
		
		public String getMail() {
			return mail;
		}
		
		public void setMail(String mail) {
			this.mail = mail;
		}
		
		public String getPwd() {
			return pwd;
		}
		
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		
		public double getSalario() {
			return salario;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		public Date getFecha_ingreso() {
			return fecha_ingreso;
		}
		
		public void setFecha_ingreso(Date fecha_ingreso) {
			this.fecha_ingreso = fecha_ingreso;
		}
		
		public Date getFecha_nacimiento() {
			return fecha_nacimiento;
		}
		
		public void setFecha_nacimiento(Date fecha_nacimiento) {
			this.fecha_nacimiento = fecha_nacimiento;
		}
		
		public Perfiles getId_perfil() {
			return id_perfil;
		}
		
		public void setId_perfil(Perfiles id_perfil) {
			this.id_perfil = id_perfil;
		}
		
		public Departamentos getId_depar() {
			return id_depar;
		}
		
		public void setId_depar(Departamentos id_depar) {
			this.id_depar = id_depar;
		}


	
//to string 
	@Override
	public String toString() {
		return "empleados [id_empl=" + id_empl + ", nombre=" + nombre + ", apellidos=" + apellidos + ", pwd=" + pwd
				+ ", salario=" + salario + ", fecha_ingreso=" + fecha_ingreso + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", id_perfil=" + id_perfil + ", id_depar=" + id_depar + "]";
	}
	
	

	//Métodos
	
		
		public double salarioBruto() {
			//Sumamos el salario más la comisión para obtener el salario bruto total
			return salario;
		}
		

		public double salarioMensual (int meses) {
			/* Sumamos el salario más la comisión para obtener el salario bruto 
			 * y luego lo dividimos entre el número de meses
			 */
			return (salario)/12;//Echar un ojo
			//return (salario+comisión) / meses;
		}
		
		
		
		
		public String literalSexo() {
			/*
			 * Comprobamos el contenido de la variable char 
			 * Comparamos si está en mayúscula o en minúscula para evitar fallos
			 * Si la letra introducida no correspone con ninguna de las que nos interesa 
			 * devolvemos un error
			 */
			if(this.genero == 'h' || this.genero == 'H') {
				return "Hombre";
			}
			else if (this.genero == 'm' || this.genero == 'M') {
				return "Mujer";
			}
			else {
				return "Error en el sexo introducido";
			}
		}
		
		public String nombreCompleto() {
			/*
			 * Concatenamos el nombre y los apellidos con un espacio entre ellos
			 */
			return nombre + " " + apellidos;
		}
		
		
		public String obtenerEmail() {
			/*
			 * Recogemos la primera letra del nombre
			 * Luego recogemos las letras del primer apellido, paramos cuándo el bucle encuentre un espacio en blanco
			 * Concatenamos la primera letra del nombre y el primer apellido y le añadimos @gmail.com para completar el email
			 * con el método toLowerCase convertimos todas las letras a minúscula
			 */
			String apellido = "";
			char letraNombre = this.nombre.charAt(0);
			for (int i = 0; i < this.apellidos.length(); i++) {
				if (this.apellidos.charAt(i) != ' ') {
					apellido += String.valueOf(this.apellidos.charAt(i));
				}
				else {
					break;
				}
			}
			
			return (String.valueOf(letraNombre) + apellido + "@gmail.com").toLowerCase();	
		}
			
		
	}

