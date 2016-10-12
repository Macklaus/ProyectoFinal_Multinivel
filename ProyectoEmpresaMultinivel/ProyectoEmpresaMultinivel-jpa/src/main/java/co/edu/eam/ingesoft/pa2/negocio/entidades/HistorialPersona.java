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
 * Entidad con los datos historicos de una persona
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "HISTORIAL_PERSONAS")
public class HistorialPersona implements Serializable{

	@Id
	@Column(name = "HISTORIAL_ID", precision = 10)
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
	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_INICIO", nullable = false)
	private Date fechaInicio;
	
	/**
	 * fecha en la que termino la persona con estos datos historicos
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_FINAL", nullable = false)
	private Date fechaFin;
	
	/**
	 * nivel en la que esta o estuvo la persona
	 */
	@Column(name = "NIVEL", precision = 2, nullable = false)
	private int nivel;
	
	/**
	 * la comision ganada por la persona entre la 
	 * fecha inicio y la fecha final
	 */
	@Column(name = "COMISION_GANADA", precision = 11, scale = 4, nullable = false)
	private double comisionGanada;
	
	/**
	 * Constructor...
	 */
	public HistorialPersona() {
		super();
	}



	/**
	 * Constructor...
	 * @param id
	 * @param persona
	 * @param fechaInicio
	 * @param fechaFin
	 * @param nivel
	 * @param comisionGanada
	 */
	public HistorialPersona(long id, Persona persona, Date fechaInicio, Date fechaFin, int nivel,
			double comisionGanada) {
		super();
		this.id = id;
		this.persona = persona;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.nivel = nivel;
		this.comisionGanada = comisionGanada;
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
		return fechaFin;
	}

	/**
	 * Establece el valor del atributo fechaFin
	 * @param fechaFin: EL fechaFin a establecer
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
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



	/**
	 * @return El atributo comisionGanada
	 */
	public double getComisionGanada() {
		return comisionGanada;
	}



	/**
	 * Establece el valor del atributo comisionGanada
	 * @param comisionGanada: EL comisionGanada a establecer
	 */
	public void setComisionGanada(double comisionGanada) {
		this.comisionGanada = comisionGanada;
	}
	
	
	
}
