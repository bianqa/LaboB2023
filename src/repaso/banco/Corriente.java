package repaso.banco;

import repaso.banco.Cliente;
import repaso.banco.CuentaBancaria;

import java.util.ArrayList;

public class Corriente extends CuentaBancaria {
    private ArrayList<Cheque> cheques;

    public Corriente (){
        super();
        cheques = new ArrayList<Cheque>();
    }

    public Corriente (Cliente titular, int cbu, int num_cuenta, String alias, double saldo, ArrayList<Cheque> cheques){
        super(titular, cbu, num_cuenta, alias, saldo);
        this.cheques = cheques;
    }

    public ArrayList<Cheque> getCheques() {
        return cheques;
    }

    public void setCheques(ArrayList<Cheque> cheques) {
        this.cheques = cheques;
    }
}
