public class Cheque {
    private Cliente emisor;
    private Cliente destino;
    private double monto;

    public Cheque (){
        emisor = new Cliente();
        destino = new Cliente();
        monto = 2000;
    }

    public Cheque (Cliente emisor, Cliente destino, double monto){
        this.emisor = emisor;
        this.destino = destino;
        if (monto < 1){
            this.monto = 1;
        } else{
            this.monto = monto;
        }
    }

    public Cliente getEmisor() {
        return emisor;
    }

    public void setEmisor(Cliente emisor) {
        this.emisor = emisor;
    }

    public Cliente getDestino() {
        return destino;
    }

    public void setDestino(Cliente destino) {
        this.destino = destino;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
