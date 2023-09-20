public class BebidaAlcoholica extends Bebida{
    private int alcohol;
    private static int positividad = 0;

    public BebidaAlcoholica (){
        super(20);
        alcohol = 1;
    }

    public BebidaAlcoholica (String nombre, int alcohol){
        super (nombre, alcohol*20);
        this.alcohol = alcohol;
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }

    public static int getPositividad() {
        return positividad;
    }

    public static void setPositividad(int positividad) {
        BebidaAlcoholica.positividad = positividad;
    }
}
