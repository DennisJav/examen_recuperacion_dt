package ec.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.modelo.Bodega;


@Controller
@RequestMapping("/bodegas/")
public class BodegaController {

	@Autowired
	private Bode
	
	@GetMapping("insertar")
	public String vistaObtenerDatos(Bodega bodega) {
		return "obtenerDatos";
	}
	
	
	
}
