package cl.dojo.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.dojo.connection.ConnectionManager;
import cl.dojo.models.Region;

@Service
public class RegionServiceImpl extends ConnectionManager implements IRegionService{
	
	
	public RegionServiceImpl() {
		conn = generaConexion();
		
	}

	@Override
	public List<Region> findAll() {
		List<Region> region = new ArrayList<Region>();
		String query = "select * from region"; 
		
		try {
			pstm = this.conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while(rs.next())  {
				Region regiones = new Region(rs.getInt("codigo_region"), rs.getString("nombre")); 
		
				region.add(regiones);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return region;
	}

}
