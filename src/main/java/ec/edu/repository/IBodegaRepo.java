package ec.edu.repository;

import ec.edu.modelo.Bodega;


public interface IBodegaRepo {
	//METODOS CRUD 
	void insertarBodega(Bodega bodega);
	void actualizarBodega(Bodega bodega);
	Bodega buscarBodega(Integer id);
	void borrarBodega(Integer id);
	
	
}
