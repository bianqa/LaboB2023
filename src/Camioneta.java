public class Camioneta extends Vehiculo{
    private String patente;
    private int capacidadmax_kg;
    private int carga_actual;

    public Camioneta (){
        super();
        patente = "AAA 111";
        capacidadmax_kg = 1000;
        carga_actual = 0;
    }

    public Camioneta (String patente, int capacidadmax_kg, int carga_actual){
        this.patente = patente;
        this.capacidadmax_kg = capacidadmax_kg;
        if (carga_actual > capacidadmax_kg || carga_actual < 0){
            this.carga_actual = capacidadmax_kg;
        } else{
            this.carga_actual = carga_actual;
        }
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidadmax_kg() {
        return capacidadmax_kg;
    }

    public void setCapacidadmax_kg(int capacidadmax_kg) {
        this.capacidadmax_kg = capacidadmax_kg;
    }

    public int getCarga_actual() {
        return carga_actual;
    }

    public void setCarga_actual(int carga_actual) {
        this.carga_actual = carga_actual;
    }

    public void agregar_carga (int carga){
        if ((carga + carga_actual) > capacidadmax_kg){
            System.out.println("Excede capacidad maxima. Cantidad actual: " + capacidadmax_kg);
            carga_actual = capacidadmax_kg;
        } else{
            carga_actual = carga_actual + carga;
        }
    }
}
