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
 * Entidad que describe que productos se entregaran en un 
 * premio en especie, un kit de productos
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "KITS")
public class Kit implements Serializable{

	@Id
	@Column(name = "KIT_ID", precision = 4)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCTO_ID", nullable = false)
	private Producto producto;
	
	/**
	 * premio en especie en el que se entregaran los productos
	 */
	@ManyToOne
	@JoinColumn(name = "PREMIO_ESPECIE_ID", nullable = false)
	private PremioEspecie premio;
	
	/**
	 * Constructor...
	 */
	public Kit() {
		super();
	}

	/**
	 * Constructor...
	 * @param producto
	 * @param premio
	 */
	public Kit(Producto producto, PremioEspecie premio) {
		super();
		this.producto = producto;
		this.premio = premio;
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
	 * @return El atributo premio
	 */
	public PremioEspecie getPremio() {
		return premio;
	}

	/**
	 * Establece el valor del atributo premio
	 * @param premio: EL premio a establecer
	 */
	public void setPremio(PremioEspecie premio) {
		this.premio = premio;
	}
	
	
}
