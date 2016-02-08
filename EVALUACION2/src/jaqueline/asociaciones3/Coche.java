/**
 * 
 */
package jaqueline.asociaciones3;

import java.util.List;

public class Coche { //CLASE

	private Persona conductor;
	
	private List<Motor> motors; //AGREGACION

	public Coche(List<Motor>motors) { //CONSTRUCTOR DE LA CLASE
		this.motors = motors;
	
	}
	public void asignaConductor(){ //METODO DE LA CLASE
		
	}
	public void enciende(){
		
	}
	public void apaga(){
		
	}
	public void acelera(){
		
	}
	public void frena(){
		
	}
	public  boolean estaEncendido(){
		return false;
		
	}

}
