
package ico.fes.composicion;

public class MARCO {
   private String marca;
   private String material;

    public MARCO() {
    }

    public MARCO(String marca, String material) {
        this.marca = marca;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "MARCO{" + "marca=" + marca + ", material=" + material + '}';
    }
   

    
    
}
