/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades.descripciones;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.pa2.negocio.entidades.Producto;

/**
 *
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 12/10/2016<br/>
 */
@Entity
@Table(name = "DESCRIPCION_PRODUCTOS")
public class DescripcionProducto implements Serializable{

	@Id
	@OneToOne
	@JoinColumn(name = "PRODUCTO_ID")
	private Producto producto;
	
	@Column(name = "DESCRIPCION", length = 100, nullable = false)
	private String descripcion;
	
	/**
	 * Constructor...
	 */
	public DescripcionProducto() {
		super();
	}

	/**
	 * Constructor..
	 * @param producto
	 * @param descripcion
	 */
	public DescripcionProducto(Producto producto, String descripcion) {
		super();
		this.producto = producto;
		this.descripcion = descripcion;
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
	
}
