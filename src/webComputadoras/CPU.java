package webComputadoras;

import webComputadoras.Componente;

public class CPU extends Componente {
    public CPU (){
        super();
    }

    public CPU (String nombre, String fabricante, String modelo, double precio, int stock){
        super(nombre, fabricante, modelo, precio, stock);
    }
}
