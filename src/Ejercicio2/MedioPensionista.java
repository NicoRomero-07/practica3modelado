package Ejercicio2;

public class MedioPensionista implements ActivoInterface, PensionistaInterface{

    private Activo activo;
    private Pensionista pensionista;
    private double salario;

    public MedioPensionista(Activo a, Pensionista p){
        try{
            if(!a.getNombre().equals(p.getNombre())
               || !a.getNumeroSeguridadSocial().equals(p.getNumeroSeguridadSocial())
               || !a.getSalario().equals(p.getSalario())) {
                throw new RuntimeException();
            }
            activo = a;
            pensionista = p;
            salario = a.getSalario();
        }catch (NullPointerException ne){
            System.err.println("Objetos creados incorrectamente");
        }
        catch(RuntimeException e){
            System.err.println("No coincide nombre,numero de ss o salario");
        }

    }

    public void incrementar(){
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
        assert salario != 0;
        return this.salario;
    }
}
