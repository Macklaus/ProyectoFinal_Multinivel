/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades.parametricas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "COMISIONES")
public class Comision implements Serializable{

	@Id
	@Column(name = "COMISION_ID", precision = 2)
	private int id;
	
	/**
	 * precio, valor de la comision
	 */
	@Column(name = "VALOR", precision = 4, scale = 3)
	private double valor;
	
	/**
	 * nivel que posee esta bonificación
	 */
	@OneToOne
	@JoinColumn(name = "NIVEL_ID", insertable = false, updatable = false, nullable = false, unique = true)
	private Nivel nivel;
	
	/**
	 * Constructor..
	 */
	public Comision() {
		super();
	}

	/**
	 * Constructor...
	 * @param valor
	 */
	public Comision(double valor) {
		super();
		this.valor = valor;
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
	 * @return El atributo valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * Establece el valor del atributo valor
	 * @param valor: EL valor a establecer
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
