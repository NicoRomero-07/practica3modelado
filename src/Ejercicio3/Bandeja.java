package Ejercicio3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Bandeja {
    private final Integer capacidad;
    private LinkedList<Pieza> piezas;

    public Bandeja(Integer capacidad){
        assert capacidad > 0 : "La capacidad no puede ser menor que cero";
        this.capacidad = capacidad;
        this.piezas = new LinkedList<>();
    }

    public Bandeja(Integer capacidad, LinkedList<Pieza> piezas){
        this.capacidad = capacidad;
        this.piezas = piezas;

    }

    protected void put(Pieza p){

    }

    protected Pieza get(){
        return null;
    }

    protected Integer size(){
        return null;
    }
}
