public class Profesor extends ClienteBufe{
    private double descuento;

    public Profesor (){
        super();
        descuento = 20;
    }

    public Profesor (String nombre, int edad, String direccion, String apellido, Fecha nacimiento, double descuento){
        super(nombre, apellido, nacimiento, edad, direccion);
        if (descuento < 0){
            this.descuento = 0;
        } else if (descuento > 100){
            this.descuento = 100;
        } else{
            this.descuento = descuento;
        }
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
