import Intercambio.Fecha;

import java.util.HashSet;

public class UsuarioBiblioteca extends Persona{
    private HashSet<LibroElectronico> librosPrestados;
    private MembresiaBiblioteca membresia;

    public UsuarioBiblioteca (){
        super();
        librosPrestados = new HashSet<>();
        membresia = MembresiaBiblioteca.BRONCE;
    }

    public UsuarioBiblioteca (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, HashSet<LibroElectronico> librosPrestados, MembresiaBiblioteca membresia){
        super(nombre, apellido, nacimiento, edad, direccion);
        this.librosPrestados = librosPrestados;
        this.membresia = membresia;
    }

    public HashSet<LibroElectronico> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(HashSet<LibroElectronico> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public MembresiaBiblioteca getMembresia() {
        return membresia;
    }

    public void setMembresia(MembresiaBiblioteca membresia) {
        this.membresia = membresia;
    }
}
