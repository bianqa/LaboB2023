public class BebidaAzucarada extends Bebida{
    private int azucar;
    private static int positividad = 1;

    public BebidaAzucarada (){
        super(10);
        azucar = 1;
    }

    public BebidaAzucarada (String nombre, int azucar){
        super(nombre, azucar*10);
        this.azucar = azucar;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public static int getPositividad() {
        return positividad;
    }

    public static void setPositividad(int positividad) {
        BebidaAzucarada.positividad = positividad;
    }
}
