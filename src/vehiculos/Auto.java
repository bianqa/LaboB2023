package vehiculos;

public class Auto extends Vehiculo {
    private String patente;
    private boolean descapotable;

    public Auto (){
        patente = "AAA 111";
        descapotable = false;
    }

    public Auto (String patente, boolean descapotable){
        this.patente = patente;
        this.descapotable = descapotable;
    }
}
