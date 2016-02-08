/**
 * 
 */
package jaqueline.asociaciones;

import java.util.List;

public class Articulo { //clase articulo
	
	private String art_ID;
	private String art_Descripcion; //atrubutos dxe la clase
	private int art_estado;
	private int art_tipo;
	private int art_cantidad;
	private double art_cantidadcritica;
	private double art_cantidaddoble;
	//agregaciones
	private List<Rubro>rubros;

	public Articulo(List<Rubro>rubros,Precios precios) {
		this.rubros = rubros;
		
	}

}
