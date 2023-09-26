package empresaAsistencias;
import curling.Dia;
import personas.Persona;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Empleado extends Persona {
    private String nro_telefono;
    private HashSet<Dia> diasPorSemana;
    private HashSet<Date> asistencias;

    public Empleado () {
        super();
        nro_telefono = "+54 11 9 1111 1111";
        diasPorSemana = new HashSet<Dia>();
        asistencias = new HashSet<Date>();
    }

    public String getNro_telefono() {
        return nro_telefono;
    }

    public void setNro_telefono(String nro_telefono) {
        this.nro_telefono = nro_telefono;
    }

    public HashSet<Dia> getDiasPorSemana() {
        return diasPorSemana;
    }

    public void setDiasPorSemana(HashSet<Dia> diasPorSemana) {
        this.diasPorSemana = diasPorSemana;
    }

    public HashSet<Date> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(HashSet<Date> asistencias) {
        this.asistencias = asistencias;
    }

    public double porcentaje_asistencias (int anio, int mes){
        double porcentaje;
        int cont = 0;
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date (anio-1900, mes-1, 1));
        int month = cal.get(Calendar.MONTH);
        for (Date date1 : asistencias){
            Calendar date = Calendar.getInstance();
            date.setTime(date1);
            if (date.get(Calendar.MONTH) == (month)){
                cont++;
            }
        }
        porcentaje = diasPorSemana.size()*4;
        porcentaje = cont * 100 / porcentaje;
        return porcentaje;
    }
}
