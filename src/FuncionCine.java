import java.util.Date;

public class FuncionCine {
    private Pelicula pelicula;
    private Date fechaHora;
    private SalaCine sala;
    private int cantExpectadores;

    public FuncionCine (){
        pelicula = new Pelicula();
        fechaHora = new Date();
        sala = new SalaCine();
        cantExpectadores = 45;
    }

    public FuncionCine (Pelicula pelicula, Date fechaHora, SalaCine sala, int cantExpectadores){
        this.pelicula = pelicula;
        this.fechaHora = fechaHora;
        this.sala = sala;
        if (cantExpectadores > sala.getMaxEspectadores()){
            this.cantExpectadores = sala.getMaxEspectadores();
        } else{
            this.cantExpectadores = cantExpectadores;
        }
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public SalaCine getSala() {
        return sala;
    }

    public void setSala(SalaCine sala) {
        this.sala = sala;
    }

    public int getCantExpectadores() {
        return cantExpectadores;
    }

    public void setCantExpectadores(int cantExpectadores) {
        this.cantExpectadores = cantExpectadores;
    }
}
