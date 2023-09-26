package bebidas;

public abstract class Bebida {
    private String nombre;
    private int negatividad;

    public Bebida (){
        nombre = "pesi";
        negatividad = 1;
    }

    public Bebida (String nombre, int negatividad){
        this.nombre = nombre;
        this.negatividad = negatividad;
    }
    public Bebida (int negatividad){
        nombre = "pesi";
        this.negatividad = negatividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNegatividad() {
        return negatividad;
    }

    public void setNegatividad(int negatividad) {
        this.negatividad = negatividad;
    }
}
