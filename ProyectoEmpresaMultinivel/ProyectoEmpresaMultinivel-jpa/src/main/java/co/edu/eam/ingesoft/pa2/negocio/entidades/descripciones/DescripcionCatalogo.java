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

import co.edu.eam.ingesoft.pa2.negocio.entidades.Catalogo;

/**
 * Entidad con la descripcion de un 
 * catalogo
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 9/10/2016<br/>
 */
@Entity
@Table(name = "DESCRIPCION_CATALOGOS")
public class DescripcionCatalogo implements Serializable{

	@Id
	@OneToOne
	@JoinColumn(name = "CATALOGO_ID")
	private Catalogo catalogo;
	
	@Column(name = "DESCRIPCION", length = 250, nullable = false)
	private String descripcion;
	
	/**
	 * Constructor...
	 */
	public DescripcionCatalogo() {
		super();
	}

	/**
	 * Constructtor...
	 * @param catalogo
	 * @param descripcion
	 */
	public DescripcionCatalogo(Catalogo catalogo, String descripcion) {
		super();
		this.catalogo = catalogo;
		this.descripcion = descripcion;
	}

	/**
	 * @return El atributo catalogo
	 */
	public Catalogo getCatalogo() {
		return catalogo;
	}

	/**
	 * Establece el valor del atributo catalogo
	 * @param catalogo: EL catalogo a establecer
	 */
	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
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
