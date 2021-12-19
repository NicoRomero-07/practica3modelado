package Ejercicio2;

public class Pensionista extends Trabajador {


    public Pensionista(String nombre, String ss) {
        super(nombre, ss);
    }

    @Override
    protected void incrementar() {
        super.setSalario(super.getSalario() * 1.04);
    }
}
