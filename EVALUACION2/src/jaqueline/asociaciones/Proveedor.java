/**
 * 
 */
package jaqueline.asociaciones;

import java.util.List;

public class Proveedor {
	
	private double pr_ID;
	private String pr_RazonSocial;
	private String pr_contacto;   //ATRUBOTOS
	private String pr_telefono1;
	private short pr_telefono2;
	private String pr_fax;
	private String pr_email1;
	private String pr_email2;
	private String pr_web;
	private int pr_CUIT;
	private List<Rubro>rubros;
	
	private List<Direccion> direccions; //AGRAGACION

	
	public Proveedor(List<Rubro>rubros,List<Direccion> direccions,Caificacion caificacion, Articulo articulo) {
		this.rubros = rubros;
		this.direccions = direccions;
		
	}

}
