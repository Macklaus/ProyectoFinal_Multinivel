/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.pa2.negocio.entidades.parametricas.Ciudad;


/**
 * Entidad con los datos de una direccion de una persona
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "DIRECCIONES")
public class Direccion implements Serializable{

	@Id
	@Column(name = "DIRECCION_ID", precision = 10)
	private int id;
	
	/**
	 * el propietario de la direccion
	 */
	@ManyToOne
	@JoinColumn(name = "PERSONA_ID", nullable = false)
	private Persona persona;
	
	/**
	 * ciudad en la que se encuentra la direccion
	 */
	@ManyToOne
	@JoinColumn(name = "CIUDAD_ID", nullable = false)
	private Ciudad ciudad;
	
	/**
	 * descripcion de la direccion
	 */
	@Column(name = "DESCRIPCION", nullable = false, length = 100)
	private String descripcion;
	
	/**
	 * Constructor...
	 */
	public Direccion() {
		super();
	}

	/**
	 * Constructor...
	 * @param persona
	 * @param ciudad
	 * @param descripcion
	 */
	public Direccion(Persona persona, Ciudad ciudad, String descripcion) {
		super();
		this.persona = persona;
		this.ciudad = ciudad;
		this.descripcion = descripcion;
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
	 * @return El atributo persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * Establece el valor del atributo persona
	 * @param persona: EL persona a establecer
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * @return El atributo ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}

	/**
	 * Establece el valor del atributo ciudad
	 * @param ciudad: EL ciudad a establecer
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
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
