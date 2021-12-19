package Ejercicio2;

public class MedioPensionista implements ActivoInterface, PensionistaInterface{

    private Activo activo;
    private Pensionista pensionista;
    private double salario;


    public MedioPensionista(String nombre, String ss){
        activo = new Activo(nombre,ss);
        pensionista = new Pensionista(nombre,ss);
    }

    public MedioPensionista(Activo a, Pensionista p){
        activo = a;
        pensionista = p;
    }

    public void incrementar(){
        activo.incrementar();
        pensionista.incrementar();
        salario = activo.getSalario() + pensionista.getSalario();
    }

    public double getSalario() {
        return this.salario;
    }
}
