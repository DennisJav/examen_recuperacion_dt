package ec.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.modelo.Bodega;
import ec.edu.modelo.Inventario;
import ec.edu.service.IBodegaService;
import ec.edu.service.IGestorBodegaService;


@Controller
@RequestMapping("/bodegas/")
public class BodegaController {

	@Autowired
	private IBodegaService bodegaService;
	@Autowired
	private IGestorBodegaService gestorBodegaService;
	
	
	@GetMapping("bodegaNueva")
	public String vistaObtenerDatos(Bodega bodega) {
		return "obtenerDatos";
	}
	
	@PostMapping("insertarBodega")
	public String insertarBodega(Bodega bodega, BindingResult result, Model model) {
		this.bodegaService.insertarBodega(bodega);
		return "bodegaRegistradaNotify";
	}
	
	@GetMapping("inventarioNuevo")
	public String vistaObtenerDatosInventario(Inventario inventario) {
		return "obtenerDatos";
	}
	
	@PostMapping("insertarBodega")
	public String insertarInventario(Inventario inventario, BindingResult result, Model model) {
		
		Bodega b = this.bodegaService.
		
		this.gestorBodegaService.insertarInventario(null, null, null);
		return "bodegaRegistradaNotify";
	}
	
}
