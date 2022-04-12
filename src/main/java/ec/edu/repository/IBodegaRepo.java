package ec.edu.repository;

import java.util.List;

import ec.edu.modelo.Bodega;


public interface IBodegaRepo {
	//METODOS CRUD 
	void insertarBodega(Bodega bodega);
	void actualizarBodega(Bodega bodega);
	Bodega buscarBodega(Integer id);
	void borrarBodega(Integer id);
	Bodega buscarBodegaNumero(String numero);
	List<Bodega> listaBodegas();
	
}
