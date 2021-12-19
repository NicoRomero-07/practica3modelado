package Ejercicio2;

public class Pensionista extends Trabajador {


    public Pensionista(String nombre, String ss,Double salario) {
        super(nombre,ss,salario);
    }

    @Override
    protected void incrementar() {
        super.setSalario(super.getSalario() * 1.04);
    }
}
