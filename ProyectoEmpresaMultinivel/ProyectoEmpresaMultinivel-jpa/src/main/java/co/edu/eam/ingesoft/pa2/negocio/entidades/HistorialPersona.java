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

/**
 * Entidad con los datos historicos de una persona
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "HISTORIAL_PERSONAS")
public class HistorialPersona implements Serializable{

	@Id
	@Column(name = "HISTORIAL_PERSONA_ID")
	private long id;
	
	/**
	 * persona de la que es este historial
	 */
	@ManyToOne
	@JoinColumn(name = "PERSONA_ID", nullable = false)
	private Persona persona;
	
	/**
	 * fecha en la inicio la persona con los nuevos datos historicos
	 */
	@Column(name = "FECHA_INICIO", nullable = false)
	private Date fechaInicio;
	
	/**
	 * fecha en la que termino la persona con estos datos historicos
	 */
	@Column(name = "FECHA_FIN", nullable = false)
	private Date FechaFin;
	
	/**
	 * nivel en la que esta o estuvo la persona
	 */
	@Column(name = "NIVEL", precision = 2, nullable = false)
	private int nivel;
	
	/**
	 * Constructor...
	 */
	public HistorialPersona() {
		super();
	}
	
	

	/**
	 * Constructor...
	 * @param persona
	 * @param fechaInicio
	 * @param fechaFin
	 * @param nivel
	 */
	public HistorialPersona(Persona persona, Date fechaInicio, Date fechaFin, int nivel) {
		super();
		this.persona = persona;
		this.fechaInicio = fechaInicio;
		FechaFin = fechaFin;
		this.nivel = nivel;
	}



	/**
	 * @return El atributo id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Establece el valor del atributo id
	 * @param id: EL id a establecer
	 */
	public void setId(long id) {
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
	 * @return El atributo fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * Establece el valor del atributo fechaInicio
	 * @param fechaInicio: EL fechaInicio a establecer
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return El atributo fechaFin
	 */
	public Date getFechaFin() {
		return FechaFin;
	}

	/**
	 * Establece el valor del atributo fechaFin
	 * @param fechaFin: EL fechaFin a establecer
	 */
	public void setFechaFin(Date fechaFin) {
		FechaFin = fechaFin;
	}

	/**
	 * @return El atributo nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * Establece el valor del atributo nivel
	 * @param nivel: EL nivel a establecer
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
	
}
