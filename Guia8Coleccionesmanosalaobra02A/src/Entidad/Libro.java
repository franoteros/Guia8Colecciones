
package Entidad;

/**
 *
 * @author Franoteros
 */
public class Libro {
    private String nombreLibro;
    private int paginas;
    private String autor;
    private int anioPublicacion;

    public Libro(String nombreLibro, int paginas, String autor, int anioPublicacion) {
        this.nombreLibro = nombreLibro;
        this.paginas = paginas;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro() {
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" + "Nombre = " + nombreLibro + ", Cantidad de paginas = " + paginas + ", Autor = " + autor + ", Año de Publicacion = " + anioPublicacion + '}';
    }
    
    

}
