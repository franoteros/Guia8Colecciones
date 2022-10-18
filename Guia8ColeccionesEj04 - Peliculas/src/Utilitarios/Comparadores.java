
package Utilitarios;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Franoteros
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
            

}
