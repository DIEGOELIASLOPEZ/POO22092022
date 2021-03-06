
package ico.fes;

import java.awt.Color;

public class Automovil {
        private String marca;               //Los attributos van en notacion lowe camel case
        private String subMarca;            //Lower camel case, todas en minusculas y apartir 
                                            //de la segunda palabra, la primera letra mayuscula
        private int modelo;
        private Color color;
    private Color c;
    private String m;

    public Automovil() {
    }

    public Automovil(String marca, String subMarca, int modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }
    public Automovil(String m, Color c) {
    this.marca = m;
    this.color = c; 
    }
 
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", color=" + color + '}';
    }
        
}
