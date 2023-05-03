public class Ahorro extends CuentaBancaria{
    public Ahorro (){
        super();
    }

    public Ahorro (Cliente titular, int cbu, int num_cuenta, String alias, double saldo){
        super(titular, cbu, num_cuenta, alias, saldo);
    }

}
