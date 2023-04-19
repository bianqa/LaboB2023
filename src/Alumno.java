import java.util.ArrayList;

public class Alumno extends Persona{
    private String apellido;
    private Fecha fecha_nacimiento;
    private ArrayList<Materia> materias;
    private String division;

    public Alumno (){
        super();
        apellido = "";
        fecha_nacimiento = new Fecha();
        materias = new ArrayList<Materia>();
        division = "1° A";
    }

    public Alumno (String nombre, int edad, String direccion, String apellido, Fecha fecha_nacimiento, ArrayList<Materia> materias, String division){
        super(nombre, edad, direccion);
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.materias = materias;
        this.division = division;
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
