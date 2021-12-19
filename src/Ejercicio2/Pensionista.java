package Ejercicio2;

public class Pensionista extends Trabajador {

    public Pensionista(String nombre, String ss) {
        super(nombre, ss);
    }

    @Override
    protected void incrementar() {
        salario *= 1.04;
    }
}
