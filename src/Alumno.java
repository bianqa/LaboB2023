import java.util.ArrayList;
import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fecha_nacimiento;
    private ArrayList<Materia> materias;

    public Alumno (){
        nombre = "";
        apellido = "";
        fecha_nacimiento = new Fecha();
        materias = new ArrayList<Materia>();
    }

    public Alumno (String nombre, String apellido, Fecha fecha_nacimiento, ArrayList<Materia> materias){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public ArrayList<Materia> materias() {
        return materias;
    }

    public void setLista_notas(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public void agregar_nota (String materia, double nota){
        for (Materia materia1 : materias) {
            if (Objects.equals(materia1.getNombre(), materia)) {
                materia1.getNotas().add(nota);
            }
        }
    }

    public Double menor_nota (String materia){
        double menor = 10;
        for (Materia materia1 : materias){
            if (Objects.equals(materia1.getNombre(), materia)){
                for (Double nota : materia1.getNotas()){
                    if (nota < menor){
                        menor = nota;
                    }
                }
            }
        }
        return menor;
    }

    public double mayor_nota (String materia){
        double mayor = 1;
        for (Materia materia1 : materias){
            if (Objects.equals(materia1.getNombre(), materia)){
                for (Double nota : materia1.getNotas()){
                    if (nota > mayor){
                        mayor = nota;
                    }
                }
            }
        }
        return mayor;
    }

    public void agregar_materia (String nueva_materia){
        materias.add(new Materia (nueva_materia, null));
    }

    public double promedio_materia (String materia){
        double promedio = 0;
        int cont = 0;
        for (Materia materia1 : materias){
            if (Objects.equals(materia1.getNombre(), materia)){
                for (double nota : materia1.getNotas()){
                    promedio += nota;
                    cont ++;
                }
            }
        }
        return promedio / cont;
    }
}
