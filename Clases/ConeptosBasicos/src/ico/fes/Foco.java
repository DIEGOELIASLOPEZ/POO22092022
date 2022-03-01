
package ico.fes;

import java.awt.Color;

/**
 *
 * @author die_e
 */
public class Foco {
   private int tamano;
   private String tipo;
   private Color color;

    public Foco() {
    }

    public Foco(int tamano, String tipo, Color color) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Foco{" + "tamano=" + tamano + ", tipo=" + tipo + ", color=" + color + '}';
    }

    

}
