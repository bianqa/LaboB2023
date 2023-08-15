public class Pez extends Mascota{
    private int vidas;

    public Pez (){
        super();
        vidas = 10;
    }

    public Pez (String nombre, Duenio duenio, int alegria){
        super(nombre, duenio, alegria);
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
        return "se resto una vida";
    }

    public void alimentar(){
        setAlegria(getAlegria()+1);
        vidas ++;
    }

    public String tipo(){
        return getClass().getCanonicalName();
    }
}
