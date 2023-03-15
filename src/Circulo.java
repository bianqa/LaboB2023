public class Circulo {
    private double radio;

    public Circulo(){
        this.radio = 2;
    }

    public Circulo (double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }

    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }

}

