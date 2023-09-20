package Intercambio;

import Intercambio.EstadoRopa;
import Intercambio.PrendaRopa;

public class Remera extends PrendaRopa {
    private Double espalda;
    private Double contorno;
    private Double torso;

    public Remera (){
        super();
        espalda = 40.0;
        contorno = 35.0;
        torso = 70.0;
    }

    public Remera (Color color, MaterialRopa material, String marca, EstadoRopa estado, Double espalda, Double contorno, Double torso){
        super(color, material, marca, estado);
        this.espalda = espalda;
        this.contorno = contorno;
        this.torso = torso;
    }

    public Double getEspalda() {
        return espalda;
    }

    public void setEspalda(Double espalda) {
        this.espalda = espalda;
    }

    public Double getContorno() {
        return contorno;
    }

    public void setContorno(Double contorno) {
        this.contorno = contorno;
    }

    public Double getTorso() {
        return torso;
    }

    public void setTorso(Double torso) {
        this.torso = torso;
    }

    @Override
    public String toString() {
        return super.toString() + "Intercambio.Remera{" +
                "espalda=" + espalda +
                ", contorno=" + contorno +
                ", torso=" + torso +
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
