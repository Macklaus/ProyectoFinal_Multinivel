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
 * es el porcentaje de ayuda en las ventas que le dan 
 * las personas en la rama de una persona en especifico
 * @author Sebastian Cardona Morales<br/>
 *         email: krdona-k44@hotmail.com<br/>
 *         Fecha: 31/08/2016<br/>
 */
@Entity
@Table(name = "PCT_BONIFICACIONES")
public class PCTBonificacion implements Serializable{

	@Id
	@Column(name = "PCT_BONIFICACION_ID", precision = 3)
	private int id;
	
	/**
	 * porcentaje de ayuda de las ventas que realizen las personas 
	 * del nivel directo (primer nivel) al lider de la rama 
	 */
	@Column(name = "PORCENTAJE", precision = 3, scale = 2)
	private double porcentaje;
	
	/**
	 * Es el porcentaje que va disminuyendo por cada nivel hacia 
	 * abajo en la rama de una persona en especifico.
	 * 
	 * Ejemplo:
	 * Nivel 1 --> 30%
	 * Nivel 2 --> 25%
	 * Nivel 3 --> 20%
	 * Nivel 4 --> 15%
	 * 
	 * la diferenciaNivel en el ejemplo es 5%
	 */
	@Column(name = "DIFERENCIA_NIVEL", precision = 3, scale = 2)
	private double difereciaNivel;
	
	/**
	 * Constructor...
	 */
	public PCTBonificacion() {
		super();
	}

	/**
	 * Constructor...
	 * @param porcentaje
	 * @param difereciaNivel
	 */
	public PCTBonificacion(double porcentaje, double difereciaNivel) {
		super();
		this.porcentaje = porcentaje;
		this.difereciaNivel = difereciaNivel;
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
	 * @return El atributo porcentaje
	 */
	public double getPorcentaje() {
		return porcentaje;
	}

	/**
	 * Establece el valor del atributo porcentaje
	 * @param porcentaje: EL porcentaje a establecer
	 */
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	/**
	 * @return El atributo difereciaNivel
	 */
	public double getDifereciaNivel() {
		return difereciaNivel;
	}

	/**
	 * Establece el valor del atributo difereciaNivel
	 * @param difereciaNivel: EL difereciaNivel a establecer
	 */
	public void setDifereciaNivel(double difereciaNivel) {
		this.difereciaNivel = difereciaNivel;
	}
	
	
}
