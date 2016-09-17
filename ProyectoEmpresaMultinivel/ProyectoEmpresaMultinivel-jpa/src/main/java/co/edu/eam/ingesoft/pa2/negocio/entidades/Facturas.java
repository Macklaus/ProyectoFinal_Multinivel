/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.pa2.negocio.enumeraciones.EstadoFacturaEnum;

/**
 * Entidad con la informacion de una factura, 
 * cuando se entrega un pedido, este se convierte en 
 * una factura
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "FACTURAS")
public class Facturas implements Serializable{

	@Id
	@Column(name = "FACTURA_ID", precision = 10)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "PEDIDO_ID", updatable = false, insertable = false, nullable = false, unique = true)
	private Pedido pedido;
	
	/**
	 * Precio, valor de la factura
	 */
	@Column(name = "VALOR_TOTAL", precision = 16, scale = 4, nullable = false)
	private double valorTotal;
	
	/**
	 * Fecha limite que tiene una persona para pagar 
	 * la factura
	 */
	@Column(name = "FECHA_LIMITE", nullable = false)
	private Date fechaLimite;
	
	/**
	 * estado de la factura
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "ESTADO", nullable = false)
	private EstadoFacturaEnum estado;
	
	/**
	 * Constructor...
	 */
	public Facturas() {
		super();
	}

	/**
	 * Constructor...
	 * @param pedido
	 * @param valorTotal
	 * @param fechaLimite
	 * @param estado
	 */
	public Facturas(Pedido pedido, double valorTotal, Date fechaLimite, EstadoFacturaEnum estado) {
		super();
		this.pedido = pedido;
		this.valorTotal = valorTotal;
		this.fechaLimite = fechaLimite;
		this.estado = estado;
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
	 * @return El atributo pedido
	 */
	public Pedido getPedido() {
		return pedido;
	}

	/**
	 * Establece el valor del atributo pedido
	 * @param pedido: EL pedido a establecer
	 */
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	/**
	 * @return El atributo valorTotal
	 */
	public double getValorTotal() {
		return valorTotal;
	}

	/**
	 * Establece el valor del atributo valorTotal
	 * @param valorTotal: EL valorTotal a establecer
	 */
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	/**
	 * @return El atributo fechaLimite
	 */
	public Date getFechaLimite() {
		return fechaLimite;
	}

	/**
	 * Establece el valor del atributo fechaLimite
	 * @param fechaLimite: EL fechaLimite a establecer
	 */
	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	/**
	 * @return El atributo estado
	 */
	public EstadoFacturaEnum getEstado() {
		return estado;
	}

	/**
	 * Establece el valor del atributo estado
	 * @param estado: EL estado a establecer
	 */
	public void setEstado(EstadoFacturaEnum estado) {
		this.estado = estado;
	}
	
	
	
}
