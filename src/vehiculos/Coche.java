package vehiculos;

import Intercambio.Color;
import vehiculos.Vehiculo;

public class Coche extends Vehiculo {
    private int velocidad;
    private String patente;
    private boolean descapotable;

    public Coche (){
        super();
        velocidad = 0;
        patente = "AAA 111";
        descapotable = false;
    }

    public Coche (String marca, String modelo, Color color, int anio_fabricacion, int velocidad, String patente, boolean descapotable){
        super(marca, modelo, color, anio_fabricacion);
        this.velocidad = 0;
        this.patente = patente;
        this.descapotable = descapotable;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public int acelerar(){
        return velocidad++;
    }

    public int frenar(){
        if (velocidad-- < 0){
            return velocidad;
        } else{
            return velocidad--;
        }
    }

    public int mostrar_velocidad(){
        return velocidad;
    }
}
