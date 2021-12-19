package Ejercicio2;

public class MedioPensionista{

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
}
