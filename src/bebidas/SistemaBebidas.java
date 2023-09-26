package bebidas;

import java.util.HashSet;

public class SistemaBebidas {
    private HashSet<PersonaBebida> bebedores;
    private HashSet<Bebida> bebidas;

    public SistemaBebidas (){
        bebedores = new HashSet<>();
        bebidas = new HashSet<>();
    }

    public SistemaBebidas (HashSet<PersonaBebida> bebedores, HashSet<Bebida> bebidas){
        this.bebedores = bebedores;
        this.bebidas = bebidas;
    }

    public HashSet<PersonaBebida> getBebedores() {
        return bebedores;
    }

    public void setBebedores(HashSet<PersonaBebida> bebedores) {
        this.bebedores = bebedores;
    }

    public HashSet<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(HashSet<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public void consumirBebida (PersonaBebida p, Bebida b, int cantidad){
        if (!bebedores.contains(p)){
            bebedores.add(p);
            p.consumirBebida(b, cantidad);
        } else{
            p.consumirBebida(b, cantidad);
        }
    }

    public PersonaBebida peorCoeficiente (){
        boolean primero = true;
        PersonaBebida peorPersona = new PersonaBebida();
        for (PersonaBebida p : bebedores){
            if (primero || p.coeficienteResultante() < peorPersona.coeficienteResultante()){
                primero = false;
                peorPersona = p;
            }
        }
        return peorPersona;
    }

    public PersonaBebida mejorCoeficiente (){
        boolean primero = true;
        PersonaBebida mejorPersona = new PersonaBebida();
        for (PersonaBebida p : bebedores){
            if (primero || p.coeficienteResultante() > mejorPersona.coeficienteResultante()){
                primero = false;
                mejorPersona = p;
            }
        }
        return mejorPersona;
    }
}
