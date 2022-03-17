
package reutilizacióncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Procesador;
import javax.swing.JFrame;

public class ReutilizaciónCodigo2209 {

   
    public static void main(String[] args) {
        String nombre = new String("José José");
        System.out.println(nombre); 
        System.out.println( nombre.charAt(5) ); //Caracter de una pocicion concreta
        System.out.println(nombre.toUpperCase()); //Mayuscua

        JFrame ventana = new JFrame("Mi primer ventana JAVA");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        
         Computadora miCompu= new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println( miCompu );
      
        
    }
    
}
