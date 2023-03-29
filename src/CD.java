import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> canciones;

    public CD (){
        canciones = new ArrayList<Cancion>();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int numero_canciones(){
        return canciones.size();
    }

    public void ver_cancion (int posicion){
        System.out.println(canciones.get(posicion).getTitulo());
    }

    public void graba_cancion (int posicion, Cancion nueva_cancion){
        canciones.set(posicion, nueva_cancion);
    }

    public void agrega (Cancion cancion){
        canciones.add(cancion);
    }

    public void elimina (int posicion){
        canciones.remove(posicion);
    }
}
