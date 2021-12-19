package Ejercicio2;

public class Pensionista extends Trabajador {

    private Double salario;

    public Pensionista(String nombre, String ss) {
        super(nombre, ss);
    }

    @Override
    protected void incrementar() {
        super.setSalario(salario *= 1.04);
    }
}
