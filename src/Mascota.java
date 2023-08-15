abstract class Mascota {
    private String nombre;
    private Duenio duenio;
    private int alegria;

    public Mascota (){
        nombre = "firulais";
        duenio = new Duenio();
        alegria = 1;
    }

    public Mascota (String nombre, Duenio duenio){
        this.nombre = nombre;
        this.duenio = duenio;
        alegria = 5;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    abstract String saludar();
    abstract void alimentar();
    abstract String tipo();
}
