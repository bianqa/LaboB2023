public class Tarjeta extends MetodoPago {
    private String numero;
    private String banco;
    private boolean credito;

    public Tarjeta (){
        super();
        numero = "1111 1111 1111 1111";
        banco = "";
        credito = true;
    }

    public Tarjeta (String numero, String banco, boolean credito){
        super();
        this.numero = numero;
        this.banco = banco;
        this.credito = credito;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }
}
