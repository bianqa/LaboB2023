public class Cafetera {
    private int cant_max;
    private int cant_act;

    public Cafetera (){
        cant_max = 1000;
        cant_act = 0;
    }

    public Cafetera(int cant_max){
        this.cant_max = cant_max;
        cant_act = cant_max;
    }

    public Cafetera (int cant_max, int cant_act){
        this.cant_max = 1000;
        if (cant_act > cant_max) {
            this.cant_act = cant_max;
        } else{
            this.cant_act = 0;
            this.cant_max = 0;
        }
    }

    public int getCant_max() {
        return cant_max;
    }

    public void setCant_max(int cant_max) {
        this.cant_max = cant_max;
    }

    public int getCant_act() {
        return cant_act;
    }

    public void setCant_act(int cant_act) {
        this.cant_act = cant_act;
    }

    public void llenar_cafetera(){
        cant_act = cant_max;
        System.out.println("Cafetera llena.");
    }

    public void servir_taza (int capacidad){
        if (cant_act >= capacidad){
            cant_act = cant_act - capacidad;
            System.out.println("Se han servido " + capacidad + "c.c a la taza.");
        } else {
            System.out.println("Se han servido " + cant_act + "c.c a la taza.");
            cant_act = 0;
        }
    }

    public void vaciar_cafetera (){
        cant_act = 0;
        System.out.println("Cafetera vaciada.");
    }

    public void agregar_cafe (int cantidad){
        if ((cantidad + cant_act) <= cant_max){
            cant_act = cantidad;
            System.out.println("Se han agregado " + cantidad + "c.c a la cafetera.");
        } else{
            cant_act = cant_max;
            System.out.println("Se han agregado " + (cantidad - cant_act) + "c.c a la cafetera.");
        }
    }
}
