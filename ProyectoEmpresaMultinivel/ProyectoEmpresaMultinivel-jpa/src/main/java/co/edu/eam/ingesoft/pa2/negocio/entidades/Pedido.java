/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entidad que tiene los datos de un pedido realizado 
 * por una persona
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "PEDIDOS")
public class Pedido implements Serializable{

	@Id
	@Column(name = "PEDIDO_ID", precision = 10)
	private int id;
	
	/**
	 * Persona que realizo el pedido
	 */
	@ManyToOne
	@JoinColumn(name = "PERSONA_ID", nullable = false)
	private Persona persona;
	
	/**
	 * fecha en la que se realizo el pedido
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA", nullable = false)
	private Date fecha;
	
	/**
	 * Constructor...
	 */
	public Pedido() {
		super();
	}

	/**
	 * Constructor...
	 * @param persona
	 * @param fecha
	 */
	public Pedido(Persona persona, Date fecha) {
		super();
		this.persona = persona;
		this.fecha = fecha;
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
	 * @return El atributo fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * Establece el valor del atributo fecha
	 * @param fecha: EL fecha a establecer
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
