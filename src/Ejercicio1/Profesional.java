package Ejercicio1;

import java.util.List;

public class Profesional {
    private List<Acceso> accesores;

    //Constructores

    public Profesional() {
        this.accesores = null;
    }

    public Profesional(List<Acceso> acc) {
        this.accesores = acc;
    }

    //Getters & Setters

    public List<Acceso> getAccesores() {
        return this.accesores;
    }

    public void setAccesores(List<Acceso> acc) {
        this.accesores = acc;
    }

    //Adder para accesos

    public void addAcceso(Acceso a) {
        this.accesores.add(a);
    }

    //Remover para accesos

    public void removeAcceso(Acceso a) {
        this.accesores.remove(a);
    }

    public String toString() {
        String res = "[";
        for(Acceso a : accesores) {
            res += a.toString();
        }
        res += "]";
        return res;
    }
}
