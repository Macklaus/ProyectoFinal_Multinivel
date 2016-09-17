/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades.parametricas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad que tiene los datos de los países
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "PAISES")
public class Pais implements Serializable{

	@Id
	@Column(name = "PAIS_ID", precision = 3)
	private int id;
	
	@Column(name = "NOMBRE", length = 40, nullable = false)
	private String nombre;
	
	/**
	 * Constructor...
	 */
	public Pais() {
		super();
	}

	/**
	 * Constructor...
	 * @param nombre
	 */
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
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
	 * @return El atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el valor del atributo nombre
	 * @param nombre: EL nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
