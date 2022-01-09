import Ejercicio3.Bandeja;
import Ejercicio3.Pieza;

public class Main3 {
    public static void main(String[] args) {
        Bandeja bandeja = new Bandeja(5);
        //bandeja.put(new Pieza());
        System.out.println(bandeja.getState());
    }
}
