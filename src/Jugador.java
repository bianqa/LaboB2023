public class Jugador extends Persona{
    private Fecha fecha_nacimiento;
    private int nro_camiseta;

    public Jugador (){
        super();
        fecha_nacimiento = new Fecha();
        nro_camiseta = 1;
    }

    public Jugador (String nombre, int edad, String direccion, Fecha fecha_nacimiento, int nro_camiseta){
        /*super(nombre, edad, direccion);*/
        this.fecha_nacimiento = fecha_nacimiento;
        this.nro_camiseta = nro_camiseta;
    }

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getNro_camiseta() {
        return nro_camiseta;
    }

    public void setNro_camiseta(int nro_camiseta) {
        this.nro_camiseta = nro_camiseta;
    }
}
