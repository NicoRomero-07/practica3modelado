package Ejercicio1;

import java.util.*;

public class Profesional {
    private List<Acceso> accesos;

    //Constructores

    public Profesional() {
        this.accesos = new ArrayList<>();
    }

    public Profesional(List<Acceso> acc) {
        this.accesos = acc;
    }

    //Getters & Setters

    public Enumeration<Acceso> getAccesores() {
        return Collections.enumeration(accesos);
    }

    public void setAccesores(List<Acceso> acc) {
        this.accesos = acc;
    }

    //Adder para accesos

    public void addAcceso(Acceso a) {
        this.accesos.add(a);
    }

    //Remover para accesos

    public void removeAcceso(Acceso a) {
        this.accesos.remove(a);
    }

    public String toString() {
        String res = "[";
        for(Acceso a : accesos) {
            res += a.toString();
        }
        res += "]";
        return res;
    }
}
