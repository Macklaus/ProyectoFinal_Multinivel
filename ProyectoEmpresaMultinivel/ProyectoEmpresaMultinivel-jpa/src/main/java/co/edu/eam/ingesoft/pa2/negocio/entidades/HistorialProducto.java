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

/**
 * Entidad con los datos historicos de los productos
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "HISTORIAL_PRODUCTOS")
public class HistorialProducto implements Serializable{

	@Id
	@Column(name = "HISTORIAL_PRODUCTO_ID", precision = 5)
	private int id;
	
	/**
	 * Producto al que refiere este historial
	 */
	@ManyToOne
	@JoinColumn(name = "PRODUCTO_ID", nullable = false)
	private Producto producto;
	
	/**
	 * precio del producto
	 */
	@Column(name = "PRECIO_PRODUCTO", precision = 10, scale = 4, nullable = false)
	private double precio;

	/**
	 * Constructor...
	 */
	public HistorialProducto() {
		super();
	}
	
	/**
	 * Constructor...
	 * @param producto
	 * @param precio
	 */
	public HistorialProducto(Producto producto, double precio) {
		super();
		this.producto = producto;
		this.precio = precio;
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
	 * @return El atributo producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * Establece el valor del atributo producto
	 * @param producto: EL producto a establecer
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return El atributo precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece el valor del atributo precio
	 * @param precio: EL precio a establecer
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
