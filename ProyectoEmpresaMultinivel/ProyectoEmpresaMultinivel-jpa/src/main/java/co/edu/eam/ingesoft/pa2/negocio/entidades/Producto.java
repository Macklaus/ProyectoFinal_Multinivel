/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.pa2.negocio.entidades.parametricas.TipoProducto;

/**
 *
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "PRODUCTOS")
public class Producto implements Serializable{

	@Id
	@Column(name = "PRODUCTO_ID", precision = 3)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "TIPO_PRODUCTO_ID", nullable = false)
	private TipoProducto tipo;
	
	@Column(name = "PRECIO_VENTA", precision = 10, scale = 4, nullable = false)
	private double precioVenta;
	
	/**
	 * Costo de la producción del producto
	 */
	@Column(name = "PRECIO_NETO", precision = 10, scale = 4, nullable = false)
	private double precioNeto;
	
	/**
	 * cantidad de unidades de este producto
	 */
	@Column(name = "CANTIDAD", precision = 5, nullable = false)
	private int cantidad;
	
	/**
	 * Constructor...
	 */
	public Producto() {
		super();
	}

	/**
	 * Constructor...
	 * @param tipo
	 * @param descripcion
	 * @param precioNeto
	 * @param precioVenta
	 */
	public Producto(TipoProducto tipo, double precioNeto, double precioVenta, int cantidad) {
		super();
		this.tipo = tipo;
		this.precioNeto = precioNeto;
		this.precioVenta = precioVenta;
		this.cantidad = cantidad;
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
	 * @return El atributo tipo
	 */
	public TipoProducto getTipo() {
		return tipo;
	}

	/**
	 * Establece el valor del atributo tipo
	 * @param tipo: EL tipo a establecer
	 */
	public void setTipo(TipoProducto tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return El atributo precioNeto
	 */
	public double getPrecioNeto() {
		return precioNeto;
	}

	/**
	 * Establece el valor del atributo precioNeto
	 * @param precioNeto: EL precioNeto a establecer
	 */
	public void setPrecioNeto(double precioNeto) {
		this.precioNeto = precioNeto;
	}

	/**
	 * @return El atributo precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * Establece el valor del atributo precioVenta
	 * @param precioVenta: EL precioVenta a establecer
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return El atributo cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * Establece el valor del atributo cantidad
	 * @param cantidad: EL cantidad a establecer
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
