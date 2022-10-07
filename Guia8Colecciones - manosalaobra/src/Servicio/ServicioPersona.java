
package Servicio;

import Entidad.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioPersona {
    
    Scanner leer = new Scanner(System.in);
        ArrayList<Integer> numerosA = new ArrayList();
        HashSet<Integer> numerosB = new HashSet();
        HashMap<Integer, String> alumnos = new HashMap();
    
    public Persona crearPersona(){
        Persona P = new Persona();
                
        System.out.println("Ingrese valor de X");
        P.setX(leer.nextInt());
        System.out.println("Ingrese valor de Y");
        P.setY(leer.nextInt());
        System.out.println("Ingrese DNI");
        P.setDni(leer.nextInt());
        System.out.println("Ingrese nombre del alumno");
        P.setNomAlum(leer.next());
        return P;
    }
    
    public void crearLists(Persona P){
        numerosA.add(P.getX());
        numerosB.add(P.getY());
        alumnos.put(P.getDni(), P.getNomAlum());
    }
    
    public void remover(Persona P){
        numerosA.remove(leer.nextInt());
        numerosB.remove(leer.nextInt());
        alumnos.remove(leer.nextInt());
    }
    
    public void mostrarListas(Persona P){
        for (String aux : alumnos.values()){
            System.out.println(aux);
        }
    }

}
