import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Empleado extends Persona{
    private String apellido;
    private Fecha nacimiento;
    private long dni;
    private String pais;
    private String nro_telefono;
    private HashSet<Dia> diasPorSemana;
    private HashSet<Date> asistencias;

    public Empleado (){
        super();
        apellido = "";
        nacimiento = new Fecha();
        dni = 11111111;
        pais = "Argentina";
        nro_telefono = "+54 11 9 1111 1111";
        diasPorSemana = new HashSet<Dia>();
        asistencias = new HashSet<Date>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNro_telefono() {
        return nro_telefono;
    }

    public void setNro_telefono(String nro_telefono) {
        this.nro_telefono = nro_telefono;
    }

    public HashSet<Dia> getDiasPorSemana() {
        return diasPorSemana;
    }

    public void setDiasPorSemana(HashSet<Dia> diasPorSemana) {
        this.diasPorSemana = diasPorSemana;
    }

    public HashSet<Date> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(HashSet<Date> asistencias) {
        this.asistencias = asistencias;
    }

    public double porcentaje_asistencias (int anio, int mes){
        double porcentaje;
        int cont = 0;
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date (anio-1900, mes-1, 1));
        int month = cal.get(Calendar.MONTH);
        for (Date date1 : asistencias){
            Calendar date = Calendar.getInstance();
            date.setTime(date1);
            if (date.get(Calendar.MONTH) == (month)){
                cont++;
            }
        }
        porcentaje = diasPorSemana.size()*4;
        porcentaje = cont * 100 / porcentaje;
        return porcentaje;
    }
}
