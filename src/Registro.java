import java.util.ArrayList;

public class Registro {
    private ArrayList<Llamada> llamadas;
    private ArrayList<Empleado> empleados;

    public Registro (){
        llamadas = new ArrayList<Llamada>();
        empleados = new ArrayList<Empleado>();
    }

    public Registro (ArrayList<Llamada> llamadas, ArrayList<Empleado> empleados){
        this.llamadas = llamadas;
        this.empleados = empleados;
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void llamar (Llamada llamada){
        llamadas.add(llamada);
        if (!empleados.contains(llamada.getOrigen())){
            empleados.add(llamada.getOrigen());
        }
        if (!empleados.contains(llamada.getDestino())){
            empleados.add(llamada.getDestino());
        }
    }

    public void listado (){
        Empleado empleado;
        int cont;
        for (Empleado empleado1 : empleados){
            cont = 0;
            System.out.println("Empleado " + empleado1.getNombre() + " " + empleado1.getApellido() + ": ");
            for (Llamada llamada : llamadas){
                if (llamada.getOrigen() == empleado1){
                    cont ++;
                    System.out.println("- Llamó a " + llamada.getDestino().getNombre() + " " + llamada.getDestino().getApellido() + ". Fecha: " + llamada.getFecha().mostrar() + ". Duración: " + llamada.getDuracion());
                }
            }
            if (cont == 0){
                System.out.println("- No llamó a nadie.");
            }
        }
    }

    public void ranking (){
        int d1 = 0, d2 = 0, d3 = 0;
        Empleado e1 = new Empleado(), e2 = new Empleado(), e3 = new Empleado();
        for (Empleado empleado : empleados){
            for (Llamada llamada : llamadas) {
                if (!llamada.getOrigen().getPais().equals(llamada.getDestino().getPais()) && llamada.getOrigen().equals(empleado)){
                    if (llamada.getDuracion() > d1) {
                        d3 = d2;
                        e3 = e2;
                        d2 = d1;
                        e2 = e1;
                        d1 = llamada.getDuracion();
                        e1 = llamada.getOrigen();
                    } else if (llamada.getDuracion() > d2) {
                        d3 = d2;
                        e3 = e2;
                        d2 = llamada.getDuracion();
                        e2 = llamada.getOrigen();
                    } else if (llamada.getDuracion() > d3) {
                        d3 = llamada.getDuracion();
                        e3 = llamada.getOrigen();
                    }
                }
            }
        }
        System.out.println("N°1: " + e1.getNombre() + " " + e1.getApellido() + ". Duración: " + d1);
        System.out.println("N°2: " + e2.getNombre() + " " + e2.getApellido() + ". Duración: " + d2);
        System.out.println("N°3: " + e3.getNombre() + " " + e3.getApellido() + ". Duración: " + d3);
    }

    public static void main(String[] args) {
        Llamada llamada1 = new Llamada();
        Llamada llamada2 = new Llamada();
        ArrayList<Llamada> llamadas = new ArrayList<Llamada>();
        Registro registro = new Registro();
        registro.llamar(llamada1);
        registro.llamar(llamada2);
        registro.listado();
        registro.ranking();
    }
}
