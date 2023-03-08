package modelo.daojdbc;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import modelojavabeans.Empleados;
import modelojavabeans.Proyectos;
import modelojavabeans.Proyectos_con_Empleados;

public class Proyecto_Con_EmpleadosDaoImpList extends AbstractDaoMy8 implements Proyecto_Con_EmpleadosDao{

	@Override
	public int altaProyecto(Proyectos_con_Empleados proyecto_empl) {
		sql = "insert into proyectos_con_empleados values(?,?,?,?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, proyecto_empl.getNumero_orden());
			ps.setString(2, proyecto_empl.getId_proyecto().getId_proyecto());
			ps.setInt(3, proyecto_empl.getId_empl().getId_empl());
			ps.setInt(4, proyecto_empl.getHoras_asignadas());	
			ps.setDate(5, (Date) proyecto_empl.getFecha_incorporacion());
			ps.setDouble(6, proyecto_empl.getPrecio_hora());
			filas = ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Proyectos_con_Empleados buscarUno(String id_proyecto) {
		sql = "select * from proyectos_con_clientes where id_proyecto = ?";
		Proyectos_con_Empleados empleado_proye = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id_proyecto);
			rs = ps.executeQuery();
			if (rs.next()) {
				empleado_proye = new Proyectos_con_Empleados();
				empleado_proye.setNumero_orden(rs.getInt("numero_orden"));
				empleado_proye.getId_proyecto().setId_proyecto(rs.getString("id_proyecto"));
				empleado_proye.getId_empl().setId_empl(rs.getInt("id_empl"));
				empleado_proye.setHoras_asignadas(rs.getInt("horas_asignadas"));
		    	empleado_proye.setFecha_incorporacion(rs.getDate("fecha_incorporacion"));
		    	empleado_proye.setPrecio_hora(rs.getDouble("fecha_incorporacion"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empleado_proye;
	}

	@Override
	public List<Proyectos_con_Empleados> empleadosByProyectos(String id_proyecto) {
		sql = "select * from proyecto_con_empleados where id_proyecto = ?";
		List<Proyectos_con_Empleados> lista = new ArrayList<>();

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id_proyecto);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Proyectos_con_Empleados empleado_proye = new Proyectos_con_Empleados();		
				empleado_proye.setNumero_orden(rs.getInt("numero_orden"));
				empleado_proye.getId_proyecto().setId_proyecto(rs.getString("id_proyecto"));
				empleado_proye.getId_empl().setId_empl(rs.getInt("id_empl"));
				empleado_proye.setHoras_asignadas(rs.getInt("horas_asignadas"));
		    	empleado_proye.setFecha_incorporacion(rs.getDate("fecha_incorporacion"));
		    	empleado_proye.setPrecio_hora(rs.getDouble("precio_hora"));
		    	lista.add(empleado_proye);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	
	@Override
	public int horasAsignadasAlProyecto(String id_proyecto) {
		int sumaHoras = 0;
	    String sql = "SELECT SUM(horas_asignadas) FROM proyectos_con_empleados WHERE id_proyecto = ?";
	    try  {
	    	ps = conn.prepareStatement(sql);
	        ps.setString(1, id_proyecto);
	        rs = ps.executeQuery();
	        
	            if (rs.next()) {
	                sumaHoras = rs.getInt(1);
	            
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return sumaHoras;
	}

	@Override
	public double costeActualDeProyecto(String id_proyecto) {
		double costeTotal = 0.0;
	    String sql = "SELECT * FROM proyectos_con_empleados WHERE id_proyecto = ?";
	     
	    try  {
	    	ps = conn.prepareStatement(sql);
	        ps.setString(1, id_proyecto);
	        rs = ps.executeQuery();
	        while (rs.next()) {
	        	
	            int horasAsignadas = rs.getInt("horas_asignadas");
	            double precioHora = rs.getDouble("precio_hora");
	            costeTotal += horasAsignadas * precioHora;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return costeTotal;
	}

	@Override
	public double margenActualdelProyecto(String id_proyecto) {
		double margenActual = 0.0;
		String sql = "SELECT * FROM proyectos WHERE id_proyecto = ?";
	     
	    try  {
	    	ps = conn.prepareStatement(sql);
	        ps.setString(1, id_proyecto);
	        rs = ps.executeQuery();
	        while (rs.next()) {
	        	
	            double ventaPrevisto = rs.getDouble("venta_previsto");
	            double costeReal = rs.getDouble("coste_real");
	            margenActual += ventaPrevisto - costeReal;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return margenActual;
	}

	@Override
	public int asignarEmpleadosAProyecto(List<Proyectos_con_Empleados> lista) {
		int filas = 0;
	    String sql = "INSERT INTO proyectos_con_empleados VALUES (?, ?, ?, ?, ?)";
	    try  {
	    	ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
	        for (Proyectos_con_Empleados eep : lista) {
	            ps.setInt(1, eep.getNumero_orden());
	            ps.setString(2, eep.getId_proyecto().getId_proyecto());
	            ps.setInt(3, eep.getId_empl().getId_empl());
	            ps.setInt(4, eep.getHoras_asignadas());    
	            ps.setDate(5, (Date) eep.getFecha_incorporacion());
	            ps.setDouble(6, eep.getPrecio_hora());
	            filas += ps.executeUpdate();
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return filas;
	}

}