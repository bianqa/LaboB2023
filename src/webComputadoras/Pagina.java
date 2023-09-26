package webComputadoras;

import java.util.ArrayList;

public class Pagina {
    private ArrayList<Compra> compras;
    private ArrayList<Componente> componentes;

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public void realizar_compra (Compra compra){
        if (compra.verificar_componentes() && compra.verificar_stock()){
            for (Componente componente : componentes){
                componente.setStock(componente.getStock() - 1);
            }
            compras.add(compra);
        }
    }

    public void mostrar_componentes (Compra compra){
        System.out.println("Dispositivos entrada: " + compra.cant_entrada());
        System.out.println("Dispositivos salida: " + compra.cant_salida());
    }

    public void agregar_componente (Componente componente){
        componentes.add(componente);
    }

    public void eliminar_componente (Componente componente){
        componentes.remove(componente);
    }

    public void modificar_componente (Componente componente_viejo, Componente componente_nuevo){
        for (int i = 0; i < componentes.size(); i ++){
            if (componentes.get(i) == componente_viejo){
                componentes.set(i, componente_nuevo);
            }
        }
    }

}
