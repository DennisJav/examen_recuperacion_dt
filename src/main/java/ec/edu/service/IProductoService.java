package ec.edu.service;

import ec.edu.modelo.Producto;

public interface IProductoService {

	void insertarProducto(Producto producto); 
	void actualizarProducto(Producto producto);
	Producto buscarProducto(Integer id);
	void borrarProducto(Integer id);
	
}
