
package tarea.composicion;
import tarea.composicion.Libro;
import tarea.composicion.Autor;
        

public class Libro {
    private String nombreLibro;
    private int annoLibro;
    
    private Autor creador;
    private Editorial editoriaal;
    
    public Libro(){
      
      creador = new Autor();  
      editoriaal = new Editorial();
      
    }


    public Libro(String nombreLibro, int annoLibro, Autor creador, Editorial editoriaal) {
        this.nombreLibro = nombreLibro;
        this.annoLibro = annoLibro;
        this.creador = creador;
        this.editoriaal = editoriaal;
    }

    public Editorial getEditoriaal() {
        return editoriaal;
    }

    public void setEditoriaal(Editorial editoriaal) {
        this.editoriaal = editoriaal;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getAnnoLibro() {
        return annoLibro;
    }

    public void setAnnoLibro(int annoLibro) {
        this.annoLibro = annoLibro;
    }

    public Autor getCreador() {
        return creador;
    }

    public void setCreador(Autor creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombreLibro=" + nombreLibro + ", annoLibro=" + annoLibro + ", creador=" + creador + ", editoriaal=" + editoriaal + '}';
    }

    void setCreador(String jk_Rowling) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
