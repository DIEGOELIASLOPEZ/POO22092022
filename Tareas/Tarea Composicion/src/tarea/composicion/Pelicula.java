
package tarea.composicion;

import tarea.composicion.Actor;
import tarea.composicion.Director;
import tarea.composicion.Productora;
        
public class Pelicula {
    private String nombre;
     private int Anno;
    private Director director;
    private Actor actor;
    private Productora productora;

    public Pelicula() {
        
       director = new Director();
       actor = new Actor();
       productora = new Productora();
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnno() {
        return Anno;
    }

    public void setAnno(int Anno) {
        this.Anno = Anno;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", Anno=" + Anno + ", director=" + director + ", actor=" + actor + ", productora=" + productora + '}';
    }
    

  
    
    
    
}
