
package ico.fes.composicion;

public class Llanta {
    private String marca;
    private String rodada;

    public Llanta(String marca, String rodada) {
        this.marca = marca;
        this.rodada = rodada;
    }

    public Llanta() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public String toString() {
        return "Llanta{" + "marca=" + marca + ", rodada=" + rodada + '}';
    }


}
