package repaso.tiendaElectronica;

import repaso.tiendaElectronica.Multimedia;

public class Televisor extends Multimedia {
    private Tecnologia tecnologia;
    private String resolucion;

    public Televisor (){
        super();
        tecnologia = Tecnologia.ULTRAHD;
        resolucion = "1280x720";
    }

    public Televisor (String nombre, double precio, int stock, Tecnologia tecnologia, String resolucion){
        super(nombre, precio, stock);
        this.tecnologia = tecnologia;
        this.resolucion = resolucion;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}
