
package com.mycompany.cuenntahabiente;

/**
 *
 * @author die_e
 */
public class Datos {
    private String idCliente;
    private String nombre;
    private float balance;

    public Datos() {
    }

    public Datos(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Datos{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero( float monto ){
           System.out.println(" Tu monto actual es: "+ (this.balance-monto));
}

    public String evaluarNivelCliente(){
     String restar=this.balance<=5000f? "Clietnte regular: Cliente Premium";
     return restar;
}         
    
}
