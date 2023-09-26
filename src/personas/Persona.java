package personas;

import Intercambio.Fecha;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private Fecha nacimiento;
    private int edad;
    private String direccion;

    public Persona (){
        nombre = "juancito";
        apellido = "";
        nacimiento = new Fecha();
        edad = 1;
        direccion = "";
    }

    public Persona (String nombre, String apellido, Fecha nacimiento, int edad, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.direccion = direccion;
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

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /*public String toString(){
        return "Nombre: " + nombre
                "Apellido: " + apellido
                "Edad: " + edad;
    }*/
}
