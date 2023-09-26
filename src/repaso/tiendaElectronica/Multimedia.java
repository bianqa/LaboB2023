package repaso.tiendaElectronica;

import repaso.tiendaElectronica.Producto;

abstract class Multimedia extends Producto {
    public Multimedia (){
        super();
    }

    public Multimedia (String nombre, double precio, int stock){
        super(nombre, precio, stock);
    }
}
