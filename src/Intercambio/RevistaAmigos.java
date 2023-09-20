package Intercambio;

import Intercambio.Fecha;

import java.util.Calendar;

public class RevistaAmigos extends RevistasLibros {
    private Fecha publicacion;

    public RevistaAmigos (){
        super();
        publicacion = new Fecha();
    }

    public RevistaAmigos (String ISBN, String titulo, Fecha publicacion){
        super(ISBN, titulo);
        this.publicacion = publicacion;
    }

    public Fecha getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Fecha publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Intercambio.RevistaAmigos{" +
                "publicacion=" + publicacion +
                '}';
    }

    @Override
    public boolean prestar() {
        return (publicacion.getMes()-3) < Calendar.getInstance().get(Calendar.MONTH);
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
