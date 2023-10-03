package organizacionPoliticos;

public class TelefonoMovil extends Dispositivo implements Mensajero{
    private CompaniaTelefonica compania;
    private int numero;
    private boolean prendido;
    private Double credito;

    public TelefonoMovil (){
        super();
        compania = CompaniaTelefonica.CLARO;
        numero = 234566787;
        prendido = false;
        credito = 100.0;
    }

    public TelefonoMovil (int numeroSerie, String fabricante, String modelo, CompaniaTelefonica compania, int numero, boolean prendido, Double credito){
        super(numeroSerie, fabricante, modelo);
        this.compania = compania;
        this.numero = numero;
        this.prendido = prendido;
        if (credito < 0){
            credito = credito * (-1);
        }
        this.credito = credito;
    }

    public CompaniaTelefonica getCompania() {
        return compania;
    }

    public void setCompania(CompaniaTelefonica compania) {
        this.compania = compania;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    @Override
    public void hacerCampania(String nombre) {
        if (prendido && credito >= 1.0){
            System.out.println("Conectando con la antena más cercana... Vote por el partido " + nombre + "para un mejor futuro");
            credito = credito - 1.0;
        } else{
            System.out.println("Celular apagado o sin crédito.");
        }
    }

    public void cargarCredito (Double cantidad){
        credito = credito + cantidad;
    }
}
