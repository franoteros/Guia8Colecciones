
package guia8coleccionesmanosalaobra02;

 //* @author Franoteros
import java.util.ArrayList;
import java.util.Scanner;


public class Guia8ColeccionesManosalaobra02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String>Libros = new ArrayList();
        String nomLibro;
        for(int i =0; i<3;i++){
            System.out.println("Ingrese el libro numero " + (i+1));
            nomLibro = leer.nextLine();
            Libros.add(nomLibro);
        }
        
        for (String Libro : Libros) {
            System.out.println(Libro);
            
        }
    }

}
