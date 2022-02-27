
package holamundopoo;

import java.awt.Color;

/**
 *
 * @author die_e
 */
public class HolaMundoPOO {

   public static void main(String[] args) {
        System.out.println("Hola mundo POO");
        Persona per1 = new Persona();
        per1.setNombre("Elias López");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer(" Hamburguesa Hawaina!!");
        
        System.out.println(" ");
        
        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        System.out.println("Nombre: " + per2.getNombre());
        per2.comer(" Una pizza Hawaina!!");
        
        System.out.println(" ");
        
        Auomovil bocho = new Auomovil();
        bocho.setMarca("VW");
        System.out.println("Marca: "+ bocho.getMarca());
        bocho.setSubMarca("Sedan");
        System.out.println("subMarca: "+ bocho.getMarca());
        bocho.setModelo(1970);
        System.out.println("Modelo: "+ bocho.getModelo());
        bocho.setColor(Color.BLUE);
        System.out.println("Color: "+ bocho.getColor());
        
        System.out.println(" ");
        
        Auomovil Akura = new Auomovil();
        Akura.setMarca("Akura");
        System.out.println("Marca: "+ Akura.getMarca());
        Akura.setSubMarca("NSX");
        System.out.println("subMarca: "+ Akura.getMarca());
        Akura.setModelo(2013);
        System.out.println("Modelo: "+ Akura.getModelo());
        Akura.setColor(Color.GRAY);
        System.out.println("Color: "+ Akura.getColor());
        
        System.out.println(" ");
        
         
        Auomovil ford = new Auomovil();
        ford.setMarca("Ford");
        System.out.println("Marca: "+ ford.getMarca());
        ford.setSubMarca("Mustan");
        System.out.println("subMarca: "+ ford.getMarca());
        ford.setModelo(2010);
        System.out.println("Modelo: "+ ford.getModelo());
        ford.setColor(Color.YELLOW);
        System.out.println("Color: "+ ford.getColor());
        
      
        

    }
    
}
