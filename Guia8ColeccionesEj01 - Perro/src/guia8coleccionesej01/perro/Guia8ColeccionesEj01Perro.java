
package guia8coleccionesej01.perro;

 //* @author Franoteros
import java.util.ArrayList;
import java.util.Scanner;


public class Guia8ColeccionesEj01Perro {

    public static void main(String[] args) {
        ArrayList<String>razasPerros = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String salir = "";
        
        do{
            System.out.println("Ingrese una raza de perro");
            razasPerros.add(leer.nextLine());
            System.out.println("Desea seguir añadiendo razas? si o no");
            salir = leer.nextLine();
            while(!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no")){
                System.out.println("Ingrese una opcion valida: si o no");
                salir = leer.nextLine();
        }
            
        }while (salir.equalsIgnoreCase("si"));
        
        for (String razas : razasPerros) {
            System.out.println(razas);
            
        }
        
    }

}
