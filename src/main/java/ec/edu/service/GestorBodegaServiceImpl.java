package ec.edu.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Bodega;
import ec.edu.modelo.Inventario;
import ec.edu.modelo.Producto;

@Service
public class GestorBodegaServiceImpl implements IGestorBodegaService{

	@Autowired
	private IInventarioService inventarioService;
	@Autowired
	private IBodegaService bodegaService;
	@Autowired
	private IProductoService productoService;
	
	@Override
	public void insertarInventario(String numeroBodega, String CodigoBarrasMaestro, Integer cantidad) {
		// TODO Auto-generated method stub
		Bodega bodega = this.bodegaService.buscarBodegaNumero(numeroBodega);
		Producto producto = this.productoService.buscarProductoCodigoBarras(CodigoBarrasMaestro);
		Inventario inv = new Inventario();
		String s = String.valueOf((int)(Math.random()*500)+100);
		inv.setCodigoBarrasIndividual(CodigoBarrasMaestro + s );
		inv.setNombreHilo(Thread.currentThread().getName());	
	}

	
	
	
	
}
