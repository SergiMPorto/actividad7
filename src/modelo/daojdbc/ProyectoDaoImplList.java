package modelo.daojdbc;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


import modelojavabeans.Proyectos;

public class ProyectoDaoImplList extends AbstractDaoMy8 implements ProyectoDao {

	@Override
	public int altaProyecto(Proyectos proyecto) {
		sql = "insert into proyectos values(?,?,?,?,?,?,?,?,?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, proyecto.getId_proyecto());
			ps.setString(2, proyecto.getDescripcion());
			ps.setDate(3, proyecto.getFecha_inicio());
			ps.setDate(4, proyecto.getFecha_fin_previsto());
			ps.setDate(5,proyecto.getFecha_fin_real());
			ps.setDouble(6, proyecto.getVenta_previsto());
			ps.setDouble(7, proyecto.getCoste_previsto());
			ps.setDouble(8, proyecto.getCoste_real());
			ps.setString(9, proyecto.getEstado());
			ps.setInt(10, proyecto.getJefe_proyecto());
			ps.setString(11, proyecto.getCif());
			filas = ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Proyectos buscarUno(String id_proyecto) {
		sql = "select * from clientes where id_proyecto = ?";
		Proyectos pr = null;
		//OficinaDao odao = new OficinaDaoImplMy8();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id_proyecto);
			rs = ps.executeQuery();
			if (rs.next()) {
				pr = new Proyectos();
				pr.setId_proyecto(rs.getString("id_proyecto"));
				pr.setDescripcion(rs.getString("descripcion"));
				pr.setFecha_inicio(rs.getDate("fecha_inicio"));
				pr.setFecha_fin_previsto(rs.getDate("fecha_fin_previsto"));
				pr.setFecha_fin_real(rs.getDate("fecha_fin_real"));
				pr.setVenta_previsto(rs.getDouble("venta_previsto"));
				pr.setCoste_previsto(rs.getInt("costes_previsto"));
				pr.setCoste_real(rs.getInt("coste_real"));
				pr.setEstado(rs.getString("estado"));
				pr.setJefe_proyecto(rs.getInt("jefe_proyecto"));
				pr.setCif(rs.getString("cif"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pr;
	}

	@Override
	public List<Proyectos> buscarTodos() {
		sql = "select * from proyectos";
		List<Proyectos> lista = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				Proyectos pr = new Proyectos();
				pr.setId_proyecto(rs.getString("id_proyecto"));
				pr.setDescripcion(rs.getString("descripcion"));
				pr.setFecha_inicio(rs.getDate("fecha_inicio"));
				pr.setFecha_fin_previsto(rs.getDate("fecha_fin_previsto"));
				pr.setFecha_fin_real(rs.getDate("fecha_fin_real"));
				pr.setVenta_previsto(rs.getDouble("venta_previsto"));
				pr.setCoste_previsto(rs.getInt("costes_previsto"));
				pr.setCoste_real(rs.getInt("coste_real"));
				pr.setEstado(rs.getString("estado"));
				pr.setJefe_proyecto(rs.getInt("jefe_proyecto"));
				pr.setCif(rs.getString("cif"));
				lista.add(pr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Proyectos> proyectosByEstado(String estado) {
		sql = "select * from proyectos where estado = ?";
		List<Proyectos> lista = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, estado);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Proyectos pr = new Proyectos();
				pr.setId_proyecto(rs.getString("id_proyecto"));
				pr.setDescripcion(rs.getString("descripcion"));
				pr.setFecha_inicio(rs.getDate("fecha_inicio"));
				pr.setFecha_fin_previsto(rs.getDate("fecha_fin_previsto"));
				pr.setFecha_fin_real(rs.getDate("fecha_fin_real"));
				pr.setVenta_previsto(rs.getDouble("venta_previsto"));
				pr.setCoste_previsto(rs.getInt("costes_previsto"));
				pr.setCoste_real(rs.getInt("coste_real"));
				pr.setEstado(rs.getString("estado"));
				pr.setJefe_proyecto(rs.getInt("jefe_proyecto"));
				pr.setCif(rs.getString("cif"));
				lista.add(pr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Proyectos> proyectosByCliente(String cif) {
		sql = "select * from proyectos where cif = ?";
		List<Proyectos> lista = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cif);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Proyectos pr = new Proyectos();
				pr.setId_proyecto(rs.getString("id_proyecto"));
				pr.setDescripcion(rs.getString("descripcion"));
				pr.setFecha_inicio(rs.getDate("fecha_inicio"));
				pr.setFecha_fin_previsto(rs.getDate("fecha_fin_previsto"));
				pr.setFecha_fin_real(rs.getDate("fecha_fin_real"));
				pr.setVenta_previsto(rs.getDouble("venta_previsto"));
				pr.setCoste_previsto(rs.getInt("costes_previsto"));
				pr.setCoste_real(rs.getInt("coste_real"));
				pr.setEstado(rs.getString("estado"));
				pr.setJefe_proyecto(rs.getInt("jefe_proyecto"));
				pr.setCif(rs.getString("cif"));
				lista.add(pr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Proyectos> proyectosByJefeProyectosAndByEstado(int jefeProyecto, String estado) {
		sql = "SELECT * FROM proyectos WHERE jefe_proyecto=? AND estado=?";
		List<Proyectos> lista = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, jefeProyecto);
			ps.setString(2, estado);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Proyectos pr = new Proyectos();
				pr.setId_proyecto(rs.getString("id_proyecto"));
				pr.setDescripcion(rs.getString("descripcion"));
				pr.setFecha_inicio(rs.getDate("fecha_inicio"));
				pr.setFecha_fin_previsto(rs.getDate("fecha_fin_previsto"));
				pr.setFecha_fin_real(rs.getDate("fecha_fin_real"));
				pr.setVenta_previsto(rs.getDouble("venta_previsto"));
				pr.setCoste_previsto(rs.getInt("costes_previsto"));
				pr.setCoste_real(rs.getInt("coste_real"));
				pr.setEstado(rs.getString("estado"));
				pr.setJefe_proyecto(rs.getInt("jefe_proyecto"));
				pr.setCif(rs.getString("cif"));
				lista.add(pr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public double importesVentasProyectosTerminados(String estado, String id_proyecto) {
		double importeTotal = 0.0;
		String sql = "SELECT SUM(venta_real) AS total_ventas FROM proyectos WHERE estado = 'terminado' AND venta_real IS NOT NULL";
		 try {
			 	ps = conn.prepareStatement(sql);
				
				rs = ps.executeQuery();
		        if (rs.next()) {
		              importeTotal = rs.getDouble("total_ventas");
		        }
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return importeTotal;
	}

	@Override
	public double margenBrutosProyectosTerminados(String estado, String id_proyecto) {
		double margenBruto = 0.0;
		String sql = "SELECT SUM(venta_real - coste_real) AS margen_bruto FROM proyectos WHERE estado = 'terminado' AND venta_real IS NOT NULL AND coste_real IS NOT NULL";
		 try {
			 	ps = conn.prepareStatement(sql);
				
				rs = ps.executeQuery();
		        if (rs.next()) {
		        	margenBruto = rs.getDouble("margen_bruto");
		        }
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return margenBruto;
	}

	@Override
	public int diasATerminoProyectoActivo(String codigoProyecto) {
		int diasRestantes = -1;
		String sql = "SELECT fecha_fin_previsto FROM proyectos WHERE id_proyecto = ?";
		 try {
			 	ps = conn.prepareStatement(sql);
			 	ps.setString(1, codigoProyecto);
				rs = ps.executeQuery();
				if (rs.next()) {
					// Este bloque de codigo está sacado de internet
				}
		            LocalDate fechaFinPrevista = rs.getDate("fecha_fin_previsto").toLocalDate();
		            if (fechaFinPrevista.isAfter(LocalDate.now())) {
		                diasRestantes = (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaFinPrevista);
		            }
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return diasRestantes;
	}

}
