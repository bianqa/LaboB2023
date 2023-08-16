public class Pajarito extends Mascota{
    public Pajarito (){
        super();
    }

    public Pajarito (String nombre, Duenio duenio){
        super(nombre, duenio);
    }

    public String saludar(){
        String saludo = "";
        for (int i = 0; i < getAlegria(); i++){
            saludo = saludo + "pio ";
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
