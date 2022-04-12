package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Producto;
import ec.edu.repository.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo productoRepo;
	
	@Override
	public void insertarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.insertarProducto(producto);
	}

	@Override
	public void actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.actualizarProducto(producto);
	}

	@Override
	public Producto buscarProducto(Integer id) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarProducto(id);
	}

	@Override
	public void borrarProducto(Integer id) {
		// TODO Auto-generated method stub
		this.productoRepo.borrarProducto(id);
	}

	
	
}
