import java.util.Date;


public class Pedido {
    private Plato plato;
    private Persona persona;
    private Date fecha_hora;
    private boolean entregado;
    private int descuento;

    public Pedido (){
        plato = new Plato();
        persona = new Persona();
        fecha_hora = new Date();
        entregado = false;
        descuento = 20;
    }

    public Pedido (Plato plato, Persona persona, Date fecha_hora, boolean entregado, int descuento){
        this.plato = plato;
        this.persona = persona;
        this.fecha_hora = fecha_hora;
        this.entregado = entregado;
        if (descuento < 0){
            this.descuento = 0;
        } else{
            this.descuento = descuento;
        }
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

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
