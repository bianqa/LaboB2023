package biblioteca;

import Intercambio.Fecha;
import biblioteca.LibroElectronico;
import personas.Persona;

import java.util.HashSet;

public class AutorLibro extends Persona {
    private HashSet<LibroElectronico> librosEscritos;

    public AutorLibro (){
        super();
        librosEscritos = new HashSet<>();
    }

    public AutorLibro (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, HashSet<LibroElectronico> librosEscritos){
        super(nombre, apellido, nacimiento, edad, direccion);
        this.librosEscritos = librosEscritos;
    }

    public HashSet<LibroElectronico> getLibrosEscritos() {
        return librosEscritos;
    }

    public void setLibrosEscritos(HashSet<LibroElectronico> librosEscritos) {
        this.librosEscritos = librosEscritos;
    }
}
