package formasGeometricas;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(){
        radio = 2;
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

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
}

