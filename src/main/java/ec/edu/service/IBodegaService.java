package ec.edu.service;

import java.util.List;

import ec.edu.modelo.Bodega;

public interface IBodegaService {

	void insertarBodega(Bodega bodega);
	void actualizarBodega(Bodega bodega);
	Bodega buscarBodega(Integer id);
	void borrarBodega(Integer id);
	void registrarBodegaVariosTelefonos(Bodega bodega);
	Bodega buscarBodegaNumero(String numero);
	List<Bodega> listaBodegas();
}
