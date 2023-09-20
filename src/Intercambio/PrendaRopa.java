package Intercambio;

import Intercambio.EstadoRopa;
import Intercambio.ObjetoIntercambio;

public abstract class PrendaRopa extends ObjetoIntercambio {
    private Color color;
    private MaterialRopa material;
    private String marca;
    private EstadoRopa estado;

    public PrendaRopa (){
        color = Color.AMARILLO;
        material = MaterialRopa.ALGODON;
        marca = "locura";
        estado = new EstadoRopa();
    }

    public PrendaRopa (Color color, MaterialRopa material, String marca, EstadoRopa estado){
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public MaterialRopa getMaterial() {
        return material;
    }

    public void setMaterial(MaterialRopa material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public EstadoRopa getEstado() {
        return estado;
    }

    public void setEstado(EstadoRopa estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Intercambio.PrendaRopa{" +
                "color=" + color +
                ", material=" + material +
                ", marca='" + marca + '\'' +
                ", estado=" + estado +
                '}';
    }

    @Override
    public boolean prestar() {
        return (!getEstado().isMancha() && !getEstado().isRotura());
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
