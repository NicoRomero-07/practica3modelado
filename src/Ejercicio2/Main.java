package Ejercicio2;

public class Main {
    public static void main (String[] args){
        MedioPensionista mp = new MedioPensionista(new Activo("Paco","1",2.0), new Pensionista("Paco","1",2.0));
        mp.incrementar();
        System.out.println(mp.getSalario());
    }
}
