package Intercambio;

public class Campera extends PrendaRopa {
    public Campera (){
        super();
    }

    public Campera (Color color, MaterialRopa material, String marca, EstadoRopa estado){
        super(color, material, marca, estado);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean prestar() {
        return super.prestar();
    }

    @Override
    public boolean agregarElemento() {
        if (prestar()){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos.");
            return true;
        } else{
            System.out.println("El articulo ingresado no podrá ingresar a nuestro sistema.");
            return false;
        }
    }
}
