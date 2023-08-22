import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Empresa {
    private ArrayList<Vehiculo> vehiculos;
    private HashSet<Empleado> empleados;

    public Empresa (){
        vehiculos = new ArrayList<Vehiculo>();
        empleados = new HashSet<Empleado>();
    }

    public Empresa (ArrayList<Vehiculo> vehiculos, HashSet<Empleado> empleados){
        this.vehiculos = vehiculos;
        this.empleados = empleados;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void mas_cantidad(){
        int cont_camioneta = 0, cont_auto = 0;
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo instanceof Coche){
                cont_auto ++;
            } else if (vehiculo instanceof Camioneta) {
                cont_camioneta ++;
            }
        }
        if (cont_auto > cont_camioneta){
            System.out.println("Hay más autos que camionetas. " + cont_auto);
        } else if (cont_camioneta > cont_auto){
            System.out.println("Hay más camionetas que autos. " + cont_camioneta);
        } else{
            System.out.println("Hay la misma cantidad de autos y camionetas." + cont_auto);
        }
    }

    public void aniadir_carga (Camioneta camioneta, int carga){
        boolean encontrado = false;
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo instanceof Camioneta){
                if (vehiculo == camioneta){
                    encontrado = true;
                    ((Camioneta) vehiculo).agregar_carga(carga);
                }
            }
        }
        if (!encontrado){
            System.out.println("No se ha encontrado la camioneta.");
        }
    }

    public int autos_descapotables (){
        int cant_descapotables = 0;
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo instanceof Coche){
                if (((Coche) vehiculo).isDescapotable()){
                    cant_descapotables ++;
                }
            }
        }
        return cant_descapotables;
    }

    public double asistencias_porcentaje (int anio, int mes){
        double porcentaje = 0;
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(anio-1900, mes-1, 1));
        int month = cal.get(Calendar.MONTH);
        for (Empleado empleado : empleados){
            porcentaje += empleado.porcentaje_asistencias(anio, mes);
        }
        return porcentaje / empleados.size();
    }

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        Camioneta c1 = new Camioneta();
        Camioneta c2 = new Camioneta();
        Coche a1 = new Coche("", "", Color.AMARILLO, 2000, 0, "AAA 111", true);
        Coche a2 = new Coche("", "", Color.AMARILLO, 2000, 0, "AAA 111", true);
        Coche a3 = new Coche();
        vehiculos.add(c1);
        vehiculos.add(c2);
        vehiculos.add(a1);
        vehiculos.add(a2);
        vehiculos.add(a3);
        Empresa empresa = new Empresa();
        empresa.setVehiculos(vehiculos);
        empresa.mas_cantidad();
        empresa.aniadir_carga(c2, 200);
        System.out.println(empresa.autos_descapotables());
    }
}
