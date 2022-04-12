package ec.edu.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.modelo.Bodega;
import ec.edu.modelo.Producto;
import ec.edu.service.IBodegaService;
import ec.edu.service.IProductoService;


@Controller
@RequestMapping("/productos/")

public class ProductoController {

	@Autowired
	private IBodegaService bodegaService;
	@Autowired
	private IProductoService productoService;
	
	
	@GetMapping("productoNuevo")
	public String vistaObtenerDatos(Producto producto) {
		return "obtenerDatosProducto";
	}
	
	@PostMapping("insertarProducto")
	public String insertarBodega(Producto producto, BindingResult result, Model model) {
		producto.setStock(new BigDecimal(0));
		this.productoService.insertarProducto(producto);
		return "productoRegistradoNotify";
	}
	
	
	
	
	@GetMapping("buscarProductos")
	public String mostrarTodos(Producto producto) {
		return "mostrarProductos";
	}

	@GetMapping("resultado")
	public String buscarTodos(Producto producto, Model modelo) {
		List<Producto> productosDisponibles = this.productoService.listaProductos();
		modelo.addAttribute("productosDisponibles", productosDisponibles);
		
		return "listaProductos";
	}
	
	@DeleteMapping("Eliminar/{idProducto}")
	public String eliminarProducto(@PathVariable("idProducto") Integer idProducto, Model modelo) {
		this.productoService.borrarProducto(idProducto);	
		List<Producto> productosDisponibles = this.productoService.listaProductos();
		modelo.addAttribute("productosDisponibles", productosDisponibles);
		return "listaProductos";
	}
	

	
	
	

}
