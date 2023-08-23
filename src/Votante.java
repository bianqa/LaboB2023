public class Votante extends Persona{
    private String dni;
    private boolean voto;
    private static String nacionalidad = "Argentina";
    private Provincia provincia;

    public Votante (){
        dni = "30000000";
        voto = false;
        provincia = Provincia.CATAMARCA;
    }

    public Votante (String dni, boolean voto, Provincia provincia){
        this.dni = dni;
        this.voto = voto;
        this.provincia = provincia;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }

    public static String getNacionalidad() {
        return nacionalidad;
    }

    public static void setNacionalidad(String nacionalidad) {
        Votante.nacionalidad = nacionalidad;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
