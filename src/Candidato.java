import Intercambio.Fecha;

import java.util.HashMap;

public class Candidato extends Persona{
    private String dni;
    private NombrePartidos partidoPolitico;
    private HashMap<TemaPropuesta, String> propuestas;
    private HashMap<Provincia, Integer> votosProvincia;

    public Candidato (){
        super();
        dni = "20000000";
        partidoPolitico = NombrePartidos.FRENTE_CONSTITUYENTES;
        propuestas = new HashMap<TemaPropuesta, String>();
        votosProvincia = new HashMap<Provincia, Integer>();
    }
    public Candidato (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, String dni, NombrePartidos partidoPolitico, HashMap<TemaPropuesta, String> propuestas, HashMap<Provincia, Integer> votosProvincia){
        super(nombre, apellido, nacimiento, edad, direccion);
        this.dni = dni;
        this.partidoPolitico = partidoPolitico;
        this.propuestas = propuestas;
        this.votosProvincia = votosProvincia;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public NombrePartidos getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(NombrePartidos partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public HashMap<TemaPropuesta, String> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(HashMap<TemaPropuesta, String> propuestas) {
        this.propuestas = propuestas;
    }

    public HashMap<Provincia, Integer> getVotosProvincia() {
        return votosProvincia;
    }

    public void setVotosProvincia(HashMap<Provincia, Integer> votosProvincia) {
        this.votosProvincia = votosProvincia;
    }

    public int calcular_votos (){
        int votos = 0;
        for (int cant_votos : votosProvincia.values()){
            votos += cant_votos;
        }
        return votos;
    }
}
