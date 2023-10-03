package organizacionPoliticos;

import Intercambio.Color;

public class Paloma extends Ave{
    private boolean mapa;
    private boolean volar;

    public Paloma (){
        super();
        mapa = false;
        volar = false;
    }

    public Paloma (String especie, Color color, String nombre, boolean mapa, boolean volar){
        super(especie, color, nombre);
        this.mapa = mapa;
        this.volar = volar;
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

    public void hacerCampania(String nombre) {
        if (volar){
            System.out.println("Lanzando un papelito que dice: “Vote por el partido " + nombre + " para un mejor futuro”");
        } else {
            System.out.println("El ave no sabe volar");
        }
    }
}
