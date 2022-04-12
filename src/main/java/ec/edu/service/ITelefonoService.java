package ec.edu.service;

import ec.edu.modelo.Telefono;


public interface ITelefonoService {
	void insertarTelefono(Telefono telefono); 
	void actualizarTelefono(Telefono telefono);
	Telefono buscarTelefono(Integer id);
	void borrarTelefono(Integer id);
}
