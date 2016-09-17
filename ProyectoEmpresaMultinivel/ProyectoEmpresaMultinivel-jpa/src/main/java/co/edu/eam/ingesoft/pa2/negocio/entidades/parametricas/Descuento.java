/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades.parametricas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad con el descuento que tiene el afilidado 
 * al comprar productos
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "DESCUENTOS")
public class Descuento implements Serializable{
	
	@Id
	@Column(name = "DESCUANTO_ID", precision = 2)
	private int id;
	
	@Column(name = "PORCENTAJE", precision = 4, scale = 3)
	private double porcentajeDescuento;
	
	/**
	 * constructor vacio...
	 */
	public Descuento() {
		super();
	}

	/**
	 * Constructor...
	 * @param porcentajeDescuento
	 */
	public Descuento(double porcentajeDescuento) {
		super();
		this.porcentajeDescuento = porcentajeDescuento;
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
	 * @return El atributo porcentajeDescuento
	 */
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	/**
	 * Establece el valor del atributo porcentajeDescuento
	 * @param porcentajeDescuento: EL porcentajeDescuento a establecer
	 */
	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	
	
	
}
