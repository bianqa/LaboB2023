public class Tecnico extends Operario{

    public Tecnico (){
        super();
    }

    public Tecnico (String nombre){
        super(nombre);
    }

    @Override
    public String toString() {
        return getClass().getSuperclass().getSuperclass().getCanonicalName() + " " + getNombre() + " -> " + getClass().getSuperclass().getCanonicalName() + " -> " + getClass().getCanonicalName();
    }
}
