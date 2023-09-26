package Intercambio;

import java.util.HashSet;

public class SistemaIntercambio{
    private HashSet<Prestable> objetos;

    public SistemaIntercambio (){
        objetos = new HashSet<>();
    }

    public HashSet<Prestable> getObjetos() {
        return objetos;
    }

    public void setObjetos(HashSet<Prestable> objetos) {
        this.objetos = objetos;
    }

    public void agregarElemento (ObjetoIntercambio objetoIntercambio){
        if (objetoIntercambio.agregarElemento()){
            objetos.add(objetoIntercambio);
        }
    }
}
