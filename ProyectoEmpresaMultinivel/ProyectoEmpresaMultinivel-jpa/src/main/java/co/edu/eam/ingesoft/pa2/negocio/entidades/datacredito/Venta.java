/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades.datacredito;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.pa2.negocio.entidades.Persona;

/**
 * Ventas que realizan los afiliados a la 
 * empresa
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 9/10/2016<br/>
 */
@Entity
@Table(name = "VENTAS")
public class Venta implements Serializable{

	@Id
	@Column(name = "VENTA_ID", precision = 10)
	private int id;
	
	/**
	 * Afiliado que realizo su venta
	 */
	@ManyToOne
	@JoinColumn(name = "PERSONA_ID", nullable = false)
	private Persona afiliado;
	
	/**
	 * cliente a quien se le realizo la venta
	 */
	@ManyToOne
	@JoinColumn(name = "CLIENTE_ID", nullable = false)
	private Cliente cliente;
	
	/**
	 * cantidad de dinero, total, de la venta
	 */
	@Column(name = "MONTO", precision = 12, scale = 4, nullable = false)
	private double monto;
	
	/**
	 * fecha en la que se realizo la venta
	 */
	@Column(name = "FECHA", nullable = false)
	private Date fecha;
	
	/**
	 * Constructor...
	 */
	public Venta() {
		super();
	}

	/**
	 * Constructor...
	 * @param id
	 * @param afiliado
	 * @param cliente
	 * @param monto
	 * @param fecha
	 */
	public Venta(int id, Persona afiliado, Cliente cliente, double monto, Date fecha) {
		super();
		this.id = id;
		this.afiliado = afiliado;
		this.cliente = cliente;
		this.monto = monto;
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
	 * @return El atributo afiliado
	 */
	public Persona getAfiliado() {
		return afiliado;
	}

	/**
	 * Establece el valor del atributo afiliado
	 * @param afiliado: EL afiliado a establecer
	 */
	public void setAfiliado(Persona afiliado) {
		this.afiliado = afiliado;
	}

	/**
	 * @return El atributo cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Establece el valor del atributo cliente
	 * @param cliente: EL cliente a establecer
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return El atributo monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * Establece el valor del atributo monto
	 * @param monto: EL monto a establecer
	 */
	public void setMonto(double monto) {
		this.monto = monto;
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
