/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "PREMIO_EFECTIVO")
public class PremioEfectivo extends Premio implements Serializable{

	@Column(name = "VALOR", precision = 12, scale = 4, nullable = false)
	private double valor;
	
	/**
	 * Constructor...
	 */
	public PremioEfectivo() {
		super();
	}

	/**
	 * Constructor...
	 * @param meta
	 * @param valor
	 */
	public PremioEfectivo(double meta, double valor) {
		super(meta);
		this.valor = valor;
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
