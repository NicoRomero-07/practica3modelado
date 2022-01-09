package Ejercicio1;

import java.util.Date;

public class Acceso {
    private Date fecha;
    private TipoAcceso tipo;
    private Profesional accesor;
    private Expediente expediente;


    public Acceso(Date fecha, TipoAcceso tipo, Profesional profesional, Expediente expediente){
        this.fecha = fecha;
        this.tipo = tipo;
        this.accesor = profesional;
        this.expediente = expediente;
        profesional.addAcceso(this);
        expediente.addAcceso(this);
    }

    public void remove(){
        fecha = null;
        tipo = null;
        accesor.removeAcceso(this);
        expediente.removeAcceso(this);
    }

    public Date getFecha(){
        return fecha;
    }

    public TipoAcceso getTipo(){
        return tipo;
    }

    protected void setFecha(Date fecha){
        this.fecha = fecha;
    }

    protected void setTipo(TipoAcceso tipo){
        this.tipo = tipo;
    }

    public String toString() {
        String res = "(";
        res += fecha.toString() + ", " +  tipo.toString() + ")";
        return res;
    }
}
