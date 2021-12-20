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
        assert capacidad >= piezas.size() : "La capacidad debe ser mayor al tamano de la lista de piezas";
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

    protected void put(Pieza p) {
        assert p != null: "La pieza no puede ser nula";
        piezas.add(p);
        state.onPut();
    }

    protected Pieza get() {
        state.onGet();
        return piezas.get(piezas.size());
    }

    protected Integer size(){
        state.onSize();
        return piezas.size();
    }
}
