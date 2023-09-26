package mascotas;

import mascotas.Duenio;
import mascotas.Mascota;

public class Pez extends Mascota {
    private int vidas;

    public Pez (){
        super();
        vidas = 10;
    }

    public Pez (String nombre, Duenio duenio){
        super(nombre, duenio);
        vidas = 10;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public String saludar(){
        vidas --;
        return "se resto una vida glu glu";
    }

    public void alimentar(){
        setAlegria(getAlegria()+1);
        vidas ++;
        System.out.println("+1 vida glu glu");
    }

    public String tipo(){
        return getClass().getCanonicalName();
    }
}
