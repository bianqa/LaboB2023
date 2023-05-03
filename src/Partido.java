public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private Dia dia;
    private Horario horario;

    public Partido (Equipo equipo1, Equipo equipo2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        if (equipo1.getDia().equals(equipo2.getDia())){
            if (equipo1.getHorario().equals(equipo2.getHorario())){
                dia = equipo1.getDia();
                horario = getHorario();
            }
        }
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

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
