package Intercambio;

import java.util.HashSet;

public class SistemaIntercambio{
    private HashSet<ObjetoIntercambio> objetos;

    public SistemaIntercambio (){
        objetos = new HashSet<>();
    }

    public HashSet<ObjetoIntercambio> getObjetos() {
        return objetos;
    }

    public void setObjetos(HashSet<ObjetoIntercambio> objetos) {
        this.objetos = objetos;
    }

    public void agregarElemento (ObjetoIntercambio objetoIntercambio){
        if (objetoIntercambio.agregarElemento()){
            objetos.add(objetoIntercambio);
        }
    }
}
