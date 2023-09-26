package CentroEducativo;

import java.util.Date;

public class Oral extends Examen{
    private Satisfaccion satisfaccion;

    public Oral (){
        super();
        satisfaccion = Satisfaccion.INSUFICIENTE;
    }

    public Oral (Date fecha, Satisfaccion satisfaccion){
        super(fecha);
        this.satisfaccion = satisfaccion;
    }

    public Satisfaccion getSatisfaccion() {
        return satisfaccion;
    }

    public void setSatisfaccion(Satisfaccion satisfaccion) {
        this.satisfaccion = satisfaccion;
    }

    public boolean aprobado() {
        return !satisfaccion.equals(Satisfaccion.INSUFICIENTE);
    }
}
