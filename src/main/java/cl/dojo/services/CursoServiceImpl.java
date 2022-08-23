package cl.dojo.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.dojo.connection.ConnectionManager;
import cl.dojo.models.Curso;

@Service
public class CursoServiceImpl extends ConnectionManager implements ICursoService{

	public CursoServiceImpl() {
		conn = generaConexion();
		
	}
	
	@Override
	public List<Curso> findAll() {
		List<Curso> cursos = new ArrayList<Curso>();
		String query = "select * from curso"; 
		
		try {
			pstm = this.conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			
			while(rs.next())  {
				Curso curso = new Curso(rs.getInt("codigo_curso"), rs.getString("fecha_inicio"), rs.getString("fecha_termno"),
						rs.getInt("codigo_comuna"), rs.getString("codigo_plan_formativo"));
				cursos.add(curso);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return cursos;
	}

}
