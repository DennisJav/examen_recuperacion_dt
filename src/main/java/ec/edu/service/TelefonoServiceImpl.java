package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Telefono;

@Service
public class TelefonoServiceImpl implements ITelefonoService{

	@Autowired
	private ITelefonoService telefonoService;
	@Override
	public void insertarTelefono(Telefono telefono) {
		// TODO Auto-generated method stub
		this.telefonoService.insertarTelefono(telefono);
	}

	@Override
	public void actualizarTelefono(Telefono telefono) {
		// TODO Auto-generated method stub
		this.telefonoService.actualizarTelefono(telefono);
	}

	@Override
	public Telefono buscarTelefono(Integer id) {
		// TODO Auto-generated method stub
		return this.telefonoService.buscarTelefono(id);
	}

	@Override
	public void borrarTelefono(Integer id) {
		// TODO Auto-generated method stub
		this.telefonoService.borrarTelefono(id);
	}

	
}
