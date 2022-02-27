
package tarealibro;
/**
 * Lopez Martinez Diego Elias
 * 2209
 * Programacion Orientada a Objetos
 * 25/2/2022
 */
public class TareaLibro {

 
    public static void main(String[] args) {
      Libro libro1 = new Libro();
      libro1.setGenero("Novela");
      libro1.setsubGenero("Literatura fantástica");
      libro1.setTitulo("La comunidad del Anillo");
      libro1.setAnno(1954);
      libro1.setEditorial("George Allen & Uwin");
      libro1.setNoDePaginas(423);
      libro1.setNoDeCapitulos(10);
      
        System.out.println("\t\tAtributos");
        System.out.println("Tirulo del Libro: "+ libro1.getTitulo());
        System.out.println("Genero: "+ libro1.getGenero());
        System.out.println("subGenero: "+ libro1.getsubGenero());
        System.out.println("Editorial: "+ libro1.getEditorial());
        System.out.println("Anno: "+ libro1.getAnno());
        System.out.println("Numero de capitulos: "+ libro1.getNoDeCapitulos());
        System.out.println("Numero de paginas: "+ libro1.getNoDePaginas());
        
        System.out.println("\n\t\tMetodos");
        libro1.Finalizar(" fue leido en el tiempo indicado");
        libro1.FechaDeEntrega(" no fue entregado en el tiempo indicado");
    }
    
    
    
}
