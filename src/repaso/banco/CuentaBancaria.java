package repaso.banco;

import repaso.banco.Cliente;

public class CuentaBancaria {
    private Cliente titular;
    private int cbu;
    private int num_cuenta;
    private String alias;
    private double saldo;

    public CuentaBancaria (){
        titular = new Cliente();
        cbu = 1;
        num_cuenta = 1;
        alias = "a";
        saldo = 0;
    }

    public CuentaBancaria (Cliente titular, int cbu, int num_cuenta, String alias, double saldo){
        this.titular = titular;
        this.cbu = cbu;
        this.num_cuenta = num_cuenta;
        this.alias = alias;
        if (saldo < 0){
            this.saldo = 0;
        } else{
            this.saldo = saldo;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
