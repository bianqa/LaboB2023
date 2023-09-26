package curling;

import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> equipos;

    public Campeonato (ArrayList<Equipo> equipos){
        this.partidos = new ArrayList<Partido>();
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void mostrar_fixture (){
        for (int i = 1; i < 8; i++){
            if (i ==1){
                System.out.println("Domingo:");
            } else if (i == 2){
                System.out.println("Lunes:");
            } else if (i == 3){
                System.out.println("Martes:");
            } else if (i == 4){
                System.out.println("Miércoles:");
            } else if (i == 5){
                System.out.println("Jueves:");
            } else if (i == 6){
                System.out.println("Viernes:");
            } else {
                System.out.println("Sábado:");
            }

        }
    }

    public void agregar_equipo(Equipo equipo){
        boolean esta = false;
        for (Equipo equipo1 : equipos){
            if (equipo1 == equipo){
                System.out.println("Ya existe ese equipo.");
                esta = true;
            }
        }
        if (esta == false){
            equipos.add(equipo);
        }
    }
}
