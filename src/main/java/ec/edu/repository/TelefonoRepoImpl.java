package ec.edu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Producto;
import ec.edu.modelo.Telefono;

@Repository
@Transactional
public class TelefonoRepoImpl implements ITelefonoRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarTelefono(Telefono telefono) {
		// TODO Auto-generated method stub
		this.entityManager.persist(telefono);
	}

	@Override
	public void actualizarTelefono(Telefono telefono) {
		// TODO Auto-generated method stub
		this.entityManager.merge(telefono);
	}

	@Override
	public Telefono buscarTelefono(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Telefono.class, id);
	}

	@Override
	public void borrarTelefono(Integer id) {
		// TODO Auto-generated method stub
		Telefono tel = this.buscarTelefono(id);
		this.entityManager.remove(tel);
	}
	


}
