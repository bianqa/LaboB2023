package organizacionPoliticos;

import Intercambio.Fecha;
import curling.Dia;
import curling.Horario;
import personas.Persona;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public class Trabajador extends Persona implements Mensajero{
    private int dni;
    private int cuil;
    private Double sueldo;
    private HashMap<Dia, Horario> horario;

    public Trabajador (){
        super();
        dni = 30000000;
        cuil = 2030000007;
        sueldo = 10.0;
        horario = new HashMap<>();
    }

    public Trabajador (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, int dni, int cuil, Double sueldo, HashMap<Dia, Horario> horario){
        super(nombre, apellido, nacimiento, edad, direccion);
        this.dni = dni;
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.horario = horario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public HashMap<Dia, Horario> getHorario() {
        return horario;
    }

    public void setHorario(HashMap<Dia, Horario> horario) {
        this.horario = horario;
    }

    @Override
    public void hacerCampania(String nombre) {
        LocalDateTime ahora = LocalDateTime.now();
        DayOfWeek dia = ahora.getDayOfWeek();
        int hora = ahora.getHour();
        if (hora == 0){
            hora = 24;
        }
        boolean sePuede = false;
        for (Dia d : horario.keySet()){
            if (d.getDia().equals(dia) && (horario.get(d).getHora1() <= hora && horario.get(d).getHora2() >= hora)){
                sePuede = true;
            }
        }
        if (sePuede){
            System.out.println("Yo, " + getNombre() + " te invito a que Vote por el partido " + nombre + " para un mejor futuro");
        } else{
            System.out.println("No está en su horario laboral");
        }
    }
}
