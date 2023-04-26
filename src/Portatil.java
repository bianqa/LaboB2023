public class Portatil extends Cargador{
    private int cant_cargas;

    public Portatil (){
        super();
        cant_cargas = 5;
    }

    public Portatil (String nombre, double precio, int stock, int cant_cargas){
        super(nombre, precio, stock);
        this.cant_cargas = cant_cargas;
    }

    public int getCant_cargas() {
        return cant_cargas;
    }

    public void setCant_cargas(int cant_cargas) {
        this.cant_cargas = cant_cargas;
    }
}
