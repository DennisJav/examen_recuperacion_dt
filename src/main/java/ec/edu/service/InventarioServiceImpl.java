package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Inventario;
import ec.edu.repository.IInventarioRepo;

@Service
public class InventarioServiceImpl implements IInventarioService{

	@Autowired
	private IInventarioRepo inventarioRepo;

	@Override
	public void crearInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		this.inventarioRepo.crearInventario(inventario);
	}

	@Override
	public void actualizaInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		this.inventarioRepo.actualizaInventario(inventario);
	}

	@Override
	public void borrarInventario(Integer id) {
		// TODO Auto-generated method stub
		this.inventarioRepo.borrarInventario(id);
	}

	@Override
	public Inventario buscarInventario(Integer id) {
		// TODO Auto-generated method stub
		return this.inventarioRepo.buscarInventario(id);
	}

	@Override
	public Inventario buscarCodigoBarras(String codigoBarrasIndividual) {
		// TODO Auto-generated method stub
		return this.inventarioRepo.buscarCodigoBarras(codigoBarrasIndividual);
	}
	
	
}
