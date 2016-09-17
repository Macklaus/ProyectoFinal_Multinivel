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
	
	@Column(name = "DESCRIPCION", length = 100, nullable = false)
	private String descripcion;
	
	/**
	 * Costo de la producción del producto
	 */
	@Column(name = "PRECIO_NETO", precision = 10, scale = 4, nullable = false)
	private double precioNeto;
	
	@Column(name = "PRECIO_VENTA", precision = 10, scale = 4, nullable = false)
	private double precioVenta;
	
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
	public Producto(TipoProducto tipo, String descripcion, double precioNeto, double precioVenta) {
		super();
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.precioNeto = precioNeto;
		this.precioVenta = precioVenta;
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
	
}
