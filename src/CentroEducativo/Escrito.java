package CentroEducativo;

import java.util.Date;

public class Escrito extends Examen{
    private static int duracion = 90;
    private Nota nota;

    public Escrito (){
        super();
        duracion = 80;
        nota = Nota.CERO;
    }

    public Escrito (Date fecha, Nota nota){
        super(fecha);
        this.nota = nota;
    }

    public static int getDuracion() {
        return duracion;
    }

    public static void setDuracion(int duracion) {
        Escrito.duracion = duracion;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public boolean aprobado() {
        return nota.getNum() < 6;
    }
}
