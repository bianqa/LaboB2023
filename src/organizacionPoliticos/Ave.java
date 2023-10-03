package organizacionPoliticos;

import Intercambio.Color;

public class Ave implements Mensajero{
    private String especie;
    private Color color;
    private String nombre;

    public Ave (){
        especie = "qefqe";
        color = Color.AMARILLO;
        nombre = "pio";
    }

    public Ave (String especie, Color color, String nombre){
        this.especie = especie;
        this.color = color;
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hacerCampania(String nombre) {
    }
}
