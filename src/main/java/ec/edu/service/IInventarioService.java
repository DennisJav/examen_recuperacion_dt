package ec.edu.service;

import ec.edu.modelo.Inventario;

public interface IInventarioService {
	void crearInventario(Inventario inventario);
	void actualizaInventario(Inventario inventario);
	void borrarInventario(Integer id);
	Inventario buscarInventario(Integer id);
	Inventario buscarCodigoBarras(String codigoBarrasIndividual);
}
