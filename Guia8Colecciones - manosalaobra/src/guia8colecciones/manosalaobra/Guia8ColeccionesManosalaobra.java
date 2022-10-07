
package guia8colecciones.manosalaobra;

 //* @author Franoteros
import Entidad.Persona;
import Servicio.ServicioPersona;

public class Guia8ColeccionesManosalaobra {

    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        System.out.println("Persona 1");
        Persona P1 = sp.crearPersona();
        sp.crearLists(P1);
        //System.out.println("Persona 2");
        //Persona P2 = sp.crearPersona();
        //sp.crearLists(P2);
        //System.out.println("Persona 3");
        //Persona P3 = sp.crearPersona();
        //sp.crearLists(P3);
        //System.out.println("Persona 4");
        //Persona P4 = sp.crearPersona();
        //sp.crearLists(P4);
        System.out.println("Persona 5");
        Persona P5 = sp.crearPersona();
        sp.crearLists(P5);
        
        sp.remover(P5);
        
        sp.mostrarListas(P5);
        
    }

}
