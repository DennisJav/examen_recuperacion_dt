package ec.edu.repository;

import ec.edu.modelo.Inventario;

public interface IInventarioRepo {

	void crearInventario(Inventario inventario);
	void actualizaInventario(Inventario inventario);
	void borrarInventario(Integer id);
	Inventario buscarInventario(Integer id);
	Inventario buscarCodigoBarras(String codigoBarrasIndividual);
	
	
}
