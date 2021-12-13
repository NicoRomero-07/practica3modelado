package Ejercicio1;

import java.util.Date;

public class Acceso {
    private Date fecha;
    private TipoAcceso tipo;
    private Profesional profesional;
    private Expediente expediente;


    public Acceso(Date fecha, TipoAcceso tipo, Profesional profesional, Expediente expediente){
        this.fecha = fecha;
        this.tipo = tipo;
        this.profesional = profesional;
        this.expediente = expediente;
        profesional.addAcceso(this);
        expediente.addAcceso(this);
    }

    public void remove(){
        fecha = null;
        tipo = null;
        profesional.removeAcceso(this);
        expediente.removeAcceso(this);
    }

    public Date getFecha(){
        return fecha;
    }

    public TipoAcceso getTipo(){
        return tipo;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public void setTipo(TipoAcceso tipo){
        this.tipo = tipo;
    }

    public String toString() {
        String res = "(";
        res += fecha.toString() + ", " +  tipo.toString() + ")";
        return res;
    }
}
