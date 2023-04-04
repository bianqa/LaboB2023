public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int dia;
    private Horario horario;

    public Partido (Equipo equipo1, Equipo equipo2, int dia, Horario horario){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        if (dia < 1 || dia > 7){
            this.dia = 1;
        } else{
            this.dia = dia;
        }
        this.horario = horario;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
