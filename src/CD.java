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
       if (canciones.size() > 0){
           return canciones.size();
       } else{
           return 0;
       }
    }

    public Cancion ver_cancion (int posicion){
        if (canciones.size() > 0){
            Cancion cancion = canciones.get(posicion-1);
            return cancion;
        } else{
            return null;
        }
    }

    public void graba_cancion (int posicion, Cancion nueva_cancion){
        if (canciones.size() > 0){
            canciones.set((posicion-1), nueva_cancion);
        } else{
            System.out.println("La lista de canciones está vacia.");
        }
    }

    public void agrega (Cancion cancion){
        canciones.add(cancion);
    }

    public void elimina (int posicion){
        if ((canciones.size() >= (posicion - 1)) && (canciones.size() > 0)){
            canciones.remove(posicion-1);
        } else{
            System.out.println("La lista de canciones está vacia.");
        }
    }
}
