package CentroEducativo;

import java.util.Date;

public abstract class Examen implements Aprobable{
    private Date fecha;

    public Examen (){
        fecha = new Date();
    }

    public Examen (Date fecha){
        this.fecha = new Date();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public boolean aprobado() {
        return false;
    }
}
