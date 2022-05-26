
package ico.fes.herencia;

public class EstudianteDeportista extends Persona implements Deportista,Artista{
    private String carrera;
    private String numeroCuenta;
    private String disiplinaDeportiva;
    private String generoArtístico;

    public EstudianteDeportista() {
    }

    public EstudianteDeportista(String carrera, String numeroCuenta, String disiplinaDeportiva, String generoArtístico) {
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.disiplinaDeportiva = disiplinaDeportiva;
        this.generoArtístico = generoArtístico;
    }

    public String getGeneroArtístico() {
        return generoArtístico;
    }

    public void setGeneroArtístico(String generoArtístico) {
        this.generoArtístico = generoArtístico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDisiplinaDeportiva() {
        return disiplinaDeportiva;
    }

    public void setDisiplinaDeportiva(String disiplinaDeportiva) {
        this.disiplinaDeportiva = disiplinaDeportiva;
    }
    
    

    @Override
    public void entrenar() {
        System.out.println(this.nombre + " esta entrenadno" + this.disiplinaDeportiva);
    }

    @Override
    public void jugar() {
        System.out.println(this.nombre + " esta jungando" + this.disiplinaDeportiva);
    }

    @Override
    public void ensayar() {
        System.out.println(this.nombre + " esta ensayando" + this.generoArtístico);
    }

    @Override
    public void presentar() {
        System.out.println(this.nombre + " esta presentando su obra de " + this.generoArtístico);
    }
    
    
    
}
