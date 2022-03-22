
package reutilizacióncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Servidor;
import javax.swing.JFrame;

public class ReutilizaciónCodigo2209 {

   
    public static void main(String[] args) {
        String nombre = new String("José José");
        System.out.println(nombre); 
        System.out.println( nombre.charAt(5) ); //Caracter de una pocicion concreta
        System.out.println(nombre.toUpperCase()); //Mayuscua

       // JFrame ventana = new JFrame("Mi primer ventana JAVA");
        //ventana.setSize(600, 400);
        //ventana.setVisible(true);
        
        Computadora miCompu= new Computadora();
        miCompu.setMarca( "Asus");
        miCompu.setCPU(new Procesador("intel", 2.6f));
        System.out.println( miCompu );
        miCompu.getCPU().setMarca("AHD");
        System.out.println( miCompu );
        miCompu.setRaton (new Mouse("Logitech", "Óptico"));
        System.out.println( miCompu );      
        
        Computadora compu2 = new Computadora("Apple", "MacBook Pro",
        new Monitor("Toshiba", 14.3f), 
        new Mouse("Razer", "optico"),
        new Teclado ("Apple", 101),
        new Procesador("M1", 3.4f));
        System.out.println(compu2);
        
       
    /*Alumno alul=new Alumno ();
    alu1.setNombre (" José");
    System.out.println( alul );
                                                            ");
    Alumno alu2 = new Alumno ("1243243244", "ICO", "JOsé Perex", 19);
    System.out.println( alu2 );
    alu1.setNumeroCuenta ("2323232323");
       
        
        //Ejercicio: Establecer un mouse de marca Logitech tipo optico*/ 
    
        System.out.println("\n\n---------------------COMPOSICION Y HERENCIA EN LA MISMA CLASE-----------------------------\n");
        
        Servidor server= new Servidor();
        System.out.println(server);
        server.setNumeroTargetaRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRaton(new Mouse("LG", "Optico"));
        System.out.println(server);
        server.getRaton().setMarca("Logitech");
        System.out.println(server);
      
        
    }
    
}
