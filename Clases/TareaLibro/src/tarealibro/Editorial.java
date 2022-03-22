
package tarealibro;

public class Editorial {
    private String nombre;
    private String tipoEditorial;

    public Editorial() {
    }

    public Editorial(String nombre, String tipoEditorial) {
        this.nombre = nombre;
        this.tipoEditorial = tipoEditorial;
    }

    public String getTipoEditorial() {
        return tipoEditorial;
    }

    public void setTipoEditorial(String tipoEditorial) {
        this.tipoEditorial = tipoEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", tipoEditorial=" + tipoEditorial + '}';
    }
    
    
}
