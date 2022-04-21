
package javabasico2209;

public class ALUMNO {
    private String numeroCuenta;
    private int semestre;
    private float promedio;

    public ALUMNO() {
    }

    public ALUMNO(String numeroCuenta, int semestre, float promedio) {
        this.numeroCuenta = numeroCuenta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "ALUMNO{" + "numeroCuenta=" + numeroCuenta + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    public void estudiar (int minutos){
        System.out.println("Estudiando..."+minutos + "Minutos");
    }
    public String evaluarDesempenio(){
        return this.promedio  > 8.0f?"Sobresaliente":"Regular";
        
    }
    
    
}
