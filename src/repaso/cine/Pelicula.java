package repaso.cine;

import java.util.ArrayList;
import java.util.Date;

public class Pelicula {
    private String titulo;
    private int duracion;
    private GeneroPelicula genero;
    private int id;

    public Pelicula (){
        titulo = "avatar";
        duracion = 120;
        genero = GeneroPelicula.ACCION;
        id = 1;
    }

    public Pelicula (String titulo, int duracion, GeneroPelicula genero, int id){
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public GeneroPelicula getGenero() {
        return genero;
    }

    public void setGenero(GeneroPelicula genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date horaTermina (Date hora){
        int cantHoras;
        int cantMinutos = duracion;
        cantHoras = duracion % 60;
        if (cantHoras > 0){
            cantMinutos = duracion - cantHoras * 60;
        }
        if (hora.getMinutes() + duracion > 59) {
            if (1 + hora.getHours() > 23) {
                hora.setDate(hora.getDate() + 1);
                hora.setHours(0);
            } else{
                hora.setHours(hora.getHours() + 1);
            }
        }
        if (cantHoras + hora.getHours() > 23){
            hora.setDate(hora.getDate() + 1);
            hora.setHours(0);
        }
        hora.setHours(hora.getHours() + cantHoras);
        return hora;
    }
}
