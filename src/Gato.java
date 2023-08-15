public class Gato extends Mascota{
    public Gato (){
        super();
    }

    public Gato (String nombre, Duenio duenio){
        super(nombre, duenio);
    }

    public String saludar(){
        String saludo = null;
        for (int i = 0; i < getAlegria(); i++){
            saludo = saludo + "miau ";
        }
        setAlegria(getAlegria()-1);
        return saludo;
    }

    public void alimentar(){
        setAlegria(getAlegria()+1);
    }

    public String tipo(){
        return getClass().getCanonicalName();
    }
}
