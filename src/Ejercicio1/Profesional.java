package Ejercicio1;

import java.util.List;

public class Profesional {
    private List<Acceso> accesores;

    public Profesional() {
        this.accesores = null;
    }

    public Profesional(List<Acceso> acc) {
        this.accesores = acc;
    }

    public List<Acceso> getAccesores() {
        return this.accesores;
    }

    public void setAccesores(List<Acceso> acc) {
        this.accesores = acc;
    }

    public void addAcceso(Acceso a) {
        accesores.add(a);
    }
}
