
package servicio;

import entidad.alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class servicioalumno {
    
    Scanner sc = new Scanner(System.in);
	
	ArrayList<alumno> alumnos = new ArrayList();
	
	
	public void crearAlumno() {
				
		String respuesta = "";
			
		do{	
			
			alumno a = new alumno();
			System.out.println("Quiere ingresar un alumno? ");
			respuesta = sc.next();
			
			if(respuesta.equalsIgnoreCase("si")) {
					
				System.out.println("ingrese nombre ");
				a.setNombre(sc.next());
				
				System.out.println("ingrese las tres notas ");
				a.getNotas().add(sc.nextInt());
				a.getNotas().add(sc.nextInt());
				a.getNotas().add(sc.nextInt());
				
				alumnos.add(a);
				
			}		
			
		}while(respuesta.equalsIgnoreCase("si"));
	
		System.out.println(alumnos.toString());		
	}
	
	
	public void notaFinal() {
		
		
		System.out.println("ingrese el nombre del alumno a buscar ");
		String nombre = sc.next();
		boolean validador = false;
		
		for (alumno a : alumnos) {
			
			if(nombre.equalsIgnoreCase(a.getNombre())) {
				
				validador = true;
				float promedio;
				int sumatoria = 0;
				
				for (Integer n : a.getNotas()) {
					
					sumatoria += n;				
				}
					
				promedio = sumatoria / a.getNotas().size();	
				
				System.out.println("el promedio es "+promedio);
				
				}	
			}
		
		if(validador = false) {
			
			System.out.println("El alumno no se encontro");
			
		}
		
		}
			
}


