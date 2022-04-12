package ec.edu.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_producto"))
	@SequenceGenerator(name = "seq_producto", sequenceName = "seq_producto", allocationSize = 1)
	@Column(name = "prod_id")
	private Integer id;
	@Column(name = "prod_nombre")
	private String nombre;
	@Column(name = "prod_codigo_barras_maestro")
	private String codigoBarras;
	@Column(name = "prod_categoria")
	private String categoria;
	@Column(name = "prod_stock")
	private BigDecimal stock;

	@ManyToOne
	@JoinColumn(name = "bode_id")
	private Bodega bodega;

	//metodos set y get
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getStock() {
		return stock;
	}

	public void setStock(BigDecimal stock) {
		this.stock = stock;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

}
