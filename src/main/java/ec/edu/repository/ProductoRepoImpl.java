package ec.edu.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Producto;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public void actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public Producto buscarProducto(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public void borrarProducto(Integer id) {
		// TODO Auto-generated method stub
		Producto p = this.buscarProducto(id);
		BigDecimal stock = p.getStock();
		Integer in = stock.intValue();
		if(in >= 100) {
			this.entityManager.remove(p);
		} 
		
	}

	@Override
	public Producto buscarProductoCodigoBarras(String codigoBarras) {
		// TODO Auto-generated method stub

		TypedQuery<Producto> miTypedQuery = this.entityManager
				.createQuery("select p from Producto p where p.codigoBarras =:codigoBarras", Producto.class);
		miTypedQuery.setParameter("codigoBarras", codigoBarras);

		return miTypedQuery.getSingleResult();
	}

	@Override
	public List<Producto> listaProductos() {
		// TODO Auto-generated method stub
		TypedQuery<Producto> miTypedQuery = this.entityManager.createQuery("SELECT p from Producto p", Producto.class);

		return miTypedQuery.getResultList();
	}

}
