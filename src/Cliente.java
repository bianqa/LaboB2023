public class Cliente extends Persona{
    private String cuil;
    private int dni;
    private String num_telefono;

    public Cliente (){
        super();
        cuil = "11-11111111-1";
        dni = 11111111;
        num_telefono = "11 9 1111 1111";
    }

    public Cliente (String nombre, int edad, String direccion, String cuil, String apellido, int dni, Fecha fecha_nacimiento, String num_telefono){
        super(nombre, apellido, fecha_nacimiento, edad, direccion);
        this.cuil = cuil;
        this.dni = dni;
        this.num_telefono = num_telefono;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
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
}
