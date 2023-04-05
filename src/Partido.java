import java.util.ArrayList;

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
                    switch (i) {
                        case 1 -> System.out.println("Partido programado para el Domingo a la mañana.");
                        case 2 -> System.out.println("Partido programado para el Lunes a la mañana.");
                        case 3 -> System.out.println("Partido programado para el Martes a la mañana.");
                        case 4 -> System.out.println("Partido programado para el Miércoles a la mañana.");
                        case 5 -> System.out.println("Partido programado para el Jueves a la mañana.");
                        case 6 -> System.out.println("Partido programado para el Viernes a la mañana.");
                        case 7 -> System.out.println("Partido programado para el Sábado a la mañana.");
                    }
                } else if (equipo1.getHorarios().get(i).isTarde() && horario.isTarde()){
                    this.dia = i;
                    this.horario.setManana(false);
                    this.horario.setTarde(true);
                    this.horario.setNoche(false);
                    switch (i) {
                        case 1 -> System.out.println("Partido programado para el Domingo a la tarde.");
                        case 2 -> System.out.println("Partido programado para el Lunes a la tarde.");
                        case 3 -> System.out.println("Partido programado para el Martes a la tarde.");
                        case 4 -> System.out.println("Partido programado para el Miércoles a la tarde.");
                        case 5 -> System.out.println("Partido programado para el Jueves a la tarde.");
                        case 6 -> System.out.println("Partido programado para el Viernes a la tarde.");
                        case 7 -> System.out.println("Partido programado para el Sábado a la tarde.");
                    }
                } else if (equipo1.getHorarios().get(i).isNoche() && horario.isNoche()){
                    this.dia = i;
                    this.horario.setManana(false);
                    this.horario.setTarde(false);
                    this.horario.setNoche(true);
                    switch (i) {
                        case 1 -> System.out.println("Partido programado para el Domingo a la noche.");
                        case 2 -> System.out.println("Partido programado para el Lunes a la noche.");
                        case 3 -> System.out.println("Partido programado para el Martes a la noche.");
                        case 4 -> System.out.println("Partido programado para el Miércoles a la noche.");
                        case 5 -> System.out.println("Partido programado para el Jueves a la noche.");
                        case 6 -> System.out.println("Partido programado para el Viernes a la noche.");
                        case 7 -> System.out.println("Partido programado para el Sábado a la noche.");
                    }
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

    public static void main(String[] args) {
        Fecha fecha = new Fecha(1,1,2020);

    }
}
