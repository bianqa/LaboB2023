import java.util.ArrayList;
import java.util.HashSet;

public class Lugar {
    private String nombre;
    private int codigo;
    private HashSet<Coordenada> coordenadas;

    public Lugar (){
        nombre = "";
        codigo = 1;
        coordenadas = new HashSet<Coordenada>();
    }

    public Lugar (String nombre, int codigo, HashSet<Coordenada> coordenadas){
        this.nombre = nombre;
        this.codigo = codigo;
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashSet<Coordenada> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(HashSet<Coordenada> coordenadas) {
        this.coordenadas = coordenadas;
    }

    public int cant_poblacion (){

    }
}
