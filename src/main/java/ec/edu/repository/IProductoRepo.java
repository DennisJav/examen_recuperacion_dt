package ec.edu.repository;

import ec.edu.modelo.Producto;

public interface IProductoRepo {

	void insertarProducto(Producto producto); 
	void actualizarProducto(Producto producto);
	Producto buscarProducto(Integer id);
	void borrarProducto(Integer id);
	
}
