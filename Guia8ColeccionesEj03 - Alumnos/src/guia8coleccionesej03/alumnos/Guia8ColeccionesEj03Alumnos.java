
package guia8coleccionesej03.alumnos;

 //* @author Franoteros
import Entidad.Alumno;
import ServicioAlumno.ServicioAlumno;
import java.util.ArrayList;


public class Guia8ColeccionesEj03Alumnos {

    public static void main(String[] args) {
        ServicioAlumno sa = new ServicioAlumno();
        ArrayList<Alumno>alumnos = sa.crearListaAlumno();
        Alumno Al1 = sa.crearAlumno();
        //System.out.println("El promedio del alumno es " + sa.notaFinal(Al1));
        sa.notaFinal(Al1);
    }

}
