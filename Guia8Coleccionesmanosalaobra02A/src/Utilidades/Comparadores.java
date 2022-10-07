
package Utilidades;

import Entidad.Libro;
import java.util.Comparator;

/**
 *
 * @author Franoteros
 */
public class Comparadores {
    
    public static Comparator<Libro> ordenarNombre = new Comparator<Libro> () {
        @Override
        public int compare(Libro L1, Libro L2) {
            return L2.getNombreLibro().compareTo(L1.getNombreLibro());
            }
        };

}