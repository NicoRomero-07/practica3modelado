package Ejercicio2;

public class Activo extends Trabajador {

    public Activo(String nombre,String ss){
        super(nombre,ss);
    }

    @Override
    protected void incrementar() {
        salario *= 1.02;
    }
}
