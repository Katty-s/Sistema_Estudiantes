package cl.dojo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import cl.dojo.services.ICursoService;
import cl.dojo.services.IRegionCursoService;
import cl.dojo.services.IRegionService;

@Controller
public class HomeController {

	@Autowired
	ICursoService cursoService;
	
	@Autowired
	IRegionCursoService regionCursoService;
	
	@Autowired
	IRegionService regionService;
	
	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("cursos", cursoService.findAll());
		model.addAttribute("regioncursos", regionCursoService.allRegionCurso());
		model.addAttribute("regiones", regionService.findAll());
		
		return "inicio";
	}
	
	@PostMapping("/home")
	public String filtrar(@RequestParam(name="region")int codigoRegion, @RequestParam(name="curso")int codigoCurso, Model model) {
		
		model.addAttribute("cursos", cursoService.findAll());
		model.addAttribute("regioncursos",regionCursoService.findByRegionAndCurso(codigoRegion, codigoCurso));
		model.addAttribute("regiones", regionService.findAll());
		
		return "inicio";
	}
}
