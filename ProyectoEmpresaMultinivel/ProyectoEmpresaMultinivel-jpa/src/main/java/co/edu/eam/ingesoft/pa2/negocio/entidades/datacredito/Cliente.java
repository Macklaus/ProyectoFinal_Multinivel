/**
 *
 */
package co.edu.eam.ingesoft.pa2.negocio.entidades.datacredito;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.pa2.negocio.entidades.Persona;

/**
 * Entidad que contiene los datos de los 
 * clientes de una persona afiliada a la empresa
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 9/10/2016<br/>
 */
@Entity
@Table(name = "CLIENTES")
public class Cliente implements Serializable{

	@Id
	@Column(name = "CLIENTE_ID", precision = 13)
	private long id;
	
	/**
	 * afiliado de la empresa que le 
	 * vende a este cliente
	 */
	@ManyToOne
	@JoinColumn(name = "PERSONA_ID", nullable = false)
	private Persona afiliado;
	
	@Column(name = "NOMBRE", length = 40, nullable = false)
	private String nombre;
	
	@Column(name = "APELLIDO", length = 40, nullable = false)
	private String apellido;
	
	@Column(name = "TELEFONO", length = 12, nullable = false)
	private String telefono;
	
	@Column(name = "DIRECCION", length = 60, nullable = false)
	private String direcion;
	
	@Column(name = "EMAIL", length = 40, nullable = true)
	private String email;
	
	/**
	 * Constructor...
	 */
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor...
	 * @param id
	 * @param afiliado
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 * @param direcion
	 * @param email
	 */
	public Cliente(long id, Persona afiliado, String nombre, String apellido, String telefono, String direcion,
			String email) {
		super();
		this.id = id;
		this.afiliado = afiliado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direcion = direcion;
		this.email = email;
	}

	/**
	 * @return El atributo id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Establece el valor del atributo id
	 * @param id: EL id a establecer
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return El atributo afiliado
	 */
	public Persona getAfiliado() {
		return afiliado;
	}

	/**
	 * Establece el valor del atributo afiliado
	 * @param afiliado: EL afiliado a establecer
	 */
	public void setAfiliado(Persona afiliado) {
		this.afiliado = afiliado;
	}

	/**
	 * @return El atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el valor del atributo nombre
	 * @param nombre: EL nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return El atributo apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Establece el valor del atributo apellido
	 * @param apellido: EL apellido a establecer
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return El atributo telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Establece el valor del atributo telefono
	 * @param telefono: EL telefono a establecer
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return El atributo direcion
	 */
	public String getDirecion() {
		return direcion;
	}

	/**
	 * Establece el valor del atributo direcion
	 * @param direcion: EL direcion a establecer
	 */
	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	/**
	 * @return El atributo email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Establece el valor del atributo email
	 * @param email: EL email a establecer
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
