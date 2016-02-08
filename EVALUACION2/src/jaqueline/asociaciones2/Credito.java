/**
 * 
 */
package jaqueline.asociaciones2;


public class Credito extends Pago{ //CLASE

	private int numeroTdeCredito;
	private String tipo;   //ATRIBUTOS
	private fechaDeExp fechaDeExp;
	private String nombre;
	
	public static boolean hacerCargo(double total){
		return false;
	}
	
	public Credito() { //CONSTRUCTOR
		
	}

}
