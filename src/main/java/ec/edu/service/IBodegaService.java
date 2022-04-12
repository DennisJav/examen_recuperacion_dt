package ec.edu.service;

import ec.edu.modelo.Bodega;

public interface IBodegaService {

	void insertarBodega(Bodega bodega);
	void actualizarBodega(Bodega bodega);
	Bodega buscarBodega(Integer id);
	void borrarBodega(Integer id);
	
}
