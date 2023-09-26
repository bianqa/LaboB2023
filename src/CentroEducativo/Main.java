package CentroEducativo;

import java.util.Date;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Escrito e1 = new Escrito(new Date(2000,1,1), Nota.CINCO);
        Escrito e2 = new Escrito(new Date(2000,1,1), Nota.SEIS);
        Escrito e3 = new Escrito(new Date(2000,1,1), Nota.SEIS);
        Escrito e4 = new Escrito(new Date(2000,1,1), Nota.SEIS);
        Escrito e5 = new Escrito(new Date(2000,1,1), Nota.SEIS);
        Oral e7 = new Oral(new Date(2000, 1, 1), Satisfaccion.INSUFICIENTE);
        Oral e8 = new Oral(new Date(2000, 1, 1), Satisfaccion.SUFICIENTE);
        Oral e9 = new Oral(new Date(2000, 1, 1), Satisfaccion.EXCELENTE);

        HashSet<Examen> examenes1 = new HashSet<>();
        examenes1.add(e1);
        examenes1.add(e3);
        Alumno a1 = new Alumno(examenes1);

        HashSet<Examen> examenes2 = new HashSet<>();
        examenes2.add(e2);
        examenes2.add(e4);
        Alumno a2 = new Alumno(examenes2);

        HashSet<Alumno> alumnos = new HashSet<>();
        alumnos.add(a1);
        alumnos.add(a2);

        Sistema sistema = new Sistema(alumnos);

        sistema.cantAprobados();

    }
}
