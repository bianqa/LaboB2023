package repaso.cine;

public class SalaCine {
    private int numero;
    private static int maxEspectadores = 45;

    public SalaCine (){
        numero = 1;
    }

    public SalaCine (int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getMaxEspectadores() {
        return maxEspectadores;
    }

    public static void setMaxEspectadores(int maxEspectadores) {
        SalaCine.maxEspectadores = maxEspectadores;
    }
}
