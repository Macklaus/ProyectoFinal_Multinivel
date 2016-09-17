/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Entidad con los datos de los premios en general
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "PREMIOS")
@Inheritance(strategy = InheritanceType.JOINED)
public class Premio implements Serializable{

	@Id
	@Column(name = "PREMIO_ID", precision = 2)
	protected int id;
	
	@Column(name = "META", precision = 14, scale = 4, nullable = false)
	protected double meta;
	
	/**
	 * Constructor...
	 */
	public Premio() {
		super();
	}

	/**
	 * Constructor...
	 * @param meta
	 */
	public Premio(double meta) {
		super();
		this.meta = meta;
	}

	/**
	 * @return El atributo id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Establece el valor del atributo id
	 * @param id: EL id a establecer
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return El atributo meta
	 */
	public double getMeta() {
		return meta;
	}

	/**
	 * Establece el valor del atributo meta
	 * @param meta: EL meta a establecer
	 */
	public void setMeta(double meta) {
		this.meta = meta;
	}
	
	
	
}
