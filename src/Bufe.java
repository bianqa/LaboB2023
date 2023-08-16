import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Bufe {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Plato> platos;

    public Bufe (){
        pedidos = new ArrayList<Pedido>();
        platos = new ArrayList<Plato>();
    }

    public Bufe (ArrayList<Pedido> pedidos, ArrayList<Plato> platos){
        this.pedidos = pedidos;
        this.platos = platos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public void agregar_pedido (Pedido pedido){
        pedidos.add(pedido);
    }

    public void eliminar_pedido (Pedido pedido){
        for (Pedido pedido1 : pedidos){
            if (pedido1 == pedido){
                pedidos.remove(pedido1);
            }
        }
    }

    public void modificar_pedido (Pedido pedido_viejo, Pedido pedido_nuevo){
        for (int i = 0; i < pedidos.size(); i ++) {
            if (pedidos.get(i) == pedido_viejo) {
                pedidos.set(i, pedido_nuevo);
            }
        }
    }

    public void agregar_plato (Plato plato){
        platos.add(plato);
    }

    public void eliminar_plato (Plato plato){
        for (Plato plato1 : platos){
            if (plato1 == plato){
                platos.remove(plato1);
            }
        }
    }

    public void modificar_plato (Plato plato_viejo, Plato plato_nuevo){
        for (int i = 0; i < platos.size(); i ++) {
            if (platos.get(i) == plato_viejo) {
                platos.set(i, plato_nuevo);
            }
        }
    }

    public void mostrar_platos (){
        Date hoy = new Date();
        hoy = Calendar.getInstance().getTime();
        SimpleDateFormat fecha = new SimpleDateFormat("ddMMyyyy");
        String fecha_hoy = fecha.format(hoy);
        for (Pedido pedido : pedidos){
            String fecha_pedido = fecha.format(pedido.getFecha_hora());
            System.out.println(fecha_pedido);
            if (fecha_hoy.equals(fecha_pedido)){
                System.out.println("Nombre plato: " + pedido.getPlato().getNombre());
                SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
                String hora_pedido = hora.format(pedido.getFecha_hora());
                System.out.println("Hora : " + hora_pedido);
                if (pedido.getPersona() instanceof Profesor){
                    double descuento = ((Profesor)pedido.getPersona()).getDescuento();
                    System.out.println("Precio original: " + pedido.getPlato().getPrecio());
                    System.out.println("Precio con descuento: " + (pedido.getPlato().getPrecio() - (pedido.getPlato().getPrecio() / 100 * descuento)));
                }
            }
        }
    }

    public static void main(String[] args) {
        Bufe bufe = new Bufe();
        Date date = new Date(2023-1900,(4-1),25,1,1,1);
        Profesor profesor = new Profesor();
        ClienteBufe persona = profesor;
        System.out.println(date);
        Pedido pedido = new Pedido(new Plato(), persona, date, false);
        bufe.agregar_pedido(pedido);
        bufe.mostrar_platos();
    }
}
