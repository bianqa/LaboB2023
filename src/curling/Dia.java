package curling;

import java.time.DayOfWeek;

public enum Dia {
    DOMINGO(DayOfWeek.SUNDAY), LUNES(DayOfWeek.MONDAY), MARTES(DayOfWeek.TUESDAY), MIERCOLES(DayOfWeek.WEDNESDAY), JUEVES(DayOfWeek.THURSDAY), VIERNES(DayOfWeek.FRIDAY), SABADO(DayOfWeek.SATURDAY);

    private DayOfWeek dia;

    private Dia (DayOfWeek dia){
        this.dia = dia;
    }

    public DayOfWeek getDia() {
        return dia;
    }

    public void setDia(DayOfWeek dia) {
        this.dia = dia;
    }
}
