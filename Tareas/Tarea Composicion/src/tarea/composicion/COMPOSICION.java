
package tarea.composicion;

import tarea.composicion.Libro;
import tarea.composicion.Autor;
import tarea.composicion.Actor;
import tarea.composicion.Director;
import tarea.composicion.Productora;
import tarea.composicion.Pelicula;

import javax.swing.JFrame;
        
public class COMPOSICION {
    public static void main(String [] args){
        
      Libro libro1 = new Libro();  
      libro1.setNombreLibro("Harry Potter");
      libro1.setAnnoLibro(1998);
      libro1.setCreador(new Autor("JK Rowling", 56));
      libro1.setEditoriaal(new Editorial("Penguin Random House", "Libros"));
      System.out.println(libro1);
      
      Pelicula peli1 = new Pelicula();
      peli1.setNombre("Inception");
      peli1.setAnno(2010);
      peli1.setActor(new Actor("Leondardo DiCaprio", 47));
      peli1.setDirector(new Director ("Crisphoer Nolan", 51));
      peli1.setProductora(new Productora("Warner Bros", 1923));
      System.out.println(peli1);
      
      
      
      
      
      
      
    }
    
}
