
package Entidad;

/**
 *
 * @author Franoteros
 */
public class Persona {
    
    private int x;
    private int y;
    private int dni;
    private String nomAlum;

    public Persona() {
    }

    public Persona(int x, int y, int dni, String nomAlum) {
        this.x = x;
        this.y = y;
        this.dni = dni;
        this.nomAlum = nomAlum;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNomAlum() {
        return nomAlum;
    }

    public void setNomAlum(String nomAlum) {
        this.nomAlum = nomAlum;
    }

    @Override
    public String toString() {
        return "Persona{" + "x=" + x + ", y=" + y + ", dni=" + dni + ", nomAlum=" + nomAlum + '}';
    }
    
    

}
