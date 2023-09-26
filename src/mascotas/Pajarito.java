package mascotas;

import mascotas.Duenio;
import mascotas.Mascota;

public class Pajarito extends Mascota {
    private static String saludo = "pio";
    public Pajarito (){
        super();
    }

    public Pajarito (String nombre, Duenio duenio){
        super(nombre, duenio);
    }

    public String saludar(){
        String saludo1 = "";
        for (int i = 0; i < getAlegria(); i++){
            saludo1 = saludo1 + this.saludo + " " ;
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
