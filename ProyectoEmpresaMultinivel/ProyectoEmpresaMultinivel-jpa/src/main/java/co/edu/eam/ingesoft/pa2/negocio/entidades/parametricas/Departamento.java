/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades.parametricas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento implements Serializable{

	@Id
	@Column(name = "DEPARTAMENT_ID", precision = 3)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "PAIS_ID", nullable = false)
	private Pais pais;
	
	@Column(name = "NOMBRE", length = 40, nullable = false)
	private String nombre;
	
	/**
	 * Constructor...
	 */
	public Departamento() {
		super();
	}

	/**
	 * Constructor...
	 * @param pais
	 * @param nombre
	 */
	public Departamento(Pais pais, String nombre) {
		super();
		this.pais = pais;
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
	 * @return El atributo pais
	 */
	public Pais getPais() {
		return pais;
	}

	/**
	 * Establece el valor del atributo pais
	 * @param pais: EL pais a establecer
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
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
