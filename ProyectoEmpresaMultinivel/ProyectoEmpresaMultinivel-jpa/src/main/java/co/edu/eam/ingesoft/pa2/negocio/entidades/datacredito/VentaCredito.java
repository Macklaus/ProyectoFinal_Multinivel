/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades.datacredito;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entidad intermedia entre Venta y Credito, 
 * Contiene los datos de las cuotas pagadas por 
 * el afiliado en un credito que tenga de una venta
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 9/10/2016<br/>
 */
@Entity
@Table(name = "VENTA_CREDITOS")
public class VentaCredito implements Serializable{

	@Id
	@Column(name = "VENTA_CREDITO_ID", precision = 12)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "CREDITO_ID", nullable = false)
	private Credito credito;
	
	/**
	 * venta de la que se sacó el 
	 * credito para pagarla
	 */
	@ManyToOne
	@JoinColumn(name = "VENTA_ID", nullable = false)
	private Venta venta;
	
	/**
	 * cantidad de dinero que se pago en esta cuota
	 */
	@Column(name = "VALOR", precision = 11, scale = 4, nullable = false)
	private double valor;
	
	@Column(name = "NUMERO_CUOTA", precision = 2, nullable = false)
	private int numeroCuota;
	
	/**
	 * Constructor...
	 */
	public VentaCredito() {
		super();
	}

	/**
	 * Constructor...
	 * @param id
	 * @param credito
	 * @param venta
	 * @param valor
	 * @param numeroCuota
	 */
	public VentaCredito(int id, Credito credito, Venta venta, double valor, int numeroCuota) {
		super();
		this.id = id;
		this.credito = credito;
		this.venta = venta;
		this.valor = valor;
		this.numeroCuota = numeroCuota;
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
	 * @return El atributo credito
	 */
	public Credito getCredito() {
		return credito;
	}

	/**
	 * Establece el valor del atributo credito
	 * @param credito: EL credito a establecer
	 */
	public void setCredito(Credito credito) {
		this.credito = credito;
	}

	/**
	 * @return El atributo venta
	 */
	public Venta getVenta() {
		return venta;
	}

	/**
	 * Establece el valor del atributo venta
	 * @param venta: EL venta a establecer
	 */
	public void setVenta(Venta venta) {
		this.venta = venta;
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

	/**
	 * @return El atributo numeroCuota
	 */
	public int getNumeroCuota() {
		return numeroCuota;
	}

	/**
	 * Establece el valor del atributo numeroCuota
	 * @param numeroCuota: EL numeroCuota a establecer
	 */
	public void setNumeroCuota(int numeroCuota) {
		this.numeroCuota = numeroCuota;
	}
	
	
}
