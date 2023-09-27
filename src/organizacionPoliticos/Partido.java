package organizacionPoliticos;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private int afiliados;
    private HashSet<Mensajero> mensajeros;

    public Partido (){
        nombre = "a";
        direccion = "hola 1234";
        afiliados = 30;
        mensajeros = new HashSet<>();
    }

    public Partido (String nombre, String direccion, int afiliados, HashSet<Mensajero> mensajeros){
        this.nombre = nombre;
        this.direccion = direccion;
        this.afiliados = afiliados;
        this.mensajeros = mensajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(int afiliados) {
        this.afiliados = afiliados;
    }

    public HashSet<Mensajero> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<Mensajero> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public void agregarMensajero (Mensajero mensajero){
        mensajeros.add(mensajero);
    }

    public void hacerCampania (){
        for (Mensajero m : mensajeros){
            m.hacerCampania(getNombre());
        }
    }
}
