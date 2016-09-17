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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "INVENTARIOS")
public class Inventario implements Serializable{

	@Id
	@Column(name = "INVENTARIO_ID", precision = 9)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCTO_ID", nullable = false)
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "PERSONA_ID", nullable = false)
	private Persona persona;
	
	/**
	 * Cantidad del producto
	 */
	@Column(name = "CANTIDAD", precision = 4, nullable = false)
	private int cantidad;
	
	/**
	 * Constructor...
	 */
	public Inventario() {
		super();
	}

	/**
	 * Constructor...
	 * @param producto
	 * @param persona
	 * @param cantidad
	 */
	public Inventario(Producto producto, Persona persona, int cantidad) {
		super();
		this.producto = producto;
		this.persona = persona;
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
	 * @return El atributo persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * Establece el valor del atributo persona
	 * @param persona: EL persona a establecer
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
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
