public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int dia;
    private Horario horario;

    public Partido (Equipo equipo1, Equipo equipo2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        for (int i = 1; i <= 7; i++){
            for (Horario horario : equipo2.getHorarios()){
                if (equipo1.getHorarios().get(i).isManana() && horario.isManana()){
                    this.dia = i;
                    this.horario.setManana(true);
                    this.horario.setTarde(false);
                    this.horario.setNoche(false);
                } else if (equipo1.getHorarios().get(i).isTarde() && horario.isTarde()){
                    this.dia = i;
                    this.horario.setManana(false);
                    this.horario.setTarde(true);
                    this.horario.setNoche(false);
                } else if (equipo1.getHorarios().get(i).isNoche() && horario.isNoche()){
                    this.dia = i;
                    this.horario.setManana(false);
                    this.horario.setTarde(false);
                    this.horario.setNoche(true);
                }
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
