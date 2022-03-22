
package tarea.composicion;

public class Productora {
    private String nombre;
    private int annoFundacion;

    public Productora() {
    }

    public Productora(String nombre, int annoFundacion) {
        this.nombre = nombre;
        this.annoFundacion = annoFundacion;
    }

    public int getAnnoFundacion() {
        return annoFundacion;
    }

    public void setAnnoFundacion(int annoFundacion) {
        this.annoFundacion = annoFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", annoFundacion=" + annoFundacion + '}';
    }
    
    
}
