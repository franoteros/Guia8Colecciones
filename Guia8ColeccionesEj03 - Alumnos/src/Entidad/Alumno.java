
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Franoteros
 */
public class Alumno {
    
    private ArrayList<Integer>Notas;
    private String nombre;

    public Alumno(ArrayList<Integer> Notas, String nombre) {
        this.Notas = Notas;
        this.nombre = nombre;
    }

    public Alumno() {
        Notas = new ArrayList();
    }

    public ArrayList<Integer> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Integer> Notas) {
        this.Notas = Notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Notas=" + Notas + ", nombre=" + nombre + '}';
    }
    
    
    
    

}
