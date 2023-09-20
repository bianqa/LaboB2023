package Intercambio;

import Intercambio.ObjetoIntercambio;

public abstract class RevistasLibros extends ObjetoIntercambio {
    private String ISBN;
    private String titulo;

    public RevistasLibros (){
        ISBN = "111-111-111-111";
        titulo = "a";
    }

    public RevistasLibros (String ISBN, String titulo){
        this.ISBN = ISBN;
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Intercambio.RevistasLibros{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    @Override
    public boolean prestar() {
        return false;
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
