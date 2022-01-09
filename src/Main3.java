import Ejercicio3.Bandeja;
import Ejercicio3.Pieza;

public class Main3 {
    public static void main(String[] args) {
        Bandeja bandeja = new Bandeja(5);
        System.out.println(bandeja.getState());
        bandeja.put(new Pieza());
        System.out.println(bandeja.getState());
        bandeja.put(new Pieza());
        bandeja.put(new Pieza());
        bandeja.put(new Pieza());
        bandeja.put(new Pieza());
        System.out.println(bandeja.getState());
        bandeja.get();
        System.out.println(bandeja.getState());
        bandeja.get();
        bandeja.get();
        bandeja.get();
        bandeja.get();
        System.out.println(bandeja.getState());
    }
}
