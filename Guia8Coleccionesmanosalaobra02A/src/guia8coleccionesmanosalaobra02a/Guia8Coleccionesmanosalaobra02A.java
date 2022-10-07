
package guia8coleccionesmanosalaobra02a;

 //* @author Franoteros
import Entidad.Libro;
import Servicio.ServicioLibro;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;


public class Guia8Coleccionesmanosalaobra02A {

    public static void main(String[] args) {
        ServicioLibro sl = new ServicioLibro();
        System.out.println("Libro 01");
        Libro L1 = sl.crearLibro();
        System.out.println("Libro 02");
        Libro L2 = sl.crearLibro();
        System.out.println("Libro 03");
        Libro L3 = sl.crearLibro();
        
        ArrayList<Libro>libros = new ArrayList();
        
        libros.add(L1);
        libros.add(L2);
        libros.add(L3);
        
        Collections.sort(libros, Comparadores.ordenarNombre);
        
        for(Libro aux : libros){
            System.out.println(aux);
        }
        
        
    }

}
