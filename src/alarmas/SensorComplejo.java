package alarmas;

import alarmas.AlarmaSensor;

import java.util.ArrayList;

public class SensorComplejo {
    private ArrayList<AlarmaSensor> sensores;
    private float umbral;

    public SensorComplejo (){
        sensores = new ArrayList<AlarmaSensor>();
        umbral = 10;
    }

    public SensorComplejo (ArrayList<AlarmaSensor> sensores, float umbral){
        this.sensores = sensores;
        this.umbral = umbral;
    }

    public ArrayList<AlarmaSensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<AlarmaSensor> sensores) {
        this.sensores = sensores;
    }

    public float getUmbral() {
        return umbral;
    }

    public void setUmbral(float umbral) {
        this.umbral = umbral;
    }

    public float calcular_promedio (){
        float promedio = 0;
        int cont = 0;
        for (AlarmaSensor sensores1 : sensores){
            promedio += sensores1.getMedida();
            cont ++;
        }
        return promedio / cont;
    }

    public void activar_sensor (){
        if (calcular_promedio() > umbral){
            alarma();
        }
    }

    public void alarma (){
        System.out.println("Los valores medios superaron el umbral");
    }

    public void obtenerInfo (int num) throws ArrayIndexOutOfBoundsException{
        ArrayList<AlarmaSensor> alarmas = sensores;
        System.out.println(alarmas.get(num).getAnio());
        System.out.println(alarmas.get(num).getUmbral());
        System.out.println(alarmas.get(num).getMedida());
    }

    public static void main(String[] args) {
        
    }
}
