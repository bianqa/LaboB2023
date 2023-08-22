public class Votante extends Persona{
    private String dni;
    private boolean voto;
    private String nacionalidad;
    private String provincia;

    public Votante (){
        dni = "30000000";
        voto = false;
        nacionalidad = "Argentina";
        provincia = "Buenos Aires";
    }

    public Votante (String dni, boolean voto, String nacionalidad, String provincia){
        this.dni = dni;
        this.voto = voto;
        this.nacionalidad = nacionalidad;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
