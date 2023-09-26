package CentroEducativo;
import Intercambio.Fecha;
import personas.Persona;

import java.util.HashMap;
import java.util.HashSet;

public class Alumno extends Persona implements Aprobable{
    private int dni;
    private HashSet<Examen> examenes;

    public Alumno (){
        super();
        dni = 48000000;
        examenes = new HashSet<>();
    }

    public Alumno (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, int dni, HashSet<Examen> examenes){
        super(nombre, apellido, nacimiento, edad, direccion);
        this.dni = dni;
        this.examenes = examenes;
    }

    public Alumno (HashSet<Examen> examenes){
        super();
        dni = 48000000;
        this.examenes = examenes;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public HashSet<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(HashSet<Examen> examenes) {
        this.examenes = examenes;
    }

    public boolean aprobado (){
        for (Examen e : examenes){
            if (!e.aprobado()){
                return false;
            }
        }
        return true;
    }
}
