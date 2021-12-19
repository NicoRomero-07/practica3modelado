import Ejercicio1.Acceso;
import Ejercicio1.Paciente;
import Ejercicio1.Profesional;
import Ejercicio1.TipoAcceso;

import java.util.Date;

public class Main1 {
    public static void main(String[] args) {
        Profesional p1 = new Profesional();
        Date fecha = new Date();
        TipoAcceso tipo = TipoAcceso.CONSULTA;

        Paciente paciente1 = new Paciente();
        Acceso a1 = new Acceso(fecha,tipo,p1,paciente1.getExpedienteAbierto());

        paciente1.addExpediente();
        Acceso a2 = new Acceso(fecha,tipo,p1,paciente1.getExpedienteAbierto());

        System.out.println(p1);
    }
    
}
