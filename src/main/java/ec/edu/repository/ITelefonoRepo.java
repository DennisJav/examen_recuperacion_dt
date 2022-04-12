package ec.edu.repository;


import ec.edu.modelo.Telefono;

public interface ITelefonoRepo {

	
	void insertarTelefono(Telefono telefono); 
	void actualizarTelefono(Telefono telefono);
	Telefono buscarTelefono(Integer id);
	void borrarTelefono(Integer id);
}
