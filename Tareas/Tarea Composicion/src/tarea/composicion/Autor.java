
package tarea.composicion;

public class Autor
{
private String nombre;
private int edad;

    public Autor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    Autor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    
}
