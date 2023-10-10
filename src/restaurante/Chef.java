package restaurante;

import Intercambio.Fecha;
import personas.Persona;

public class Chef extends Persona {
    private boolean experiencia;
    private Restaurante restauranteActual;

    public Chef (){
        super();
        experiencia = true;
    }

    public Chef (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, boolean experiencia){
        super (nombre, apellido, nacimiento, edad, direccion);
        this.experiencia = experiencia;
    }

    public boolean isExperiencia() {
        return experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }
}
