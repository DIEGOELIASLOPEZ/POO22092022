
package javabasico2209;

import javax.swing.JOptionPane;
import javabasico2209.ALUMNO;

public class JavaBasico2209 {


    public static void main(String[] args) {
        int edad =20;
        System.out.println("Edad = " + edad);
        Integer edad2 = new Integer(22);
        System.out.println( edad2 );
        double x = edad2.doubleValue();
        System.out.println(x);
         System.out.println( edad2. shortValue() );
        System.out.println("_________________________________________________________________________________________________\n");
        
        String cadena="99";
        int altura = Integer.parseInt(cadena);  
        
        altura +=1;
        System.out.println("Altura = "+ altura);
        
        float y= Float.parseFloat(cadena);
        y=y + 0.5f;
        System.out.println("Altura = "+ y);
        
        System.out.println("_________________________________________________________________________________________________\n");
        
        Arbol tree1 = new Arbol(2.4f, 15);
        Arbol tree2 = new Arbol(2.4f, 15);
        Arbol tree3 = new Arbol(2.4f, 15);
        Arbol tree4 = new Arbol(2.4f, 15);
              
        
        System.out.println(tree1);
        System.out.println("Troncos de un abol: "+ tree1.tronco);
        System.out.println("Troncos de un abol: "+ tree2.tronco);
        System.out.println("Troncos de un abol: "+ tree3.tronco);
        System.out.println("Troncos de un abol: "+ tree4.tronco);
        
       //JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane. INFORMATION_MESSAGE);
      // String dato=JOptionPane.showInputDialog(null, "Dame tu edad");
        System.out.println("dato");
        
        int edad3 = 15;
        String resultado = "";
        if(edad < 18){
        resultado = "Menor de edad";
        }else{
            resultado = "Mayor de edad, ten un tequila para la garganta";

                
    }
        System.out.println(resultado);
        int edad4=15;
        String res="";
        res=edad<18? "Menor de eddad": "Mayor de edad, tequila";
        System.out.println(res);
        
        int edad5 = 19;
        System.out.println( edad5 < 18? "Menor de edad 5":"Ya! el tequila" );
         int
            vall = 1;
            int val2 = 1;

    System.out.println( vall & val2 );
        int val3 = 1 ; // 0000...0001
        
int val4 = 0;
val4 = val3 << 2; 




System.out.println( val4 ); 
System.out.println("-------Aregrlos---------");
int[] edades;
edades= new int[5];
        System.out.println(edades);
        
edades[0] =10;
        System.out.println("La primera edad es: " +edades[0]);
int [] estutra = new int[5];
  int [] pesos ={86,99,56,76,77}; // en kilos

        System.out.println(pesos[0]);
        System.out.println(pesos[1]);
         System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);
        
        System.out.println("-----CON FOR-----");
        for (int i = 0; i > pesos.length; i++) {
System.out.println( pesos[i] );
    }
            System.out.println("-----CON FOR iNVERSO-----");
        for (int K = pesos.length-1; K>= 0; K--) {
System.out.println( pesos[K] );}

          System.out.println("Arreglo de alumnos");
    ALUMNO[] lista = new ALUMNO [5];
lista[0] = new ALUMNO ("99999", 2,9.0f);
lista[1] = new ALUMNO ("77777", 2, 7.0f);
lista[2] = new ALUMNO ("55555", 2, 7.0f);
lista[3] = new ALUMNO ("88888", 2, 8.0f);
lista[4] = new ALUMNO ("66666", 2, 6.0f);
for (int i = 0; i < lista. length; i++) {
ALUMNO alumno = lista[i];
System.out.println( alumno.evaluarDesempenio() );
}

 System.out.println("Con for each ...");
for (ALUMNO alumno : lista) {
System.out.println( alumno.evaluarDesempenio ());

}


}
}

