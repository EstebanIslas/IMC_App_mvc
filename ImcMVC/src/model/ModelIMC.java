package model;

public class ModelIMC {
    private float peso;
    private float estatura;
    private float calcular;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getCalcular() {
        return calcular;
    }

    public void setCalcular(float calcular) {
        this.calcular = calcular;
    }
    
    public float calcular_imc(){
        this.calcular = this.peso/(this.estatura * this.estatura);
        return this.calcular;
    }
}
