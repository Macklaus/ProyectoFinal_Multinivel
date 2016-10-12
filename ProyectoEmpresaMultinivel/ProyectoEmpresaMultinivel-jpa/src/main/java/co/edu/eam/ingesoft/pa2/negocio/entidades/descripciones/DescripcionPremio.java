/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades.descripciones;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.pa2.negocio.entidades.Premio;

/**
 *
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 12/10/2016<br/>
 */
@Entity
@Table(name = "DESCRIPCION_PREMIOS")
public class DescripcionPremio implements Serializable{

	@Id
	@OneToOne
	@JoinColumn(name = "PREMIO_ID")
	private Premio premio;
	
	@Column(name = "DESCRIPCION", length = 250, nullable = false)
	private String descripcion;
	
	/**
	 * Constructor...
	 */
	public DescripcionPremio() {
		super();
	}

	/**
	 * Constructor...
	 * @param premio
	 * @param descripcion
	 */
	public DescripcionPremio(Premio premio, String descripcion) {
		super();
		this.premio = premio;
		this.descripcion = descripcion;
	}

	/**
	 * @return El atributo premio
	 */
	public Premio getPremio() {
		return premio;
	}

	/**
	 * Establece el valor del atributo premio
	 * @param premio: EL premio a establecer
	 */
	public void setPremio(Premio premio) {
		this.premio = premio;
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
