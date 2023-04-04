public class Horario {
    private boolean manana;
    private boolean tarde;
    private boolean noche;

    public Horario (){
        manana = false;
        tarde = false;
        noche = false;
    }

    public Horario (boolean manana, boolean tarde, boolean noche){
        this.manana = manana;
        this.tarde = tarde;
        this.noche = noche;
    }

    public boolean isManana() {
        return manana;
    }

    public void setManana(boolean manana) {
        this.manana = manana;
    }

    public boolean isTarde() {
        return tarde;
    }

    public void setTarde(boolean tarde) {
        this.tarde = tarde;
    }

    public boolean isNoche() {
        return noche;
    }

    public void setNoche(boolean noche) {
        this.noche = noche;
    }
}
