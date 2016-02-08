/**
 * 
 */
package jaqueline.asociaciones3;

import java.util.ArrayList;
import java.util.List;

public class Persona { //CLASE
	
	public String nombre;
	private Coche coche;

	private List<Corazon> corazons; //COMPOSICION

	public Persona(String nom) {
		this.corazons = new ArrayList<Corazon>(); {
		};
	}
	
	public void asignaCoche(Coche c){
	}
}
