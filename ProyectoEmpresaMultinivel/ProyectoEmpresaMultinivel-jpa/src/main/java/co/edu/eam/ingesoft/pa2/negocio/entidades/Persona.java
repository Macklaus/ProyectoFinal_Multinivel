/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.pa2.negocio.entidades.parametricas.Descuento;
import co.edu.eam.ingesoft.pa2.negocio.enumeraciones.EstadoPersonaEnum;

/**
 * Entidad que tiene los datos de las personas
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "PERSONAS")
public class Persona implements Serializable{

	@Id
	@Column(name = "PERSONA_ID")
	private long id;
	
	/**
	 * descuento de la persona sobre los productos
	 */
	@ManyToOne
	@JoinColumn(name = "DESCUENTO_ID", nullable = false)
	private Descuento descuento;
	
	/**
	 * Persona que lo afilio
	 */
	@OneToOne
	@JoinColumn(name = "PADRINO", nullable = true)
	private Persona padrino;
	
	@Column(name = "NOMBRE", length = 40, nullable = false)
	private String nombre;
	
	@Column(name = "APELLIDO", length = 40, nullable = false)
	private String apellido;
	
	@Column(name = "TELEFONO", nullable = false, length = 13)
	private long telefono;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ESTADO")
	private EstadoPersonaEnum estado;
	
	/**
	 * Constructos...
	 */
	public Persona() {
		super();
	}

	/**
	 * Constructos...
	 * @param descuento
	 * @param padrino
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 */
	public Persona(Descuento descuento, Persona padrino, String nombre, String apellido, long telefono) {
		super();
		this.descuento = descuento;
		this.padrino = padrino;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}
	
	
	
}
