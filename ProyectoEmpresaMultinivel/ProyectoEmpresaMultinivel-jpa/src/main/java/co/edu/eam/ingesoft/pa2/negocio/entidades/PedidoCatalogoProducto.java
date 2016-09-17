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
 * Entidad intermedia entre Pedido y CataloProducto, 
 * referencia que productos estan en un pedido, pero los productos 
 * de un catalogo.
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "PEDIDO_CATALOGO_PRODUCTOS")
public class PedidoCatalogoProducto implements Serializable{

	@Id
	@Column(name = "PEDIDO_CATALOGO_PRODUCTO_ID", precision = 10)
	private int id;
	
	/**
	 * Pedido que tiene los productos
	 */
	@ManyToOne
	@JoinColumn(name = "PEDIDO_ID", nullable = false)
	private Pedido pedido;
	
	/**
	 * Producto que se pidio en el pedido
	 */
	@ManyToOne
	@JoinColumn(name = "CATALOGO_PRODUCTO_ID", nullable = false)
	private CatalogoProducto producto;
	
	/**
	 * cantidad de unidades del producto en el pedido
	 */
	@Column(name = "CANTIDAD", precision = 4, nullable = false)
	private int cantidad;
	
	/**
	 * Precio del producto cuando se realizo el pedido
	 */
	@Column(name = "PRECIO_PRODUCTO", precision = 10, scale = 4, nullable = false)
	private double precio;
	
	/**
	 * Constructor...
	 */
	public PedidoCatalogoProducto() {
		super();
	}

	/**
	 * Constructor...
	 * @param pedido
	 * @param producto
	 * @param cantidad
	 * @param precio
	 */
	public PedidoCatalogoProducto(Pedido pedido, CatalogoProducto producto, int cantidad, double precio) {
		super();
		this.pedido = pedido;
		this.producto = producto;
		this.cantidad = cantidad;
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
	 * @return El atributo producto
	 */
	public CatalogoProducto getProducto() {
		return producto;
	}

	/**
	 * Establece el valor del atributo producto
	 * @param producto: EL producto a establecer
	 */
	public void setProducto(CatalogoProducto producto) {
		this.producto = producto;
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
