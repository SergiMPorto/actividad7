package modelo.daojdbc;

import java.sql.Date;
import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

import modelojavabeans.Empleados;
import modelojavabeans.Perfiles;
import modelojavabeans.Proyectos;
import modelojavabeans.Departamentos;

public class EmpleadoDaoImplList extends AbstractDaoMy8 implements EmpleadoDao {


		@Override
		public int altaEmpleado(Empleados empleado) {
		sql="insert into empleado values (?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, empleado.getId_empl());
			ps.setString(2, empleado.getNombre());
			ps.setString(3, empleado.getApellidos());
			ps.setString(4, String.valueOf(empleado.getGenero()));
			ps.setString(5, empleado.getMail());
			ps.setString(6, empleado.getPwd());
			ps.setDouble(7, empleado.getSalario());
			ps.setDate(8, (Date) empleado.getFecha_ingreso());
			ps.setDate(9, (Date) empleado.getFecha_nacimiento());
			ps.setInt(10, empleado.getId_perfil().getId_perfil());
			ps.setInt(11, empleado.getId_depar().getId_depar());
			filas = ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return filas;
	}

<<<<<<< HEAD

	@Override
	public List<Empleados> buscarTodos() {
		sql= "select * from empleados";
		List<Empleados> lista = new ArrayList<> ();
		try {
		ps= conn.prepareStatement(sql);
			   
			    rs = ps.executeQuery();
			    while(rs.next()) {
			    	Empleados empleado = new Empleados();
			    	empleado.setId_empl(rs.getInt("id_empl"));
			    	empleado.setNombre(rs.getString("Nombre"));
			    	empleado.setApellidos(rs.getString("apellidos"));
			    	empleado.setGenero(rs.getCharacterStream("genero"));
			    	empleado.setMail(rs.getString("email"));
			    	empleado.setPwd(rs.getString("password"));
			    	empleado.setSalario(rs.getDouble("salario"));
			    	empleado.setFecha_ingreso(rs.getDate("fecha_ingreso"));
			    	empleado.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
			    	empleado.setId_perfil(rs.getString("id_perfil"));
			    	empleado.setId_depar(rs.getString("id_departamento"));
			    }
				} catch (SQLException e) {
						
						e.printStackTrace();
					}
					return lista;
					}
			    	
=======
>>>>>>> 05ac9f372699c3de1595550ab5f3dae7387c515f
		
	

<<<<<<< HEAD
	@Override
	public List<Empleados> empleadosByDepartamentos(int id_depar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleados> empleadosBySexo(char sexo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleados> empleadosByApellidos(String apellidos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double salarioTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double salarioTotalDepartamento(int id_depar) {
		// TODO Auto-generated method stub
		return 0;
	}









	@Override
	public Empleados buscarUno(String id_empl) {
		sql="select * from empleados where id_empl = ?";
=======
		@Override
		public Empleados buscarUno(int id_empl) {
			sql="select * from empleados where id_empl = ?";
>>>>>>> 05ac9f372699c3de1595550ab5f3dae7387c515f
		Empleados empleado =null;
		try {
			ps= conn.prepareStatement(sql);
		    ps.setInt(1, id_empl);
		    rs = ps.executeQuery();
		    if(rs.next()) {
		    	empleado = new Empleados();
		    	empleado.setId_empl(rs.getInt("id_empl"));
		    	empleado.setNombre(rs.getString("Nombre"));
		    	empleado.setApellidos(rs.getString("apellidos"));
		    	empleado.setGenero(rs.getString("genero").charAt(0));
		    	empleado.setMail(rs.getString("email"));
		    	empleado.setPwd(rs.getString("password"));
		    	empleado.setSalario(rs.getDouble("salario"));
		    	empleado.setFecha_ingreso(rs.getDate("fecha_ingreso"));
		    	empleado.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
		    	empleado.getId_perfil().setId_perfil(rs.getInt("id_perfil"));
		    	empleado.getId_depar().setId_depar(rs.getInt("id_departamento"));
		    	
		    	}
		    
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		
			return empleado;
		}
	


		@Override
		public List<Empleados> buscarTodos() {
			sql= "select * from empleados";
			List<Empleados> lista = new ArrayList<> ();
			try {
			ps= conn.prepareStatement(sql);
				   
				    rs = ps.executeQuery();
				    while(rs.next()) {
				    	Empleados empleado = new Empleados();
				    	empleado = new Empleados();
				    	empleado.setId_empl(rs.getInt("id_empl"));
				    	empleado.setNombre(rs.getString("Nombre"));
				    	empleado.setApellidos(rs.getString("apellidos"));
				    	empleado.setGenero(rs.getString("genero").charAt(0));
				    	empleado.setMail(rs.getString("email"));
				    	empleado.setPwd(rs.getString("password"));
				    	empleado.setSalario(rs.getDouble("salario"));
				    	empleado.setFecha_ingreso(rs.getDate("fecha_ingreso"));
				    	empleado.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
				    	empleado.getId_perfil().setId_perfil(rs.getInt("id_perfil"));
				    	empleado.getId_depar().setId_depar(rs.getInt("id_departamento"));
				    	lista.add(empleado);
				    }
				} catch (SQLException e) {
						e.printStackTrace();
					}
			return lista;
		}
	
	
			    	
	@Override
	public List<Empleados> empleadosByDepartamentos(int id_depar) {
		sql = "select * from empleados where id_depar = ?";
		List<Empleados> lista = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id_depar);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Empleados empleado = new Empleados();		
		    	empleado.setId_empl(rs.getInt("id_empl"));
		    	empleado.setNombre(rs.getString("Nombre"));
		    	empleado.setApellidos(rs.getString("apellidos"));
		    	empleado.setGenero(rs.getString("genero").charAt(0));
		    	empleado.setMail(rs.getString("email"));
		    	empleado.setPwd(rs.getString("password"));
		    	empleado.setSalario(rs.getDouble("salario"));
		    	empleado.setFecha_ingreso(rs.getDate("fecha_ingreso"));
		    	empleado.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
		    	empleado.getId_perfil().setId_perfil(rs.getInt("id_perfil"));
		    	empleado.getId_depar().setId_depar(rs.getInt("id_departamento"));
		    	lista.add(empleado);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Empleados> empleadosBySexo(char sexo) {
		sql = "select * from empleados where genero = ?";
		List<Empleados> lista = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, sexo);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Empleados empleado = new Empleados();		
		    	empleado.setId_empl(rs.getInt("id_empl"));
		    	empleado.setNombre(rs.getString("Nombre"));
		    	empleado.setApellidos(rs.getString("apellidos"));
		    	empleado.setGenero(rs.getString("genero").charAt(0));
		    	empleado.setMail(rs.getString("email"));
		    	empleado.setPwd(rs.getString("password"));
		    	empleado.setSalario(rs.getDouble("salario"));
		    	empleado.setFecha_ingreso(rs.getDate("fecha_ingreso"));
		    	empleado.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
		    	empleado.getId_perfil().setId_perfil(rs.getInt("id_perfil"));
		    	empleado.getId_depar().setId_depar(rs.getInt("id_departamento"));
		    	lista.add(empleado);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Empleados> empleadosByApellidos(String apellidos) {
		sql = "select * from empleados where apellidos = ?";
		List<Empleados> lista = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, apellidos);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Empleados empleado = new Empleados();		
		    	empleado.setId_empl(rs.getInt("id_empl"));
		    	empleado.setNombre(rs.getString("Nombre"));
		    	empleado.setApellidos(rs.getString("apellidos"));
		    	empleado.setGenero(rs.getString("genero").charAt(0));
		    	empleado.setMail(rs.getString("email"));
		    	empleado.setPwd(rs.getString("password"));
		    	empleado.setSalario(rs.getDouble("salario"));
		    	empleado.setFecha_ingreso(rs.getDate("fecha_ingreso"));
		    	empleado.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
		    	empleado.getId_perfil().setId_perfil(rs.getInt("id_perfil"));
		    	empleado.getId_depar().setId_depar(rs.getInt("id_departamento"));
		    	lista.add(empleado);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public double salarioTotal() {
		double salarioTotal = 0.0;
	    String sql ="SELECT SUM(venta_real) AS total_ventas FROM empleados";
	    try {
	        ps = conn.prepareStatement(sql);	        
	        rs = ps.executeQuery();
	        if (rs.next()) {
	            salarioTotal = rs.getDouble("salario_total");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return salarioTotal;
	}

	@Override
	public double salarioTotalDepartamento(int id_depar) {
		 double totalSalarios = 0;
		    String sql = "SELECT salario FROM empleado WHERE id_depar = ?";
		    try {
		        ps = conn.prepareStatement(sql);
		        ps.setInt(1, id_depar);
		        rs = ps.executeQuery();
		        while (rs.next()) {
		            double salario = rs.getDouble("salario");
		            totalSalarios += salario;
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return totalSalarios;
	}
	
}

	
<<<<<<< HEAD
	}
=======









>>>>>>> 05ac9f372699c3de1595550ab5f3dae7387c515f

	