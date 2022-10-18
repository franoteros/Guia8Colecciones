
package guia8coleccionesej02;

 //* @author Franoteros
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Guia8Coleccionesej02 {

    public static void main(String[] args) {
        ArrayList<String>razasPerros = new ArrayList();//creo el arrayList de razasPerros
        Scanner leer = new Scanner(System.in);
        Boolean check = false;
        String salir = "";
        String razaEliminada = "";
        
        do{
            System.out.println("Ingrese una raza de perro");
            razasPerros.add(leer.nextLine());//agrego un perro con el LEER
            System.out.println("Desea seguir añadiendo razas? si o no");
            salir = leer.nextLine();
            while(!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no")){
                System.out.println("Ingrese una opcion valida: si o no");
                salir = leer.nextLine();
        }
            
        }while (salir.equalsIgnoreCase("si"));
        
        for (String razas : razasPerros) {//voy mostrando la lista
            System.out.println(razas);
        }
        
        Iterator<String> it = razasPerros.iterator();//creo el Iterator para las razasPerros
        System.out.println("Ingresar una raza a eliminar");
        razaEliminada = leer.nextLine(); 
        
        while(it.hasNext()){        
            if(it.next().equals(razaEliminada)){
                it.remove();
                check = true;
            }     
        }
        
        if(check == false){
                System.out.println("La raza informada no se encuentra");
                Collections.sort(razasPerros);
                for (String razas : razasPerros) {//voy mostrando la lista
                System.out.println(razas);
                }
        }
        
                if(check == true){
                System.out.println("La raza se elimino correctamente");
                Collections.sort(razasPerros);
                for (String razas : razasPerros) {//voy mostrando la lista
                System.out.println(razas);
                }
        }
        
        
        
        
        
        
        
    }

}
