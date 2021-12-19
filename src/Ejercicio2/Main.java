package Ejercicio2;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main (String[] args){
        MedioPensionista mp = new MedioPensionista(new Activo("Paco", "1"), new Pensionista("Paco", "1"));
        mp.incrementar();
        System.out.println(mp.getSalario());
    }
}
