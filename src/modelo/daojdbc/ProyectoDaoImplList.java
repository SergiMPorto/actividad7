package modelo.daojdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import modelo.javabean.Cliente;
import modelojavabeans.Proyectos;

public class ProyectoDaoImplList extends AbstractDaoMy8 implements ProyectoDao {

	@Override
	public int altaProyecto(Proyectos proyecto) {
		sql = "insert into clientes values(?,?,?,?,?,?,?,?,?,?,?)";
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
		sql = "select * from clientes where id_cliente = ?";
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
		sql = "select * from clientes";
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyectos> proyectosByCliente(String cif) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyectos> proyectosByJefeProyectosAndByEstado(int jefeProyecto, String estado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double importesVentasProyectosTerminados(String estado, String id_proyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double margenBrutosProyectosTerminados(String estado, String id_proyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int diasATerminoProyectoActivo(String codigoProyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
