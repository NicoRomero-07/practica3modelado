package Ejercicio1;

import java.util.*;

public class Expediente {
    private Paciente paciente;
    private List<Acceso> accesos;

    protected Expediente(Paciente paciente){
        assert paciente!=null;
        this.paciente = paciente;
        this.accesos = new ArrayList<>();
    }

    protected Expediente(Paciente paciente,List<Acceso> acceso){
        this.paciente = paciente;
        this.accesos = acceso;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public Enumeration<Acceso> getAcceso(){
        return Collections.enumeration(accesos);
    }

    protected void addAcceso(Acceso a){
        accesos.add(a);
    }

    protected void removeAcceso(Acceso a){
        accesos.remove(a);
    }
    /*
    public String toString(){
        return "Paciente: " + Paciente.toString() + "Acceso: " + acceso.toString();
    }

     */

}
