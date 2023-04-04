import java.util.ArrayList;

public class Fixture {
    private ArrayList<Partido> partidos;

    public Fixture (ArrayList<Partido> partidos){
        this.partidos = partidos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
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
            for (Partido partido : partidos){
                if (partido.getDia() == i){
                    if (partido.getHorario().isManana()){
                        System.out.println("  Mañana:");
                        System.out.println("  " + partido.getEquipo1().getNombre() + " vs " + partido.getEquipo2().getNombre());
                    } else if (partido.getHorario().isTarde()){
                        System.out.println("  Tarde:");
                        System.out.println("  " + partido.getEquipo1().getNombre() + " vs " + partido.getEquipo2().getNombre());
                    } else if (partido.getHorario().isNoche()){
                        System.out.println("  Noche:");
                        System.out.println("  " + partido.getEquipo1().getNombre() + " vs " + partido.getEquipo2().getNombre());
                    }
                }
            }
        }
    }

    public void agregar_partido (Partido partido){
        if (partidos.size() == 0){
            partidos.add(partido);
        } else{
            for (Partido partido1 : partidos){
                if (partido.getDia() == partido1.getDia()){
                    if (partido.getHorario().isManana() && partido1.getHorario().isManana()){
                        System.out.println("No se puede agregar el partido porque ya hay un partido programado ese día y a ese horario.");
                    } else if (partido.getHorario().isTarde() && partido1.getHorario().isTarde()){
                        System.out.println("No se puede agregar el partido porque ya hay un partido programado ese día y a ese horario.");
                    } else if (partido.getHorario().isNoche() && partido1.getHorario().isNoche()){
                        System.out.println("No se puede agregar el partido porque ya hay un partido programado ese día y a ese horario.");
                    } else{
                        partidos.add(partido);
                    }
                } else{
                    partidos.add(partido);
                }
            }
        }
    }

    public void eliminar_partido (Partido partido){
        for (Partido partido1 : partidos){
            if (partido1 == partido){
                partidos.remove(partido);
            }
        }
    }
}
