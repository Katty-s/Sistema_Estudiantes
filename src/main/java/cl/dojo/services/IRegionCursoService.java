package cl.dojo.services;

import java.util.List;

import cl.dojo.dto.RegionCursoDTO;

public interface IRegionCursoService {

	List<RegionCursoDTO> allRegionCurso();
	List<RegionCursoDTO> findByRegionAndCurso(int codigoRegion, int codigoCurso);
}
