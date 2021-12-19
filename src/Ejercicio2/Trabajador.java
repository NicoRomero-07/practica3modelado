package Ejercicio2;

public abstract class Trabajador {
    private String nombre;
    private String numeroSeguridadSocial;
    private Double salario;

    public Trabajador(String nombre, String ss,Double salario){
        this.nombre = nombre;
        this.numeroSeguridadSocial = ss;
        this.salario = salario;
    }

    protected abstract void incrementar();

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    protected Double nomina(){
        return salario;
    }

}
