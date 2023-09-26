package CentroEducativo;

import java.util.HashSet;

public class Sistema {
    HashSet<Alumno> alumnos;

    public Sistema (){
        alumnos = new HashSet<>();
    }

    public Sistema (HashSet<Alumno> alumnos){
        this.alumnos = alumnos;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public int cantAprobados (){
        int aprobados = 0;
        for (Alumno a : alumnos){
            if (a.aprobado()){
                aprobados ++;
            }
        }
        return aprobados;
    }
}
