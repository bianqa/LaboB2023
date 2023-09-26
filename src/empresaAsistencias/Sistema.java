package empresaAsistencias;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Sistema {
    private HashSet<Empleado> empleados;

    public Sistema (){
        empleados = new HashSet<>();
    }

    public Sistema (HashSet<Empleado> empleados){
        this.empleados = empleados;
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
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
}
