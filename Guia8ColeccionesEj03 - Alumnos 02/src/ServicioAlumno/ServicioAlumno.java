
package ServicioAlumno;

import EntidadAlumno.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioAlumno {
    
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();
    
    public void crearAlumno(){
        
        String opcion = "s";
        
        do{

            Alumno AL = new Alumno();
            
            System.out.print("Desea ingresar un alumno? (s/n): ");
            opcion = leer.next();

            if(opcion.equals("s")){
                
            System.out.println("Ingrese nombre del alumno");
            AL.setNombre(leer.next());
            System.out.println("Ingrese primer nota");
            AL.getListaNotas().add(leer.nextInt());
            System.out.println("Ingrese primer nota");
            AL.getListaNotas().add(leer.nextInt());
            System.out.println("Ingrese primer nota");
            AL.getListaNotas().add(leer.nextInt());

            alumnos.add(AL);
            }
        
        }while(opcion.equalsIgnoreCase("s"));
        
        for(Alumno aux : alumnos){
            System.out.println(aux);
        }
        
    }
    
//    public ArrayList<Alumno> crearListaAlumnos(){
//        
//        ArrayList<Alumno> alumnos = new ArrayList();
//        String opcion = "s";
//        do{
//           Alumno AL = crearAlumno();
//            alumnos.add(AL);
//            do {
//                System.out.print("Desea ingresar otro alumno? (s/n): ");
//                opcion = leer.next();
//                System.out.println("");
//            } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));
//        } while(opcion.equalsIgnoreCase("s"));
//        
//        return alumnos;
//    }
    
//        public void leerLista(ArrayList<Alumno> alumnos){
//        for(Alumno aux : alumnos){
//            System.out.println(aux);
//        }
//    }
//        
//        public void leerNotas(ArrayList<Alumno> listaNotas, Alumno AL){
//        for(Alumno aux : listaNotas){
//            System.out.println(aux);
//        }
//    }
    
    public void notaFinal(){
      
        System.out.println("Ingrese el alumno a calcular el promedio");
        
        String nom = leer.next();
        boolean check = false;
        
        for(Alumno aux : alumnos){
            if(nom.equals(aux.getNombre())){
                check = true;
                Double promedio = 0.0;
                Integer suma = 0;
                
                for(Integer aux2 : aux.getListaNotas()){
                    suma = aux2 + suma;
                }
                promedio = suma/3.0;
                System.out.println("El promedio del alumno es de " + promedio);
            }else{
                System.out.println("El alumno no se encuentra");
            }
        }


    }

}
