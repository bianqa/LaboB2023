package empresaLlamadas;

import Intercambio.Fecha;
import empresaLlamadas.Empleado;

public class Llamada {
    private Empleado origen;
    private Empleado destino;
    private Fecha fecha;
    private int duracion;

    public Llamada (){
        origen = new Empleado();
        destino = new Empleado();
        fecha = new Fecha();
        duracion = 1;
    }

    public Llamada (Empleado origen, Empleado destino, Fecha fecha, int duracion){
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public Empleado getOrigen() {
        return origen;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public void setDestino(Empleado destino) {
        this.destino = destino;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
