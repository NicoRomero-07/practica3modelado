package Ejercicio2;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main (String[] args){
        MedioPensionista mp = new MedioPensionista("paquito", "1");
        mp.incrementar();
        System.out.println(mp.getSalario());
        System.out.println(mp.getPensionista().getNombre() + " " + mp.getActivo().getNombre());
    }
}
