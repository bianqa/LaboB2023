package Intercambio;

public class EstadoRopa {
    private boolean mancha;
    private boolean rotura;

    public EstadoRopa (){
        mancha = false;
        rotura = false;
    }

    public EstadoRopa (boolean mancha, boolean rotura){
        this.mancha = mancha;
        this.rotura = rotura;
    }

    public boolean isMancha() {
        return mancha;
    }

    public void setMancha(boolean mancha) {
        this.mancha = mancha;
    }

    public boolean isRotura() {
        return rotura;
    }

    public void setRotura(boolean rotura) {
        this.rotura = rotura;
    }
}
