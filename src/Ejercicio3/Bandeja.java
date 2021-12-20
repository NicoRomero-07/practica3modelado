package Ejercicio3;

import java.util.LinkedList;

public class Bandeja {
    private State state;
    private final Integer capacidad;
    private LinkedList<Pieza> piezas;

    public Bandeja(Integer capacidad){
        assert capacidad > 0 : "La capacidad no puede ser menor que cero";
        state = new EmptyState(this);
        this.capacidad = capacidad;
        this.piezas = new LinkedList<>();
    }

    public Bandeja(Integer capacidad, LinkedList<Pieza> piezas){
        assert capacidad > 0 : "La capacidad no puede ser menor que cero";
        state = new EmptyState(this);
        this.capacidad = capacidad;
        this.piezas = piezas;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    protected int getCapacidad() {
        return this.capacidad;
    }

    protected LinkedList<Pieza> getPiezas() {
        return this.piezas;
    }

    protected void put(Pieza p){
        piezas.add(p);
    }

    protected Pieza get(){
        return piezas.get(piezas.size());
    }

    protected Integer size(){
        return piezas.size();
    }
}
