package futbol;

import Intercambio.Fecha;
import org.omg.CORBA.PUBLIC_MEMBER;
import repaso.elecciones.Provincia;

import java.util.ArrayList;
import java.util.HashSet;

public class JugadorCampo extends Jugador{
    private Double golesConvertidos;
    private int cantAsistencias;

    public JugadorCampo (){
        super();
        golesConvertidos = 56.5;
        cantAsistencias = 25;
    }

    public JugadorCampo (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, String posicion, Provincia provincia, ArrayList<Equipo> historial, int numero, HashSet<Partido> partidos, Double golesConvertidos, int cantAsistencias){
        super(nombre, apellido, nacimiento, edad, direccion, posicion, provincia, historial, numero, partidos);
        this.golesConvertidos = golesConvertidos;
        this.cantAsistencias = cantAsistencias;
    }

    public Double getGolesConvertidos() {
        return golesConvertidos;
    }

    public void setGolesConvertidos(Double golesConvertidos) {
        this.golesConvertidos = golesConvertidos;
    }

    public int getCantAsistencias() {
        return cantAsistencias;
    }

    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }

    @Override
    public boolean contratar(Equipo e) {
        try{
            if (!getHistorial().contains(e) && golesConvertidos > 30.0 && cantAsistencias > 10){
                System.out.println("El " + getNombre() + " jugador campo " + golesConvertidos + cantAsistencias + " se contrató en el " + e.getNombre());
                getHistorial().add(e);
                return true;
            } else{
                throw new CriteriosContratarException("No se puede contratar porque no cumple con los criterios.");
            }
        } catch (CriteriosContratarException ex){
            ex.getMessage();
        }
        return false;
    }

    @Override
    public boolean renovar(Equipo e) {
        return super.renovar(e);
    }
}
