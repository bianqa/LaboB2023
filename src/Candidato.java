import java.util.ArrayList;
import java.util.HashMap;

public class Candidato extends Persona{
    private String dni;
    private NombrePartidos partidoPolitico;
    private HashMap<String, String> propuestas;
    private HashMap<String, Integer> votosProvincia;

    public Candidato (){
        super();
        dni = "20000000";
        partidoPolitico = NombrePartidos.FRENTE_CONSTITUYENTES;
        propuestas = new HashMap<String, String>();
        votosProvincia = new HashMap<String, Integer>();
    }
    public Candidato (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, String dni, NombrePartidos partidoPolitico, HashMap<String, String> propuestas, HashMap<String, Integer> votosProvincia){
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

    public HashMap<String, String> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(HashMap<String, String> propuestas) {
        this.propuestas = propuestas;
    }

    public HashMap<String, Integer> getVotosProvincia() {
        return votosProvincia;
    }

    public void setVotosProvincia(HashMap<String, Integer> votosProvincia) {
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
