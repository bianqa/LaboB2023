package empresaLlamadas;

import curling.Dia;
import personas.Persona;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Empleado extends Persona {
    private long dni;
    private String pais;
    private String nro_telefono;

    public Empleado () {
        super();
        dni = 11111111;
        pais = "Argentina";
        nro_telefono = "+54 11 9 1111 1111";
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNro_telefono() {
        return nro_telefono;
    }

    public void setNro_telefono(String nro_telefono) {
        this.nro_telefono = nro_telefono;
    }
}
