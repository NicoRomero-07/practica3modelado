package Ejercicio2;

public class Activo implements Trabajador{

    @Override
    protected void incrementar() {
        salario *= 1.02;
    }
}
