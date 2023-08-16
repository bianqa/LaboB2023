abstract class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private static int cant_ruedas = 4;
    private int anio_fabricacion;

    public Vehiculo (){
        marca = "";
        modelo = "";
        color = Color.ROJO;
        anio_fabricacion = 2000;
    }

    public Vehiculo (String marca, String modelo, Color color, int anio_fabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio_fabricacion = anio_fabricacion;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static int getCant_ruedas() {
        return cant_ruedas;
    }

    public static void setCant_ruedas(int cant_ruedas) {
        Vehiculo.cant_ruedas = cant_ruedas;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(int anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }
}
