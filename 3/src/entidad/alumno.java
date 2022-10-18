
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Franoteros
 */
public class alumno {
    
    private String nombre;
	private ArrayList<Integer> notas = new ArrayList<Integer>(3);
	
	public alumno() {
	}

	public alumno(String nombre, ArrayList<Integer> notas) {
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Integer> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Alumno " + nombre + ", notas =" + notas + "]";
	}

}
