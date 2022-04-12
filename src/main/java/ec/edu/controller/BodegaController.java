package ec.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.modelo.Bodega;
import ec.edu.service.IBodegaService;


@Controller
@RequestMapping("/bodegas/")
public class BodegaController {

	@Autowired
	private IBodegaService bodegaService;
	
	@GetMapping("bodegaNueva")
	public String vistaObtenerDatos(Bodega bodega) {
		return "obtenerDatos";
	}
	
	@PostMapping("insertarBodega")
	public String insertarBodega(Bodega bodega, BindingResult result, Model model) {
		this.bodegaService.insertarBodega(bodega);
		return "bodegaRegistradaNotify";
	}
	
	
	
}
