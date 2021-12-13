package Ejercicio1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Profesional p1 = new Profesional();
        Expediente e1 = new Expediente();
        Date fecha = new Date();
        TipoAcceso tipo = TipoAcceso.CONSULTA;

        Acceso a1 = new Acceso(fecha,tipo,p1,e1);
        System.out.println(p1.toString());
    }
    
}
