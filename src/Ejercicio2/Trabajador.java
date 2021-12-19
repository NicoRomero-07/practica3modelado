package Ejercicio2;

public abstract class Trabajador {
    private String nombre;
    private String numeroSeguridadSocial;
    protected Double salario;

    public Trabajador(String nombre, String ss){
        this.nombre = nombre;
        this.numeroSeguridadSocial = ss;
    }

    protected Double nomina(){
        return salario;
    }

    protected abstract void incrementar();

}
