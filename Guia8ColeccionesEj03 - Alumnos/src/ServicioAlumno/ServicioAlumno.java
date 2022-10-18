
package ServicioAlumno;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioAlumno {
    
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno>alumno = new ArrayList();
    ArrayList<Integer>nota = new ArrayList();
    int notaAlumno;
    
    public ArrayList<Alumno> crearListaAlumno(){
        ArrayList<Alumno>alumnos = new ArrayList();
        String seguir = "";
        
        do{
            Alumno Al = crearAlumno();
            alumnos.add(Al);
            System.out.println("Desea agregar otro alumno? s/n");
            leer.nextLine();
            seguir = leer.nextLine();
        }while(seguir.equals("s"));
        return alumnos;
    }
    
    
    public Alumno crearAlumno(){
        Alumno Al = new Alumno();

            System.out.println("Ingrese nombre del alumno");
            Al.setNombre(leer.nextLine());
            System.out.println("Ingrese la primer nota");
            notaAlumno = leer.nextInt();
            nota.add(notaAlumno);
            System.out.println("Ingrese la segunda nota");
            notaAlumno = leer.nextInt();
            nota.add(notaAlumno);
            System.out.println("Ingrese la tercer nota");
            notaAlumno = leer.nextInt();
            nota.add(notaAlumno);

        return Al;
    }
    
    public void notaFinal(Alumno Al){
        double promedio;
        String nom;
        System.out.println("Ingrese nombre del alumno a calcular");
        leer.nextLine();
        nom = leer.nextLine();
        Integer suma = 0;
        int i = 0;
        
        if(nom.equals(Al.getNombre())){
//            Iterator it = nota.iterator();
//            while(it.hasNext()){
//                if(it.next() == nota){
//                    suma = suma + notaAlumno;
//                }
//            }
        for(Integer aux : nota){
//            suma = aux + suma;
              System.out.println(aux);
            }
        }
        //promedio = suma/3;
        
    }

}
