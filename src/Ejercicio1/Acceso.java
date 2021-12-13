package Ejercicio1;

import java.util.Date;

public class Acceso {
    public Date fecha;
    public TipoAcceso tipo;

    public Acceso(Date fecha, TipoAcceso tipo){
        this.fecha = fecha;
        this.tipo = tipo;
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
}
