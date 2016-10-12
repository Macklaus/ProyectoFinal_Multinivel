/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades.datacredito;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 9/10/2016<br/>
 */
@Entity
@Table(name = "CREDITOS")
public class Credito implements Serializable{

	@Id
	@Column(name = "CREDITO_ID", precision = 4)
	private int id;
	
	/**
	 * Cantidad de cuotas a las 
	 * que pagará la venta
	 */
	@Column(name = "CUOTAS", precision = 2, nullable = false)
	private int cuotas;
	
	/**
	 * Constructor...
	 */
	public Credito() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor...
	 * @param id
	 * @param cuotas
	 */
	public Credito(int id, int cuotas) {
		super();
		this.id = id;
		this.cuotas = cuotas;
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
	 * @return El atributo cuotas
	 */
	public int getCuotas() {
		return cuotas;
	}

	/**
	 * Establece el valor del atributo cuotas
	 * @param cuotas: EL cuotas a establecer
	 */
	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}
	
	
	
}
