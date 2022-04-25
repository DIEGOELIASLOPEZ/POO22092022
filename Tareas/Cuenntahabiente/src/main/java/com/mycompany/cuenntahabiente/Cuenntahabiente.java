/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cuenntahabiente;

/**
 *
 * @author die_e
 */
public class Cuenntahabiente {

    public static void main(String[] args) {
        Datos[] cliente = new Datos[5];
        cliente[0] = new Datos("HDIER98345496", "David", 2300000f);
        cliente[1] = new Datos("EROSA23842164", "Beatriz", 28730000f);
        cliente[2] = new Datos("YUMSG12345532", "Juna", 30000902.3f);
        cliente[3] = new Datos("ZDTUM97596595", "Fernanda", 231000000.9f);
        cliente[4] = new Datos("QGPZA93784534", "Jose", 50000000.3f);
        
        System.out.println(cliente[0]);
        cliente[0].retirarDinero(50000);
        
        System.out.println(cliente[1]);
        cliente[1].retirarDinero(50000);
        
        System.out.println(cliente[2]);
        cliente[2].retirarDinero(50000);
        
        System.out.println(cliente[3]);
        cliente[3].retirarDinero(50000);
        System.out.println(cliente[4]);
        cliente[0].retirarDinero(50000);
        
        
        for(Cuenntahabiente i : cliente)
        {
            System.out.println(i.evaluarNivelCliente()); 
        }
        
    }
        
}
