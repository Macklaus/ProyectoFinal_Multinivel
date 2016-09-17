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
 * Entidad parametrica, contiene datos del negocio,
 * niveles que puede tener una persona
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "NIVELES")
public class Nivel implements Serializable{

	@Id
	@Column(name = "NIVEL_ID", precision = 4)
	private int id;
	
	/**
	 * Cantidad de niveles que puede llegar a tener una persona, Afiliado, 
	 * de la empresa
	 */
	@Column(name = "CANTIDAD_NIVELES", precision = 2)
	private int cantidadNivel;
	
	/**
	 * Constructor...
	 */
	public Nivel() {
		super();
	}

	/**
	 * @param cantidadNivel
	 */
	public Nivel(int cantidadNivel) {
		super();
		this.cantidadNivel = cantidadNivel;
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
	 * @return El atributo cantidadNivel
	 */
	public int getCantidadNivel() {
		return cantidadNivel;
	}

	/**
	 * Establece el valor del atributo cantidadNivel
	 * @param cantidadNivel: EL cantidadNivel a establecer
	 */
	public void setCantidadNivel(int cantidadNivel) {
		this.cantidadNivel = cantidadNivel;
	}
	
	
}
