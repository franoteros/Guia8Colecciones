
package ServicioPeliculas;

import Entidad.Pelicula;
import Utilitarios.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioPelicula {
    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula>peliculas = new ArrayList();
    
    public void crearPelicula(){
        String seguir = "";
        
        do{
            
            Pelicula P = new Pelicula();
            
            System.out.println("Desea agregar una pelicula?");
            seguir = leer.next();
            
            if(seguir.equals("s")){
            
            System.out.println("Ingrese el nombre de la pelicula");
            P.setNombre(leer.next());
            System.out.println("Ingrese el nombre del director");
            P.setDirector(leer.next());
            System.out.println("Ingrese duracion de la pelicula (en horas)");
            P.setDuracion(leer.nextDouble());
            
            peliculas.add(P);
            }
            
        }while(seguir.equals("s"));
        
        for(Pelicula aux : peliculas){
            System.out.println(aux);
        }
        System.out.println("-----------------------------------------");
    }
    
    public void mostrarPeliculas1hs(){
        System.out.println("Peliculas con duracion mayor a 1 hora");
        for(Pelicula aux : peliculas){
            if(aux.getDuracion()>1){
                System.out.println("La pelicula " + aux.getNombre() + " dura " + aux.getDuracion() + "hs");
            }
        }
        System.out.println("-----------------------------------------");
    }
    
    public void mostrarAscendente(){
        System.out.println("Orden ascendente de duracion");
        Collections.sort(peliculas, Comparadores.ordenarAscendente);
        for(Pelicula aux : peliculas){
            System.out.println(aux);
        }
        System.out.println("-----------------------------------------");
    }
    
    public void mostrarDescendente(){
        System.out.println("Orden descendente de duracion");
        Collections.sort(peliculas, Comparadores.ordenarDescendente);
        for(Pelicula aux : peliculas){
            System.out.println(aux);
        }
        System.out.println("-----------------------------------------");
    }
    
    public void mostrarTitulos(){
        System.out.println("Orden ascendente de titulos");
        Collections.sort(peliculas, Comparadores.ordenarTitulo);
        for(Pelicula aux : peliculas){
            System.out.println(aux);
        }
    }
    

}
