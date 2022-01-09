package Ejercicio3;

public class FullState extends State {
    
    public FullState(Bandeja bandeja) {
        super(bandeja);
    }

    public String onPut() {
        return "Full";
    }

    public String onGet() {
        if(super.getBandeja().getCapacidad() == 1) {
            super.getBandeja().changeState(new EmptyState(super.getBandeja()));
            return "Empty";
        } else {
            super.getBandeja().changeState(new NormalState(super.getBandeja()));
            return "Normal";
        }
    }

    public String onSize() {
        return "Full";
    }

}
