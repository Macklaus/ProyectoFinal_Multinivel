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
 * Entidad que describe la promocion que tiene un producto
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "PROMOCION_PRODUCTOS")
public class PromocionProducto implements Serializable{

	@Id
	@Column(name = "PROMOCION_PRODUCTO_ID", precision = 3)
	private int id;
	
	@Column(name = "DESCRIPCION", nullable = false)
	private String descripcion;
	
	/**
	 * Constructor...
	 */
	public PromocionProducto() {
		super();
	}

	/**
	 * Constructor...
	 * @param descripcion
	 */
	public PromocionProducto(String descripcion) {
		super();
		this.descripcion = descripcion;
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
