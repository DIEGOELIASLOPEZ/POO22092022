package javabasico2209parte2;

import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.herencia.EstudianteDeportista;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaBasico2209Parte2 {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("_______________________________");
        Scanner teclado = new Scanner(System.in);
        int seleccion = teclado.nextInt();

        String elNombre = " ";
        try {
            seleccion=teclado.nextInt();
            elNombre = nombres.get(seleccion);

        } catch (InputMismatchException ie) {
            System.out.println("Debnes teclear valores numericos");
            elNombre = nombres.get(0);
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("Erro debe ser entre 0 y 4");
            elNombre = nombres.get(0);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Generica ");
            elNombre = nombres.get(1);
        } finally {
            System.out.println(elNombre);
        }

        // System.out.println(nombres.get(seleccion));
      //  System.out.println("Continua el Programa...");
        System.out.println("Fin del Programa :)");
        System.out.println("------------------HAST AQUI-----------------");
        
        Cuadrado cuad = new Cuadrado(5.0f);
        Circulo circ = new Circulo(4.5f);
        
        System.out.println("Area del cuadrado es: "+ cuad.calcularArea());
        System.out.println("Area del circulo es " + circ.calcularArea());
        
        System.out.println("_________________________________________________________");
        EstudianteDeportista eda = new EstudianteDeportista();
        eda.setNombre("Diana");
        eda.setCarrera("ICO");
        eda.setDisiplinaDeportiva("Futbol");
        eda.setGeneroArtístico("Fotografia, Estampa, dibuyjo ");
        eda.comer();
        eda.ensayar();
        eda.entrenar();
        System.out.println(eda);
                
    }
    

}
