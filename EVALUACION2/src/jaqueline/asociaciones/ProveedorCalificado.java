/**
 * 
 */
package jaqueline.asociaciones;

import java.util.Date;
import java.util.List;

public class ProveedorCalificado { //CLASE

	private Date FechaCalificacion; //ATRIBUTOS
	private int cal_ID;
	private int pr_ID;
	
	
	private List<Caificacion> caificacions; //AGREGACION
	
	private Caificacion caificacion;

	public ProveedorCalificado(List<Caificacion> caificacions,Caificacion caificacion) {
		this.caificacions = caificacions;
		
	}

}
