package Ejercicio3;

public abstract class State {
    private Bandeja bandeja;

    public State(Bandeja bandeja) {
        this.bandeja = bandeja;
    }

    public Bandeja getBandeja() {
        return this.bandeja;
    }
    public abstract String onPut();
    public abstract String onGet();
    public abstract String onSize();
}
