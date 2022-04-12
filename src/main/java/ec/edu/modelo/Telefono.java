package ec.edu.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "telefono")
public class Telefono {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_telefono"))
	@SequenceGenerator(name = "seq_telefono", sequenceName = "seq_telefono", allocationSize = 1)
	@Column(name = "telf_id")
	private Integer id;
	@Column(name = "telefono")
	private String telefono;
	
}
