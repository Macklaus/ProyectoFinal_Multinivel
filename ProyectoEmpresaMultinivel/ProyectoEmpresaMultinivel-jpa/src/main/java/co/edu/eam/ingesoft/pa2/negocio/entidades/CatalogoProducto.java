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

import co.edu.eam.ingesoft.pa2.negocio.entidades.parametricas.PromocionProducto;

/**
 * Entidad intermedia entre Prodcuto y Catalogo, 
 * describe que productos tiene un catalogo
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "CATALOGO_PRODUCTOS")
public class CatalogoProducto implements Serializable{

	@Id
	@Column(name = "ID", precision = 6)
	private int id;
	
	/**
	 * catalogo que tiene los productos
	 */
	@ManyToOne
	@JoinColumn(name = "CATALOGO_ID", nullable = false)
	private Catalogo catalogo;
	
	/**
	 * producto que está en el catalogo
	 */
	@ManyToOne
	@JoinColumn(name = "PRODUCTO_ID", nullable = false)
	private Producto producto;
	
	/**
	 * promocion que tiene el producto en este catalogo
	 */
	@ManyToOne
	@JoinColumn(name = "PROMOCION_PRODUCTO_ID", nullable = false)
	private PromocionProducto promocion;

	/**
	 * Constructor...
	 */
	public CatalogoProducto() {
		super();
	}
	
	/**
	 * Constructor...
	 * @param catalogo
	 * @param producto
	 * @param promocion
	 */
	public CatalogoProducto(Catalogo catalogo, Producto producto, PromocionProducto promocion) {
		super();
		this.catalogo = catalogo;
		this.producto = producto;
		this.promocion = promocion;
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
	 * @return El atributo catalogo
	 */
	public Catalogo getCatalogo() {
		return catalogo;
	}

	/**
	 * Establece el valor del atributo catalogo
	 * @param catalogo: EL catalogo a establecer
	 */
	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
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
	 * @return El atributo promocion
	 */
	public PromocionProducto getPromocion() {
		return promocion;
	}

	/**
	 * Establece el valor del atributo promocion
	 * @param promocion: EL promocion a establecer
	 */
	public void setPromocion(PromocionProducto promocion) {
		this.promocion = promocion;
	}
	
	
}
