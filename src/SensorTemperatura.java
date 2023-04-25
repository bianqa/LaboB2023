public class SensorTemperatura extends AlarmaSensor{
    public SensorTemperatura (){
        super();
    }

    public SensorTemperatura (boolean conectado, float medida, float umbral, int anio){
        super(conectado, medida, umbral, anio);
    }

    @Override
    public void alarma() {
        System.out.println("¡Cuidado! La temperatura sube");
    }
}
