package Ejercicio2;

public class Activo extends Trabajador {

    private Double salario;

    public Activo(String nombre,String ss){
        super(nombre,ss);
    }

    @Override
    protected void incrementar() {
        super.setSalario(salario*=1.02);
    }
}