package bufe;

import Intercambio.Fecha;
import personas.Persona;
import java.util.ArrayList;

public class Alumno extends Persona{
    private ArrayList<Materia> materias;
    private String division;

    public Alumno (){
        super();
        materias = new ArrayList<Materia>();
        division = "1° A";
    }

    public Alumno (String nombre, int edad, String direccion, String apellido, Fecha fecha_nacimiento, ArrayList<Materia> materias, String division){
        super(nombre, apellido, fecha_nacimiento, edad, direccion);
        this.materias = materias;
        this.division = division;
    }

    public void setLista_notas(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Double menor_nota (){
        double menor = 10;
        for (Materia materia1 : materias){
            for (double nota : materia1.getNotas()){
                if (nota < menor){
                    menor = nota;
                }
            }
        }
        return menor;
    }

    public double mayor_nota (){
        double mayor = 1;
        for (Materia materia1 : materias){
            for (double nota : materia1.getNotas()){
                if (nota > mayor){
                    mayor = nota;
                }
            }
        }
        return mayor;
    }

    public void agregar_materia (String nueva_materia){
        materias.add(new Materia(nueva_materia, null));
    }

    public double promedio_global (){
        double promedio = 0;
        int cont = 0;
        for (Materia materia : materias){
            for (double nota : materia.getNotas()){
                promedio += nota;
                cont ++;
            }
        }
        return promedio / cont;
    }
}
