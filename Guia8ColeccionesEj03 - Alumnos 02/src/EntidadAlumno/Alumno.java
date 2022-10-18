
package EntidadAlumno;

import java.util.ArrayList;

/**
 *
 * @author Franoteros
 */
public class Alumno {
    
    private String nombre;
    private ArrayList<Integer> listaNotas;

    public Alumno(String nombre, ArrayList<Integer> listaNotas) {
        this.nombre = nombre;
        this.listaNotas = listaNotas;
    }

    public Alumno() {
        listaNotas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + nombre + ", Notas=" + listaNotas + '}';
    }

    
    

}
