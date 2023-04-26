import java.util.ArrayList;

public class Corriente extends CuentaBancaria{
    private ArrayList<Cheque> cheques;

    public Corriente (){
        cheques = new ArrayList<Cheque>();
    }

    public Corriente (ArrayList<Cheque> cheques){
        this.cheques = cheques;
    }

    public ArrayList<Cheque> getCheques() {
        return cheques;
    }

    public void setCheques(ArrayList<Cheque> cheques) {
        this.cheques = cheques;
    }
}
