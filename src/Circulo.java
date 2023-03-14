public class Circulo {
    private float radio;

    public Circulo(){
        this.radio = 2f;
    }

    public Circulo (float radio){
        radio = 2f;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularRadio(float radio){
        radio = Math.PI * (radio**2);
    }
}
