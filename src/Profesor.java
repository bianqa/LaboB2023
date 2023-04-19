public class Profesor extends Persona{
    private String apellido;
    private double descuento;

    public Profesor (){
        super();
        apellido = "";
        descuento = 20;
    }



    public Profesor (String nombre, int edad, String direccion, String apellido, double descuento){
        super(nombre, edad, direccion);
        this.apellido = apellido;
        if (descuento < 0){
            this.descuento = 0;
        } else if (descuento > 100){
            this.descuento = 100;
        } else{
            this.descuento = descuento;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
