
package Entidad;

/**
 *
 * @author Franoteros
 */
public class Pelicula {
    
    private String nombre;
    private String director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String nombre, String director, Double duracion) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Nombre = " + nombre + ", Director = " + director + ", Duracion = " + duracion + "hs" + '}';
    }
    
    

}
