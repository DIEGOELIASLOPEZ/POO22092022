
package Libro;

import atributos.Libro.Autor;
import atributos.Libro.Editorial;




public class Libro {
    private int autor;
    private String editorial;

    public Libro() {
    autor = new Autor ();
    editorial = new Editorial();
        
    }

    public Libro(int autor, String editorial) {
        this.autor = autor;
        this.editorial = editorial;
    }

    public int getAutor() {
        return autor;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", editorial=" + editorial + '}';
    }
    

   
    
   
    
    
    
}
