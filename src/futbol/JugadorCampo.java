package futbol;

import Intercambio.Fecha;
import org.omg.CORBA.PUBLIC_MEMBER;
import repaso.elecciones.Provincia;

import java.util.ArrayList;

public class JugadorCampo extends Jugador{
    private Double golesConvertidos;
    private int cantAsistencias;

    public JugadorCampo (){
        super();
        golesConvertidos = 56.5;
        cantAsistencias = 25;
    }

    public JugadorCampo (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, String posicion, Provincia provincia, ArrayList<Equipo> historial, int numero, Double golesConvertidos, int cantAsistencias){
        super(nombre, apellido, nacimiento, edad, direccion, posicion, provincia, historial, numero);
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
        if (!getHistorial().contains(e) && golesConvertidos > 30.0 && cantAsistencias > 10){
            System.out.println("El " + getNombre() + " jugador campo " + golesConvertidos + cantAsistencias + " se contrató en el " + e.getNombre());
            getHistorial().add(e);
            return true;
        }
        return false;
    }

    @Override
    public boolean renovar(Equipo e) {
        if (getHistorial().get(getHistorial().size()-1).equals(e) && getEdad() < 35){
            System.out.println("El " + getNombre() + "arquero" + golesConvertidos + cantAsistencias + " se renovó en el " + e.getNombre());
            return true;
        }
        return false;
    }
}
