package holamundopoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author die_e
 */
public class Persona {

    int edad;              //Declaracion de atributos
    String nombre;         //........................

    //METODO CONSTUCTOR: Permite crear las variables del programa 
    public Persona() //Metodo para crear un tipo de dato
    {
    }

// Lopez Martinez Diego Elias

    public Persona(int edad, String nombre) //Constructor sobrecargado
    {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;                  //..........................................................
    }

    public void comer(String platillo) {
        System.out.println(this.nombre + " esta comindo" + platillo);

    }

}
