package Ejercicio2;

public class MedioPensionista implements ActivoInterface, PensionistaInterface{

    private Activo activo;
    private Pensionista pensionista;
    private double salario;

    public MedioPensionista(Activo a, Pensionista p){
        assert a != null: "Objeto Activo is null";
        assert p != null: "Objeto Pensionista is null";
        assert a.getNombre().equals(p.getNombre()): "El nombre del activo no coincide con el del pesionista";
        assert a.getNumeroSeguridadSocial().equals(p.getNumeroSeguridadSocial()): "El número de la seguridad social del activo no coincide con el del pensionista";
        assert a.getSalario().equals(p.getSalario()): "El salario del activo no coincide con el del pensionista";
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
