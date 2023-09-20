public class BebidaNeutra extends Bebida{
    private int positividad;
    public BebidaNeutra (){
        super();
        positividad = 1;
    }

    public BebidaNeutra (String nombre, int positividad, int negatividad){
        super(nombre, negatividad);
        this.positividad = positividad;
    }

    public int getPositividad() {
        return positividad;
    }

    public void setPositividad(int positividad) {
        this.positividad = positividad;
    }
}
