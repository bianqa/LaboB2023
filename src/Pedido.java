import java.util.Date;
public class Pedido {
    private Plato plato;
    private Persona persona;
    private Date fecha_hora;
    private boolean entregado;

    public Pedido (){
        plato = new Plato();
        persona = new Persona();
        fecha_hora = new Date((2023-1900),(4-1), 19, 1, 1 , 0);
        entregado = false;
    }

    public Pedido (Plato plato, Persona persona, Date fecha_hora, boolean entregado){
        this.plato = plato;
        this.persona = persona;
        this.fecha_hora = fecha_hora;
        this.entregado = entregado;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}
