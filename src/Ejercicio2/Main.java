package Ejercicio2;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main (String[] args){
        MedioPensionista mp = new MedioPensionista(new Activo("Paqito", "2", 2.0), new Pensionista("Paco", "1", 1.0));
        mp.incrementar();
        System.out.println(mp.getSalario());
        System.out.println(mp.getPensionista().getNombre() + " " + mp.getActivo().getNombre());
    }
}
