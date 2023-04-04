import java.util.ArrayList;

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
        materias.add(new Materia (nueva_materia, null));
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
