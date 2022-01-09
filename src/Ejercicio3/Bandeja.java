package Ejercicio3;


import java.util.LinkedList;
import java.util.SortedSet;

public class Bandeja {
    private State state;
    private final Integer capacidad;
    private LinkedList piezas;

    public Bandeja(Integer capacidad){
        assert capacidad > 0 : "La capacidad no puede ser menor que cero";
        state = new EmptyState(this);
        this.capacidad = capacidad;
        this.piezas = new LinkedList<Pieza>();
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

    public void put(Pieza p) {
        assert p != null: "La pieza no puede ser nula";
        assert capacidad > piezas.size(): "La bandeja ha llegado a su límite";
        piezas.add(p);
        state.onPut();
    }

    public Pieza get() {
        assert piezas.size() > 0: "No hay piezas en la bandeja disponible";
        Pieza p = (Pieza) piezas.getLast();
        piezas.remove(p);
        state.onGet();
        return p;
    }

    public Integer size() {
        state.onSize();
        return piezas.size();
    }
}
