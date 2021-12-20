package Ejercicio3;

public class EmptyState extends State {

    public EmptyState(Bandeja bandeja) {
        super(bandeja);
    }

    public String onPut() {
        if(super.getBandeja().getCapacidad() == 1) {
            super.getBandeja().changeState(new FullState(super.getBandeja()));
            return "Full";
        } else {
            super.getBandeja().changeState(new NormalState(super.getBandeja()));
            return "Normal";
        }
    }

    public String onGet() {
        return "Empty";
    }

    public String onSize() {
        return "Empty";
    }
    
}
