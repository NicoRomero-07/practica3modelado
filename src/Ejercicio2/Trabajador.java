package Ejercicio2;

public abstract class Trabajador {
    private String nombre;
    private String numeroSeguridadSocial;
    private Double salario;

    public Trabajador(String nombre, String ss,Double salario){
        assert nombre != null : "El nombre del trabajador es nulo";
        assert ss != null : "El número de la seguridad social del trabajador es nulo";
        assert salario != null : "El salario del trabajador es nulo";
        this.nombre = nombre;
        this.numeroSeguridadSocial = ss;
        this.salario = salario;
    }

    protected abstract void incrementar();

    public Double getSalario() {
        return salario;
    }

    protected void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public String getNombre() {
        return nombre;
    }

    protected Double nomina(){
        return salario;
    }

}
