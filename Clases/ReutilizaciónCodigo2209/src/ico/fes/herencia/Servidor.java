
package ico.fes.herencia;
import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

public class Servidor extends Computadora{   //Constructor
    private int numeroFuetnePoder;
    private int numeroTargetaRed;
    private int tipoRaid;

    public Servidor() {
    }

    public Servidor(int numeroFuetnePoder, int numeroTargetaRed, int tipoRaid) {   //Constructor Sobrecargado
        this.numeroFuetnePoder = numeroFuetnePoder;
        this.numeroTargetaRed = numeroTargetaRed;
        this.tipoRaid = tipoRaid;
    }

    public Servidor(int numeroFuetnePoder, int numeroTargetaRed, int tipoRaid, String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, Procesador CPU) {    //Constructor de la compuradora
        super(marca, modelo, pantalla, raton, teclado, CPU);
        this.numeroFuetnePoder = numeroFuetnePoder;
        this.numeroTargetaRed = numeroTargetaRed;
        this.tipoRaid = tipoRaid;
    }

    public int getTipoRaid() {
        return tipoRaid;
    }

    public void setTipoRaid(int tipoRaid) {
        this.tipoRaid = tipoRaid;
    }

    public int getNumeroFuetnePoder() {
        return numeroFuetnePoder;
    }

    public void setNumeroFuetnePoder(int numeroFuetnePoder) {
        this.numeroFuetnePoder = numeroFuetnePoder;
    }

    public int getNumeroTargetaRed() {
        return numeroTargetaRed;
    }

    public void setNumeroTargetaRed(int numeroTargetaRed) {
        this.numeroTargetaRed = numeroTargetaRed;
    }

    @Override
    public String toString() {
        return super.toString() + "Servidor{" + "numeroFuetnePoder=" + numeroFuetnePoder + ", numeroTargetaRed=" + numeroTargetaRed + ", tipoRaid=" + tipoRaid + '}';
    }
    
    
    
 
    
}
