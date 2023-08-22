import java.util.HashMap;
import java.util.HashSet;

public class SistemaElecciones {
    private HashSet<Votante> padron;
    private HashSet<PartidoPolitico> partidos;
    private HashSet<Candidato> candidatos;

    public SistemaElecciones (){
        padron = new HashSet<Votante>();
        partidos = new HashSet<PartidoPolitico>();
    }

    public SistemaElecciones (HashSet<Votante> padron, HashSet<PartidoPolitico> partidos, HashSet<Candidato> candidatos){
        this.padron = padron;
        this.partidos = partidos;
        this.candidatos = candidatos;
    }

    public HashSet<Votante> getPadron() {
        return padron;
    }

    public void setPadron(HashSet<Votante> padron) {
        this.padron = padron;
    }

    public HashSet<PartidoPolitico> getPartidos() {
        return partidos;
    }

    public void setPartidos(HashSet<PartidoPolitico> partidos) {
        this.partidos = partidos;
    }

    public HashSet<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(HashSet<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public void emitir_voto (Votante votante, Candidato candidato){
        if (!votante.isVoto() && votante.getNacionalidad().equals("Argentina")){
            if (candidato.getVotosProvincia().containsKey(votante.getProvincia())){
                candidato.getVotosProvincia().put(votante.getProvincia(), candidato.getVotosProvincia().get(votante.getProvincia()) + 1);
            } else{
                candidato.getVotosProvincia().put(votante.getProvincia(), 1);
            }
            votante.setVoto(true);
        } else{
            System.out.println("Ya votó anteriormente. No se emitirá el voto");
        }
    }

    public void votos_obtenidos (){
        for (Candidato candidato : candidatos){
            double porcentaje = 0;
            System.out.println("Candidato " + candidato.getNombre() + " " + candidato.getApellido() + ":");
            System.out.printf(candidato.getPartidoPolitico().getNombre());
            System.out.println("Cantidad votos: " + candidato.calcular_votos());
            porcentaje = candidato.calcular_votos() * 100;
            porcentaje = porcentaje / padron.size();
            System.out.println("Porcentaje: " + porcentaje + "%");
        }
    }

    public void ganador (){
        Candidato mayor = new Candidato();
        boolean primero = true;
        double porcentaje = 0;
        for (Candidato candidato : candidatos){
            if (primero || candidato.calcular_votos() > mayor.calcular_votos()){
                primero = false;
                mayor = candidato;
            }
        }
        System.out.println("GANADOR");
        System.out.println(mayor.getNombre() + " " + mayor.getApellido());
        porcentaje = mayor.calcular_votos() * 100;
        porcentaje = porcentaje / padron.size();
        System.out.println(porcentaje + "%");
    }

    public double cant_sin_votar (){
        int cant = 0;
        double porcentaje = 0;
        for (Votante votante : padron){
            if (!votante.isVoto()){
                cant++;
            }
        }
        porcentaje = cant * 100;
        porcentaje = porcentaje / padron.size();
        return porcentaje;
    }

    public static void main(String[] args) {
        Candidato aux = new Candidato();
        PartidoPolitico partido1 = new PartidoPolitico(NombrePartidos.POLI_AVANZA, aux);
        Candidato c1 = new Candidato("Miley", "Cyrus", new Fecha(31, 1, 1980), 43, "lol", "20000000", NombrePartidos.POLI_AVANZA, new HashMap<String, String>(), new HashMap<String, Integer>());
        partido1.setRepresentante(c1);
        PartidoPolitico partido2 = new PartidoPolitico(NombrePartidos.JUNTOS_POLI, aux);
        Candidato c2 = new Candidato("Pel", "Ado", new Fecha(1, 1, 1990), 33, "locura", "20000000", NombrePartidos.JUNTOS_POLI, new HashMap<String, String>(), new HashMap<String, Integer>());
        partido2.setRepresentante(c2);
        PartidoPolitico partido3 = new PartidoPolitico(NombrePartidos.UNION_DOCENCIA, aux);
        Candidato c3 = new Candidato("Perez", "Perez", new Fecha(1, 1, 1990), 33, "locura", "20000000", NombrePartidos.UNION_DOCENCIA, new HashMap<String, String>(), new HashMap<String, Integer>());
        partido3.setRepresentante(c3);
        PartidoPolitico partido4 = new PartidoPolitico(NombrePartidos.FRENTE_CONSTITUYENTES, aux);
        Candidato c4 = new Candidato("Pan", "Integral", new Fecha(1, 1, 1990), 33, "locura", "20000000", NombrePartidos.FRENTE_CONSTITUYENTES, new HashMap<String, String>(), new HashMap<String, Integer>());
        partido4.setRepresentante(c4);
        Votante v1 = new Votante();
        Votante v2 = new Votante();
        Votante v3 = new Votante();
        Votante v4 = new Votante();
        Votante v5 = new Votante();
        Votante v6 = new Votante();
        HashSet<Votante> votantes = new HashSet<Votante>();
        votantes.add(v1);
        votantes.add(v2);
        votantes.add(v3);
        votantes.add(v4);
        votantes.add(v5);
        votantes.add(v6);
        HashSet<PartidoPolitico> partidos = new HashSet<PartidoPolitico>();
        partidos.add(partido1);
        partidos.add(partido2);
        partidos.add(partido3);
        partidos.add(partido4);
        HashSet<Candidato> candidatos = new HashSet<Candidato>();
        candidatos.add(c1);
        candidatos.add(c2);
        candidatos.add(c3);
        candidatos.add(c4);
        SistemaElecciones sis = new SistemaElecciones(votantes, partidos, candidatos);
        sis.emitir_voto(v1, c1);
        sis.emitir_voto(v2, c2);
        sis.emitir_voto(v3, c3);
        sis.emitir_voto(v4, c4);
        sis.emitir_voto(v5, c1);
        sis.emitir_voto(v1, c1);
        System.out.println("---------------------");
        sis.ganador();
        System.out.println("---------------------");
        System.out.println("POBLACIÓN SIN VOTAR:");
        System.out.println(sis.cant_sin_votar());
    }
}
