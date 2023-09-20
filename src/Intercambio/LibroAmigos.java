package Intercambio;

import java.util.HashMap;
import java.util.HashSet;

public class LibroAmigos extends RevistasLibros {
    private HashMap<Integer, Integer> pagsCapitulo;
    private int anio;

    public LibroAmigos (){
        super();
        pagsCapitulo = new HashMap<>();
    }

    public LibroAmigos (String ISBN, String titulo, int anio, HashMap<Integer, Integer> pagsCapitulo){
        super(ISBN, titulo);
        this.anio = anio;
        this.pagsCapitulo = pagsCapitulo;
    }

    public HashMap<Integer, Integer> getPagsCapitulo() {
        return pagsCapitulo;
    }

    public void setPagsCapitulo(HashMap<Integer, Integer> pagsCapitulo) {
        this.pagsCapitulo = pagsCapitulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return super.toString() + "Intercambio.LibroAmigos{" +
                "pagsCapitulo=" + pagsCapitulo +
                ", anio=" + anio +
                '}';
    }

    @Override
    public boolean prestar() {
        return pagsCapitulo.size() % 2 != 0;
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
