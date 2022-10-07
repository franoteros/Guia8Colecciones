
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioLibro {
    Scanner leer = new Scanner(System.in);
    
    public Libro crearLibro(){
        Libro L = new Libro();
        leer.nextLine();
        System.out.println("Ingrese nombre del libro");
        L.setNombreLibro(leer.nextLine());
        System.out.println("Ingrese el autor");
        L.setAutor(leer.nextLine());
        System.out.println("Ingrese año de publicacion");
        L.setAnioPublicacion(leer.nextInt());
        System.out.println("Ingrese cantidad de paginas");
        L.setPaginas(leer.nextInt());
        return L;
    }
    
    

}
