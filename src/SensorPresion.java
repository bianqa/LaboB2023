public class SensorPresion extends AlarmaSensor{
    public SensorPresion (){
        super();
    }

    public SensorPresion (boolean conectado, float medida, float umbral, int anio){
        super(conectado, medida, umbral, anio);
    }

    @Override
    public void alarma() {
        System.out.println("Sensor de presión activado");
    }
}
