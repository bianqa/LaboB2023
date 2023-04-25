public class Cliente extends Persona{
    private String apellido;
    private String num_telefono;

    public Cliente (){
        super();
        apellido = "";
        num_telefono = "11 9 1111 1111";
    }

    public Cliente (String nombre, int edad, String direccion, String apellido, String num_telefono){
        super(nombre, edad, direccion);
        this.apellido = apellido;
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
}
