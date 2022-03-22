
package tarea.composicion;

public class Editorial 
{
    private String nombreEditorial;
    private String TipoEditorial;

    public Editorial(String nombreEditorial, String TipoEditorial) {
        this.nombreEditorial = nombreEditorial;
        this.TipoEditorial = TipoEditorial;
    }

    Editorial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getTipoEditorial() {
        return TipoEditorial;
    }

    public void setTipoEditorial(String TipoEditorial) {
        this.TipoEditorial = TipoEditorial;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreEditorial=" + nombreEditorial + ", TipoEditorial=" + TipoEditorial + '}';
    }
    
    
}
