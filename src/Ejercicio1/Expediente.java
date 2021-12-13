package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Expediente {
    private Paciente paciente;
    private List<Acceso> acceso;

    public Expediente(){
        this.paciente = null;
        this.acceso = new ArrayList<>();
    }

    public Expediente(Paciente paciente,List<Acceso> acceso){
        this.paciente = paciente;
        this.acceso = acceso;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public List<Acceso> getAcceso(){
        return acceso;
    }

    protected void addAcceso(Acceso a){
        acceso.add(a);
    }

    protected void removeAcceso(Acceso a){
        acceso.remove(a);
    }
    /*
    public String toString(){
        return "Paciente: " + Paciente.toString() + "Acceso: " + acceso.toString();
    }

     */

}
