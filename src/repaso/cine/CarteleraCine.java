package repaso.cine;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashSet;

public class CarteleraCine {
    private static int cantUsu;
    private static int cantPeliculas;
    private HashSet<Pelicula> peliculas;
    private HashSet<EspectadorCine> espectadores;
    private HashSet<FuncionCine> funciones;

    public CarteleraCine (){
        cantUsu = 0;
        cantPeliculas = 0;
        peliculas = new HashSet<Pelicula>();
        espectadores = new HashSet<EspectadorCine>();
        funciones = new HashSet<FuncionCine>();
    }

    public CarteleraCine (HashSet<Pelicula> peliculas, HashSet<EspectadorCine> espectadores, HashSet<FuncionCine> funciones){
        cantUsu = espectadores.size();
        cantPeliculas = peliculas.size();
        this.peliculas = peliculas;
        this.espectadores = espectadores;
        this.funciones = funciones;
    }

    public static int getCantUsu() {
        return cantUsu;
    }

    public static void setCantUsu(int cantUsu) {
        CarteleraCine.cantUsu = cantUsu;
    }

    public static int getCantPeliculas() {
        return cantPeliculas;
    }

    public static void setCantPeliculas(int cantPeliculas) {
        CarteleraCine.cantPeliculas = cantPeliculas;
    }

    public HashSet<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(HashSet<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public HashSet<EspectadorCine> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(HashSet<EspectadorCine> espectadores) {
        this.espectadores = espectadores;
    }

    public HashSet<FuncionCine> getFunciones() {
        return funciones;
    }

    public void setFunciones(HashSet<FuncionCine> funciones) {
        this.funciones = funciones;
    }

    public int cantUsuarios (){
        return cantUsu;
    }

    public int cantPeliculas (){
        return cantPeliculas;
    }

    public void agregarFuncion (Pelicula pelicula, Date fechaHora, SalaCine sala, int cantEspectadores){
        boolean sePuede = true;
        for (FuncionCine funciones1 : funciones){
            if (funciones1.getSala().getNumero() == sala.getNumero() && (funciones1.getFechaHora().equals(fechaHora) || funciones1.getFechaHora().after(fechaHora) && funciones1.getFechaHora().before(funciones1.getPelicula().horaTermina(funciones1.getFechaHora())))){
                System.out.println("No se puede agregar porque ya hay una funcion en esa sala a esa hora.");
                sePuede = false;
            }
        }
        if (sePuede){
            FuncionCine f = new FuncionCine(pelicula, fechaHora, sala, cantEspectadores);
            funciones.add(f);
        }
    }

    public void funcionesDisponibles (){
        ZonedDateTime a = ZonedDateTime.now();
        Date ahora = Date.from(java.time.ZonedDateTime.now().toInstant());
        for (FuncionCine funcion : funciones){
            if (funcion.getFechaHora().after(ahora) || (funcion.getFechaHora().after(ahora) && funcion.getCantExpectadores() < funcion.getSala().getMaxEspectadores())){
                System.out.println("--FUNCION--");
                System.out.println("repaso.cine.Pelicula: " + funcion.getPelicula().getTitulo());
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM HH:mm");
                String str = formato.format(funcion.getFechaHora());
                System.out.println("Intercambio.Fecha: " + str);
                System.out.println("Sala: " + funcion.getSala().getNumero());
                System.out.println("-----------");
            }
        }
    }

    public static void main(String[] args) {
        CarteleraCine a = new CarteleraCine();
        a.funcionesDisponibles();
    }
}
