package modelo.daojdbc;

import java.sql.SQLException;
<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> Sergi
import java.util.List;

import modelojavabeans.Empleados;

public class EmpleadoDaoImplList extends AbstractDaoMy8 implements EmpleadoDao {


	@Override
	public int altaEmpleado(Empleados empleado) {
	sql="insert into empleado values (?,?,?,?,?,?,?,?,?,?,?)";
	
	try {
		ps=conn.prepareStatement(sql);
		ps.setInt(1, empleado.getId_empl());
		ps.setString(2, empleado.getNombre());
		ps.setString(3, empleado.getApellidos());
		ps.setCharacterStream(4, empleado.getGenero());
		ps.setString(5, empleado.getMail());
		ps.setString(6, empleado.getPwd());
		ps.setDouble(7, empleado.getSalario());
		ps.setDate(8, empleado.getFecha_ingreso());
		ps.setDate(9, empleado.getFecha_nacimiento());
		ps.setString(10, empleado.getId_perfil());
		ps.setString(11, empleado.getId_depar());
		filas = ps.executeUpdate();
		filas=1;
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return filas;
}

		
	
	
	



	@Override
	public Empleados buscarUno(int id_empl) {
		sql="select * from empleados where id_empl = ?";
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
	return empleado;
	}
	
	
=======
	
		@Override
		public int altaEmpleado(Empleados empleado) {
		sql="insert into empleado values (?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, empleado.getId_empl());
			ps.setString(2, empleado.getNombre());
			ps.setString(3, empleado.getApellidos());
			ps.setCharacterStream(4, empleado.getGenero());
			ps.setString(5, empleado.getMail());
			ps.setString(6, empleado.getPwd());
			ps.setDouble(7, empleado.getSalario());
			ps.setDate(8, empleado.getFecha_ingreso());
			ps.setDate(9, empleado.getFecha_nacimiento());
			ps.setString(10, empleado.getId_perfil());
			ps.setString(11, empleado.getId_depar());
			filas = ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return filas;
	}
		@Override
		public Empleados buscarUno(String id_empl) {
			sql="select * from empleados where id_empl = ?";
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
			    	
		
	
	}

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
		return empleado;
		}

	
	}

	