package alturaPeso;

import Intercambio.Fecha;
import personas.Persona;

import java.util.HashMap;

public class Paciente extends Persona {
    private HashMap<Fecha,Double> altura;
    private HashMap<Fecha,Double> peso;

    public Paciente (){
        super();
        altura = new HashMap<Fecha,Double>();
        peso = new HashMap<Fecha,Double>();
    }

    public Paciente (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, HashMap<Fecha,Double> altura, HashMap<Fecha,Double> peso){
        super(nombre, apellido, nacimiento, edad, direccion);
        this.altura = altura;
        this.peso = peso;
    }

    public HashMap<Fecha, Double> getAltura() {
        return altura;
    }

    public void setAltura(HashMap<Fecha, Double> altura) {
        this.altura = altura;
    }

    public HashMap<Fecha, Double> getPeso() {
        return peso;
    }

    public void setPeso(HashMap<Fecha, Double> peso) {
        this.peso = peso;
    }

    public void agregar_altura (double altura1, Fecha fecha){
        altura.put(fecha, altura1);
    }

    public void agregar_peso (double peso1, Fecha fecha){
        peso.put(fecha, peso1);
    }
}
