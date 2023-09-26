package webComputadoras;

import webComputadoras.Entrada;

public class Mouse extends Entrada {
    public Mouse (){
        super();
    }

    public Mouse (String nombre, String fabricante, String modelo, double precio, int stock, String puertos_valido, String tipo_conector){
        super(nombre, fabricante, modelo, precio, stock, puertos_valido, tipo_conector);
    }
}
