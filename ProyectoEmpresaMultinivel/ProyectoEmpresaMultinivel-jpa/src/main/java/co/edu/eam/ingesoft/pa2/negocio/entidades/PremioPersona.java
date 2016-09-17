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
 *
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "PREMIO_PERSONAS")
public class PremioPersona implements Serializable{

	@Id
	@Column(name = "PREMIO_PERSONA_ID")
	private long id;
	
	/**
	 * Premio que se gano la persona
	 */
	@ManyToOne
	@JoinColumn(name = "PREMIO_ID", nullable = false)
	private Premio premio;
	
	/**
	 * Persona quien se gano el premio
	 */
	@ManyToOne
	@JoinColumn(name = "PERSONA_ID", nullable = false)
	private Persona persona;
	
	/**
	 * Fecha en la que la persona se gano el premio
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA", nullable = false)
	private Date fecha;
	
	/**
	 * Entregado o no entregado
	 */
	@Column(name = "ESTADO", nullable = false)
	private boolean estado;
	
	/**
	 * Constructor...
	 */
	public PremioPersona() {
		super();
	}

	/**
	 * Constructor...
	 * @param premio
	 * @param persona
	 * @param fecha
	 * @param estado
	 */
	public PremioPersona(Premio premio, Persona persona, Date fecha, boolean estado) {
		super();
		this.premio = premio;
		this.persona = persona;
		this.fecha = fecha;
		this.estado = estado;
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

	/**
	 * @return El atributo estado
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * Establece el valor del atributo estado
	 * @param estado: EL estado a establecer
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}
