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
    }

    public void listado (){
        Empleado empleado;
        for (Llamada llamada : llamadas){
            empleado = llamada.getOrigen();
            System.out.println("Empleado " + llamada.getOrigen().getNombre() + " " + llamada.getOrigen().getApellido() + ":");
            for (Llamada llamada1 : llamadas){
                if (llamada1.getOrigen() == empleado){
                    System.out.println("- Llamó a " + llamada1.getDestino().getNombre() + " " + llamada1.getDestino().getApellido() + ". Fecha: " + llamada1.getFecha().mostrar() + ". Duración: " + llamada1.getDuracion());
                }
            }
        }
    }

    public void ranking (){
        int d1 = 0, d2 = 0, d3 = 0;
        Empleado e1, e2, e3;
        for (int i = 0; i < llamadas.size(); i ++){
            if (llamadas.get(i).getDuracion() > d1){

            }
        }
    }
}
