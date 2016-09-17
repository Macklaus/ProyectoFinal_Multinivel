/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "PREMIO_ESPECIES")
public class PremioEspecie extends Premio implements Serializable{

	@Column(name = "DESCRIPCION", nullable = false, length = 40)
	private String descripcion;
	
	/**
	 * Constructor...
	 */
	public PremioEspecie() {
		super();
	}

	/**
	 * Constructor...
	 * @param meta
	 * @param descripcion
	 */
	public PremioEspecie(double meta, String descripcion) {
		super(meta);
		this.descripcion = descripcion;
	}



	/**
	 * @return El atributo descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Establece el valor del atributo descripcion
	 * @param descripcion: EL descripcion a establecer
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
