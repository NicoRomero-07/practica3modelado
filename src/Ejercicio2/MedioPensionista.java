package Ejercicio2;

public class MedioPensionista implements ActivoInterface, PensionistaInterface{

    private Activo activo;
    private Pensionista pensionista;
    private double salario;

    public MedioPensionista(Activo a, Pensionista p){
        try{
            activo = a;
            pensionista = p;
            if(a.getNombre() != p.getNombre() || a.getNumeroSeguridadSocial() != p.getNumeroSeguridadSocial()){
                throw new Exception("No coincide nombre o numero de ss");
            }
        }catch(Exception e){

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
        return this.salario;
    }
}
