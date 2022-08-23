package cl.dojo.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.dojo.connection.ConnectionManager;
import cl.dojo.dto.RegionCursoDTO;

@Service
public class RegionCursoServiceImpl extends ConnectionManager implements IRegionCursoService{

	public RegionCursoServiceImpl()  {
		conn = generaConexion();
		
	}

	@Override
	public List<RegionCursoDTO> allRegionCurso() {
		List<RegionCursoDTO> regioncursodto = new ArrayList<RegionCursoDTO>();
		String query = "SELECT estudiante.rut, estudiante.nombre, estudiante.apellido_pat, estudiante.apellido_mat, estudiante.codigo_curso, plan_formativo.descripcion from estudiante "
				+ "JOIN curso ON curso.codigo_curso = estudiante.codigo_curso "
				+ "JOIN plan_formativo ON plan_formativo.codigo_plan_formativo = curso.codigo_plan_formativo ";
		
		try {
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				RegionCursoDTO regioncurso = new RegionCursoDTO(rs.getString("rut"), rs.getString("nombre"), rs.getString("apellido_pat"), rs.getString("apellido_mat"),
						rs.getInt("codigo_curso"), rs.getString("descripcion"));
				regioncursodto.add(regioncurso);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return regioncursodto;
	}

	@Override
	public List<RegionCursoDTO> findByRegionAndCurso(int codigoRegion, int codigoCurso) {
		List<RegionCursoDTO> regioncursodto = new ArrayList<RegionCursoDTO>();
		String query = "SELECT estudiante.rut, estudiante.nombre, estudiante.apellido_pat, estudiante.apellido_mat, estudiante.codigo_curso, plan_formativo.descripcion from estudiante "
				+ "JOIN curso ON curso.codigo_curso = estudiante.codigo_curso " 
				+ "JOIN plan_formativo ON plan_formativo.codigo_plan_formativo = curso.codigo_plan_formativo "
				+ "JOIN comuna ON comuna.codigo_comuna = estudiante.codigo_comuna "
				+ "JOIN region ON region.codigo_region = comuna.codigo_region ";
		
		if(codigoCurso > 0 && codigoRegion > 0 ) {
			query = query +" where curso.codigo_curso = " + codigoCurso;
			query = query +" and region.codigo_region = " + codigoRegion;              
		}else if (codigoCurso == 0 && codigoRegion > 0) { 
			query = query +" where region.codigo_region = " + codigoRegion;
		}else if (codigoCurso > 0 && codigoRegion == 0) { 
			query = query +" where curso.codigo_curso = " + codigoCurso;
		}else { 
			
		}
		
		try {
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				RegionCursoDTO regioncurso = new RegionCursoDTO(rs.getString("rut"), rs.getString("nombre"), rs.getString("apellido_pat"), rs.getString("apellido_mat"),
						rs.getInt("codigo_curso"), rs.getString("descripcion"));
				regioncursodto.add(regioncurso);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return regioncursodto;
	}
	
	

	
	

}
