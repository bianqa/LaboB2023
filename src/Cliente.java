public class Cliente extends Persona{
    private String cuil;
    private String apellido;
    private int dni;
    private Fecha fecha_nacimiento;
    private String num_telefono;

    public Cliente (){
        super();
        cuil = "11-11111111-1";
        apellido = "";
        dni = 11111111;
        fecha_nacimiento = new Fecha();
        num_telefono = "11 9 1111 1111";
    }

    public Cliente (String nombre, int edad, String direccion, String cuil, String apellido, int dni, Fecha fecha_nacimiento, String num_telefono){
        super(nombre, edad, direccion);
        this.cuil = cuil;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.num_telefono = num_telefono;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
