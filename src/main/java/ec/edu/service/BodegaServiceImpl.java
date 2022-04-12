package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Bodega;
import ec.edu.repository.IBodegaRepo;

@Service
public class BodegaServiceImpl implements IBodegaService{

	@Autowired
	private IBodegaRepo bodegaRepo;
	
	@Override
	public void insertarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodegaRepo.insertarBodega(bodega);
	}

	@Override
	public void actualizarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodegaRepo.actualizarBodega(bodega);
	}

	@Override
	public Bodega buscarBodega(Integer id) {
		// TODO Auto-generated method stub
		return this.bodegaRepo.buscarBodega(id);
	}

	@Override
	public void borrarBodega(Integer id) {
		// TODO Auto-generated method stub
		this.bodegaRepo.borrarBodega(id);
	}

}
