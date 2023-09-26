package webComputadoras;

import repaso.banco.Cliente;
import webComputadoras.CPU;
import webComputadoras.Componente;

import java.util.ArrayList;

public class Compra {
    private Cliente cliente;
    private ArrayList<Componente> componentes;
    private MetodoPago metodo;
    private double precio_final;

    public Compra (){
        cliente = new Cliente();
        componentes = new ArrayList<Componente>();
        metodo = new MetodoPago();
        precio_final = 0;
    }

    public Compra (Cliente cliente, ArrayList<Componente> componentes, MetodoPago metodo){
        this.cliente = cliente;
        this.componentes = componentes;
        this.metodo = metodo;
        if (metodo instanceof Tarjeta){
            precio_final = ((calcular_precio() / 100 * 5) + calcular_precio());
        } else if (metodo instanceof Efectivo){
            precio_final = calcular_precio();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public MetodoPago getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoPago metodo) {
        this.metodo = metodo;
    }

    public double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(double precio_final) {
        this.precio_final = precio_final;
    }

    public double calcular_precio (){
        double precio = 0;
        for (Componente componente : componentes){
            precio += componente.getPrecio();
        }
        return precio;
    }

    public boolean verificar_componentes (){
        int cont_cpu = 0, cont_entrada = 0, cont_salida = 0;
        for (Componente componente : componentes){
            if (componente instanceof CPU){
                cont_cpu ++;
            } else if (componente instanceof Entrada){
                cont_entrada ++;
            } else if (componente instanceof Salida){
                cont_salida ++;
            }
        }
        return cont_cpu > 0 && cont_entrada > 0 && cont_salida > 0;
    }

    public int cant_entrada (){
        int cont = 0;
        for (Componente componente : componentes){
            if (componente instanceof Entrada){
                cont ++;
            }
        }
        return cont;
    }

    public int cant_salida (){
        int cont = 0;
        for (Componente componente : componentes){
            if (componente instanceof Salida){
                cont ++;
            }
        }
        return cont;
    }

    public boolean verificar_stock (){
        boolean verificado = false;
        ArrayList<Componente> componentes1 = componentes;
        for (Componente componente : componentes1){
            if (componente.getStock() - 1 > -1){
                componente.setStock(componente.getStock() - 1);
                verificado = true;
            } else{
                return false;
            }
        }
        return verificado;
    }
}
