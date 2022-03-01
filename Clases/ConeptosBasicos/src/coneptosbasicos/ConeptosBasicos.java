
package coneptosbasicos;
import ico.fes.Automovil;
import ico.fes.Silla;
import java.awt.Color;


/**
 * @Diego Elias Lopez Martinez
 */
public class ConeptosBasicos {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Silla sl = new Silla();
        System.out.println( sl );
        System.out.println( sl.toString () );

        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);
        
        Automovil miMustang = new Automovil("Ford", "Mustas", 2010, Color.yellow);
        System.out.println(miMustang);
        
        Automovil miAukura = new Automovil("Akura", "NSX", 2013, Color.gray);
        System.out.println(miAukura);
    }
    
}
