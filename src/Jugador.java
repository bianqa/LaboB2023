import Intercambio.Fecha;

public class Jugador extends Persona{
    private int nro_camiseta;

    public Jugador (){
        super();
        nro_camiseta = 1;
    }

    public Jugador (String nombre, String apellido, int edad, String direccion, Fecha fecha_nacimiento, int nro_camiseta){
        super(nombre, apellido, fecha_nacimiento, edad, direccion);
        this.nro_camiseta = nro_camiseta;
    }

    public int getNro_camiseta() {
        return nro_camiseta;
    }

    public void setNro_camiseta(int nro_camiseta) {
        this.nro_camiseta = nro_camiseta;
    }
}
