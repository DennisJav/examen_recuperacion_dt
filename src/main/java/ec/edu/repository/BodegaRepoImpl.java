package ec.edu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Bodega;

@Repository
@Transactional
public class BodegaRepoImpl implements IBodegaRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bodega);
	}

	@Override
	public void actualizarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bodega);
	}

	@Override
	public Bodega buscarBodega(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Bodega.class, id);
	}

	@Override
	public void borrarBodega(Integer id) {
		// TODO Auto-generated method stub
		Bodega b = this.buscarBodega(id);
		this.entityManager.remove(b);
	}
	
	
	
}
