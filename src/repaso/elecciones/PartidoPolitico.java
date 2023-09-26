package repaso.elecciones;

import org.omg.CORBA.NO_IMPLEMENT;

public class PartidoPolitico {
    private NombrePartidos nombre;
    private Candidato representante;

    public PartidoPolitico (){
        nombre = NombrePartidos.POLI_AVANZA;
        representante = new Candidato();
    }

    public PartidoPolitico (NombrePartidos nombre, Candidato representante){
        this.nombre = nombre;
        this.representante = representante;
    }

    public NombrePartidos getNombre() {
        return nombre;
    }

    public void setNombre(NombrePartidos nombre) {
        this.nombre = nombre;
    }

    public Candidato getRepresentante() {
        return representante;
    }

    public void setRepresentante(Candidato representante) {
        this.representante = representante;
    }
}
