/**
 * 
 */
package jaqueline.asociaciones;

import java.util.Date;
import java.util.List;

public class Pedido { //clase pedido
	
	private double pe_id;
	private Date pe_fechapedido;
	private Date pe_fechanecesidad; //atrubutos de la clase
	private Date pe_fechaprogramada;
	private Date pe_fechaentrega;
	private int pe_estado;
	
	private List<Articulo> articulos;
	
//agregacion
	public Pedido(List<Articulo> articulos) {
		this.articulos = articulos;
	}

}
