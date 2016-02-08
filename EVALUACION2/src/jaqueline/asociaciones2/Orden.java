/**
 * 
 */
package jaqueline.asociaciones2;

import java.util.List;

public class Orden { //CLASE

	private int hora;
	private String mesero;
	private Cliente cliente; //ATRIBUTOS DE LA CLASE
	private List<Bebida> bebidas;
	private List<Platillo>platillos;
	
	private Pago pago;

	public Orden(List<Bebida> bebidas, List<Platillo>platillos) { //AGREGACION Y CONSTRUCTOR
		this.bebidas = bebidas;
		this.platillos = platillos;
	}

}
