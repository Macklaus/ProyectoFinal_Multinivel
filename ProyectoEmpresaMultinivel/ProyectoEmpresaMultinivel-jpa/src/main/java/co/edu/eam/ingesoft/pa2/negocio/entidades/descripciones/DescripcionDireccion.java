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

import co.edu.eam.ingesoft.pa2.negocio.entidades.Direccion;

/**
 *
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 12/10/2016<br/>
 */
@Entity
@Table(name = "DESCRIPCION_DIRECCIONES")
public class DescripcionDireccion implements Serializable{

	@Id
	@OneToOne
	@JoinColumn(name = "DIRECCION_ID")
	private Direccion direccion;
	
	@Column(name = "DESCRIPCION", length = 200, nullable = false)
	private String descripcion;
	
	/**
	 * Constructor...
	 */
	public DescripcionDireccion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor...
	 * @param direccion
	 * @param descripcion
	 */
	public DescripcionDireccion(Direccion direccion, String descripcion) {
		super();
		this.direccion = direccion;
		this.descripcion = descripcion;
	}

	/**
	 * @return El atributo direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}

	/**
	 * Establece el valor del atributo direccion
	 * @param direccion: EL direccion a establecer
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
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
