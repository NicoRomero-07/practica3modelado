package Ejercicio2;

public class MedioPensionista implements ActivoInterface, PensionistaInterface{

    private Activo activo;
    private Pensionista pensionista;
    private double salario;

    public MedioPensionista(Activo a, Pensionista p){
        assert a != null;
        assert p != null;
        assert !a.getNombre().equals(p.getNombre());
        assert !a.getNumeroSeguridadSocial().equals(p.getNumeroSeguridadSocial());
        assert !a.getSalario().equals(p.getSalario());
        activo = a;
        pensionista = p;
        salario = a.getSalario();
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
