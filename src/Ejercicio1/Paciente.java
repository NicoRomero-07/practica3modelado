package Ejercicio1;

import java.util.*;

public class Paciente {
    private Expediente expedienteAbierto;
    private List<Expediente> expedientes;

    public Paciente(){
        expedientes = new ArrayList<>();
        addExpediente();
    }

    public void addExpediente(){
        Expediente newExpediente = new Expediente(this);
        expedientes.add(newExpediente);
        expedienteAbierto=newExpediente;
    }

    public Enumeration<Expediente> getExpedientes(){
        return Collections.enumeration(expedientes);
    }

    public Expediente getExpedienteAbierto(){
        return expedienteAbierto;
    }
}
