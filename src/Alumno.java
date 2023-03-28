import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fecha_nacimiento;
    private ArrayList<Double> lista_notas;

    public Alumno (){
        nombre = "";
        apellido = "";
        fecha_nacimiento = new Fecha();
        lista_notas = new ArrayList<Double>();
    }

    public Alumno (String nombre, String apellido, Fecha fecha_nacimiento, ArrayList<Double> lista_notas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.lista_notas = lista_notas;
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

    public ArrayList<Double> getLista_notas() {
        return lista_notas;
    }

    public void setLista_notas(ArrayList<Double> lista_notas) {
        this.lista_notas = lista_notas;
    }

    public void agregar_nota (double nota){
        lista_notas.add(nota);
    }

    public double menor_nota (){
        double menor_nota1 = lista_notas.get(0);
        for (double nota : lista_notas){
            if (nota < menor_nota1){
                menor_nota1 = nota;
            }
        }
        return menor_nota1;
    }

    public double mayor_nota (){
        double mayor_nota1 = lista_notas.get(0);
        for (double nota : lista_notas){
            if (nota > mayor_nota1){
                mayor_nota1 = nota;
            }
        }
        return mayor_nota1;
    }
}
