package Intercambio;

import Intercambio.EstadoRopa;
import Intercambio.PrendaRopa;

public class Pantalon extends PrendaRopa {
    private Double cintura;
    private Double cadera;
    private Double largo;

    public Pantalon (){
        super();
        cintura = 80.0;
        cadera = 85.0;
        largo = 120.0;
    }

    public Pantalon (Color color, MaterialRopa material, String marca, EstadoRopa estado, Double cintura, Double cadera, Double largo){
        super(color, material, marca, estado);
        this.cintura = cintura;
        this.cadera = cadera;
        this.largo = largo;
    }

    public Double getCintura() {
        return cintura;
    }

    public void setCintura(Double cintura) {
        this.cintura = cintura;
    }

    public Double getCadera() {
        return cadera;
    }

    public void setCadera(Double cadera) {
        this.cadera = cadera;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return super.toString() + "Intercambio.Pantalon{" +
                "cintura=" + cintura +
                ", cadera=" + cadera +
                ", largo=" + largo +
                '}';
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
