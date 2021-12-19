package Ejercicio2;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main (String[] args){
        try{
            MedioPensionista mp = new MedioPensionista(new Activo("Paco","1",2.0), new Pensionista("Paco","1",2.0));
            mp.incrementar();
            System.out.println(mp.getSalario());
        }catch (Exception e){

        }
    }
}
