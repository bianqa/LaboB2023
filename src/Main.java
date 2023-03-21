public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        System.out.println("El radio del circulo por defecto es: " + circulo.getRadio());
        System.out.println("Area del circulo por defecto es: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo por defecto es: " + circulo.calcularPerimetro());
        Circulo circulo2 = new Circulo(6.6);
        System.out.println("El radio del circulo por parametro es: " + circulo2.getRadio());
        System.out.println("Area del circulo por parametro es: " + circulo2.calcularArea());
        System.out.println("Perimetro del circulo por parametro es: " + circulo2.calcularPerimetro());
        Fecha fecha = new Fecha();
        fecha.largo();
    }
}