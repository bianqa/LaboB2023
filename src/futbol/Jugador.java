package futbol;

import Intercambio.Fecha;
import personas.Persona;
import repaso.elecciones.Provincia;

import java.util.ArrayList;

public class Jugador extends Persona implements Contrato{
    private String posicion;
    private Provincia provincia;
    private ArrayList<Equipo> historial;
    private int numero;

    public Jugador (){
        super();
        posicion = "nose";
        provincia = Provincia.CHACO;
        historial = new ArrayList<>();
        numero = 4;
    }

    public Jugador (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, String posicion, Provincia provincia, ArrayList<Equipo> historial, int numero){
        super(nombre, apellido, nacimiento, edad, direccion);
        this.posicion = posicion;
        this.provincia = provincia;
        this.historial = historial;
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public ArrayList<Equipo> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Equipo> historial) {
        this.historial = historial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean contratar(Equipo e) {
        return false;
    }

    @Override
    public boolean renovar(Equipo e) {
        return false;
    }
}
