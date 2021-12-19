package Ejercicio2;

public class MedioPensionista{

    private Activo activo;
    private Pensionista pensionista;
    protected double salario;


    public MedioPensionista(Activo a, Pensionista p){
        activo = a;
        pensionista = p;
    }

    protected void incrementar(){
        activo.incrementar();
        pensionista.incrementar();
        salario = activo.salario + pensionista.salario;
    }
}
