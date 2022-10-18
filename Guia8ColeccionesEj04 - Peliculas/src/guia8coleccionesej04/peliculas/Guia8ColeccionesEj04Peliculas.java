
package guia8coleccionesej04.peliculas;

 //* @author Franoteros
import Entidad.Pelicula;
import ServicioPeliculas.ServicioPelicula;


public class Guia8ColeccionesEj04Peliculas {

    public static void main(String[] args) {
        
        ServicioPelicula sp = new ServicioPelicula();
        sp.crearPelicula();
        sp.mostrarPeliculas1hs();
        sp.mostrarAscendente();
        sp.mostrarDescendente();
        sp.mostrarTitulos();
        
    }

}
