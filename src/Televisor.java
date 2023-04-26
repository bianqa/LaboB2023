public class Televisor extends Multimedia{
    private String tecnologia;
    private String resolucion;

    public Televisor (){
        super();
        tecnologia = "ultraHD";
        resolucion = "1280x720";
    }

    public Televisor (String nombre, double precio, int stock, String tecnologia, String resolucion){
        super(nombre, precio, stock);
        this.tecnologia = tecnologia;
        this.resolucion = resolucion;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}
