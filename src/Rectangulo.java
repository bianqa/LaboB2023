public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo (double radio){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return (base+altura)*2;
    }
}
