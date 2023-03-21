public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Coche (String marca, String modelo, String color, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int acelerar(){
        return velocidad++;
    }

    public int frenar(){
        if (velocidad-- < 0){
            return velocidad;
        } else{
            return velocidad--;
        }
    }

    public int mostrar_velocidad(){
        return velocidad;
    }
}
