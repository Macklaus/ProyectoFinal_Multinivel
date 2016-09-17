/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "CATALOGOS")
public class Catalogo implements Serializable{

	@Id
	@Column(name = "CATALOGO_ID", length = 2)
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_INICIO", nullable = false)
	private Date fechaInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_FIN", nullable = false)
	private Date fechaFin;
	
	@Column(name = "DESCRIPCION", nullable = true)
	private String descripcion;
	
	/**
	 * Constructor...
	 */
	public Catalogo() {
		super();
	}

	/**
	 * Constructor...
	 * @param fechaInicio
	 * @param fechaFin
	 * @param descripcion
	 */
	public Catalogo(Date fechaInicio, Date fechaFin, String descripcion) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
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
