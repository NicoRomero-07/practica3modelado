package Ejercicio3;

public class NormalState extends State{
    
    public NormalState(Bandeja bandeja) {
        super(bandeja);
    }

    public String onPut() {
        if(super.getBandeja().getCapacidad() == super.getBandeja().getPiezas().size() + 1) {
            super.getBandeja().changeState(new FullState(super.getBandeja()));
            return "Full";
        } else {
            return "Normal";
        }
    }

    public String onGet() {
        if(super.getBandeja().getPiezas().size() == 1) {
            super.getBandeja().changeState(new EmptyState(super.getBandeja()));
            return "Empty";
        } else {
            return "Normal";
        }
    }

    public String onSize() {
        return "Normal";
    }

}
