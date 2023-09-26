package mascotas;

import mascotas.Duenio;
import mascotas.Mascota;

public class Gato extends Mascota {
    private static String saludo = "miau";
    public Gato (){
        super();
    }

    public Gato (String nombre, Duenio duenio){
        super(nombre, duenio);
    }

    public String saludar(){
        String saludo1 = "";
        for (int i = 0; i < getAlegria(); i++){
            saludo1 = saludo1 + saludo + " ";
        }
        setAlegria(getAlegria()-1);
        return saludo1;
    }

    public void alimentar(){
        setAlegria(getAlegria()+1);
    }

    public String tipo(){
        return getClass().getCanonicalName();
    }
}
