package cl.dojo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.dojo.dto.RegionCursoDTO;
import cl.dojo.services.IRegionCursoService;

@RestController
public class RegionCursoApi {

	@Autowired
	IRegionCursoService regionCursoService;
	
	@GetMapping("/api/v2/regionescursos")
	public List<RegionCursoDTO> allRegionCursos(){
		
		return regionCursoService.allRegionCurso();
	}
}
