public class Perro extends Mascota{
    public Perro (){
        super();
    }

    public Perro (String nombre, Duenio duenio){
        super(nombre, duenio);
    }

    public String saludar(){
        String saludo = null;
        for (int i = 0; i < getAlegria(); i++){
            saludo = saludo + "guau ";
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
