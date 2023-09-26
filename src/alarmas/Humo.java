package alarmas;

public class Humo extends AlarmaSensor {
    public Humo (){
        super();
    }

    public Humo (boolean conectado, float medida, float umbral, int anio){
        super(conectado, medida, umbral, anio);
    }

    @Override
    public void alarma() {
        System.out.println("llamando bomberos");
    }
}
