package futbol;

import Intercambio.Fecha;
import repaso.elecciones.Provincia;

import java.util.ArrayList;
import java.util.HashSet;

public class Arquero extends Jugador{
    private Double porcentajeAtajadas;
    private int golesRecibidos;

    public Arquero (){
        super();
        porcentajeAtajadas = 30.5;
        golesRecibidos = 3;
    }

    public Arquero (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, String posicion, Provincia provincia, ArrayList<Equipo> historial, int numero, HashSet<Partido> partidos, Double porcentajeAtajadas, int golesRecibidos){
        super(nombre, apellido, nacimiento, edad, direccion, posicion, provincia, historial, numero, partidos);
        this.porcentajeAtajadas = porcentajeAtajadas;
        this.golesRecibidos = golesRecibidos;
    }

    public Double getPorcentajeAtajadas() {
        return porcentajeAtajadas;
    }

    public void setPorcentajeAtajadas(Double porcentajeAtajadas) {
        this.porcentajeAtajadas = porcentajeAtajadas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public boolean contratar(Equipo e){
        try{
            if (!getHistorial().contains(e) && porcentajeAtajadas > 60.0 && golesRecibidos < 10){
                System.out.println("El " + getNombre() + "arquero" + porcentajeAtajadas + golesRecibidos + " se contrató en el " + e.getNombre());
                getHistorial().add(e);
                return true;
            } else{
                throw new CriteriosContratarException ("No se puede contratar porque no cumple con los criterios.");
            }
        } catch (CriteriosContratarException ex) {
            ex.getMessage();
        }
        return false;
    }

    @Override
    public boolean renovar(Equipo e) {
        return super.renovar(e);
    }

    public void agregarPartido (Partido p){

    }
}
