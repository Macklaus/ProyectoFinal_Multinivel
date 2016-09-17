/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades.parametricas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "CIUDADES")
public class Ciudad implements Serializable{

	@Id
	@Column(name = "CIUDAD_ID", precision = 4)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "DEPARTAMENTO_ID", nullable = false)
	private Departamento departamento;
	
	@Column(name = "NOMBRE", length = 40, nullable = false)
	private String nombre;
	
	/**
	 * Constructor...
	 */
	public Ciudad() {
		super();
	}

	/**
	 * Constructor...
	 * @param departamento
	 * @param nombre
	 */
	public Ciudad(Departamento departamento, String nombre) {
		super();
		this.departamento = departamento;
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
	 * @return El atributo departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * Establece el valor del atributo departamento
	 * @param departamento: EL departamento a establecer
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
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
