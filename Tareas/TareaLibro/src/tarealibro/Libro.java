package tarealibro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author die_e
 */
public class Libro 
{
    private int NoDePaginas;
    private String Editorial;
    private int NoDeCapitulos;
    private String Genero;
    private String subGenero;
    private int Anno;
    private String Titulo;
    

    public Libro() {
    }

    public Libro(int NoDePaginas, String Editorial, int NoDeCapitulos, String Categoria, int Anno) {
        this.NoDePaginas = NoDePaginas;
        this.Editorial = Editorial;
        this.NoDeCapitulos = NoDeCapitulos;
        this.Genero = Genero;
        this.subGenero = subGenero;
        this.Anno = Anno;
        this.Titulo = Titulo;
    }

    public int getAnno() {
        return Anno;
    }

    public void setAnno(int Anno) {
        this.Anno = Anno;
    }

    public int getNoDePaginas() {
        return NoDePaginas;
    }

    public void setNoDePaginas(int NoDePaginas) {
        this.NoDePaginas = NoDePaginas;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getNoDeCapitulos() {
        return NoDeCapitulos;
    }

    public void setNoDeCapitulos(int NoDeCapitulos) {
        this.NoDeCapitulos = NoDeCapitulos;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
     public String getsubGenero() {
        return subGenero;
    }

    public void setsubGenero(String subGenero) {
        this.subGenero = subGenero;
    }
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "NoDePaginas=" + NoDePaginas + ", Editorial=" + Editorial + ", NoDeCapitulos=" + NoDeCapitulos + ", Genero=" + Genero + ", subGenero=" + subGenero + ", Anno=" + Anno + ", Titulo=" + Titulo + '}';
    }
    public void Finalizar(String leido){
        System.out.println("El ibro" + leido );
    }
 public void FechaDeEntrega(String Fecha){
     System.out.println("El libro " + Fecha);
 }
}
