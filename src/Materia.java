import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Double> notas;

    public Materia (String nombre, ArrayList<Double> notas){
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public void agregar_nota (double nota){
        notas.add(nota);
    }

    public double promedio_materia (){
        double promedio = 0;
        int cont = 0;
        for (double nota : notas){
            promedio += nota;
            cont ++;
        }
        return promedio / cont;
    }

    public double menor_nota (){
        double menor = 10;
        for (double nota : notas){
            if (nota < menor){
                menor = nota;
            }
        }
        return menor;
    }

    public double mayor_nota (){
        double mayor = 10;
        for (double nota : notas){
            if (nota > mayor){
                mayor = nota;
            }
        }
        return mayor;
    }
}
