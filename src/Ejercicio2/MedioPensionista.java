package Ejercicio2;

public class MedioPensionista {

    private Activo activo;
    private Pensionista pensionista;
    private double salario;


    public MedioPensionista(Activo a, Pensionista p){
        activo = a;
        pensionista = p;
    }

    protected void incrementar(){
        activo.incrementar();
        pensionista.incrementar();
        salario = activo.getSalario() + pensionista.getSalario();
    }
    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public Pensionista getPensionista() {
        return pensionista;
    }

    public void setPensionista(Pensionista pensionista) {
        this.pensionista = pensionista;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}
