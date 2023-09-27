package organizacionPoliticos;

import Intercambio.Color;

public class Ave implements Mensajero{
    private static String especie = "común";
    private Color color;
    private String nombre;
    private boolean mapa;
    private boolean volar;

    public Ave (){
        color = Color.AMARILLO;
        nombre = "pio";
        mapa = false;
        volar = false;
    }

    public Ave (Color color, String nombre, boolean mapa, boolean volar){
        this.color = color;
        this.nombre = nombre;
        this.mapa = mapa;
        this.volar = volar;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Ave.especie = especie;
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

    public boolean isMapa() {
        return mapa;
    }

    public void setMapa(boolean mapa) {
        this.mapa = mapa;
    }

    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = volar;
    }

    @Override
    public void hacerCampania(String nombre) {
        if (volar){
            System.out.println("Lanzando un papelito que dice: “Vote por el partido " + nombre + " para un mejor futuro”");
        } else {
            System.out.println("El ave no sabe volar");
        }
    }
}
