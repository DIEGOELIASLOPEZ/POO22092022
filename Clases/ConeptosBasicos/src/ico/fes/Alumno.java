package ico.fes;

public class Alumno extends Persona         //hereda atributos y metodos de la calse persona 
{
    private String numeroCuetnea;
    private String carrera;
    private int grupo;

    public Alumno() {
    }

    public Alumno(String numeroCuetnea, String carrera, int grupo) {
        this.numeroCuetnea = numeroCuetnea;
        this.carrera = carrera;
        this.grupo = grupo;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getNumeroCuetnea() {
        return numeroCuetnea;
    }

    public void setNumeroCuetnea(String numeroCuetnea) {
        this.numeroCuetnea = numeroCuetnea;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+ "Alumno{" + "numeroCuetnea=" + numeroCuetnea + ", carrera=" + carrera + ", grupo=" + grupo + '}';
    }

   
    
}
