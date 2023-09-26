package bebidas;

import Intercambio.Fecha;
import bebidas.Bebida;
import bebidas.BebidaAlcoholica;
import bebidas.BebidaAzucarada;
import bebidas.BebidaNeutra;
import personas.Persona;

import java.util.HashMap;

public class PersonaBebida extends Persona {
    private int dni;
    private HashMap<Bebida, Integer> bebidas;

    public PersonaBebida (){
        super();
        dni = 30000000;
        bebidas = new HashMap<>();
    }

    public PersonaBebida (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, int dni, HashMap<Bebida, Integer> bebidas){
        super(nombre, apellido, nacimiento, edad, direccion);
        this.dni = dni;
        this.bebidas = bebidas;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public HashMap<Bebida, Integer> getBebidas() {
        return bebidas;
    }

    public void setBebidas(HashMap<Bebida, Integer> bebidas) {
        this.bebidas = bebidas;
    }

    public int coeficienteResultante (){
        int coeficiente = 0;
        boolean primero = true;
        for (Bebida b : bebidas.keySet()){
            if (primero){
                primero = false;
                if (b instanceof BebidaNeutra){
                    coeficiente = bebidas.get(b) * (((BebidaNeutra)b).getPositividad() - b.getNegatividad());
                } else if (b instanceof BebidaAzucarada){
                    coeficiente = bebidas.get(b) * (((BebidaAzucarada)b).getPositividad() - b.getNegatividad());
                } else if (b instanceof BebidaAlcoholica) {
                    coeficiente = bebidas.get(b) * (((BebidaAlcoholica)b).getPositividad() - b.getNegatividad());
                }
            } else{
                int coeficiente1 = 0;
                if (b instanceof BebidaNeutra){
                    coeficiente1 = bebidas.get(b) * (((BebidaNeutra)b).getPositividad() - b.getNegatividad());
                } else if (b instanceof  BebidaAzucarada){
                    coeficiente1 = bebidas.get(b) * (((BebidaAzucarada)b).getPositividad() - b.getNegatividad());
                } else if (b instanceof  BebidaAlcoholica) {
                    coeficiente1 = bebidas.get(b) * (((BebidaAlcoholica)b).getPositividad() - b.getNegatividad());
                }
                coeficiente = coeficiente + coeficiente1;
            }
        }
        return coeficiente;
    }

    public void consumirBebida (Bebida b, int cantidad){
        if (bebidas.containsKey(b)){
            bebidas.put(b, bebidas.get(b) + cantidad);
        } else{
            bebidas.put(b, cantidad);
        }
    }
}
