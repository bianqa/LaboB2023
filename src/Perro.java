public class Perro extends Mascota{
    private static String saludo = "guau";
    public Perro (){
        super();
    }

    public Perro (String nombre, Duenio duenio){
        super(nombre, duenio);
    }

    public String saludar(){
        String saludo1 = "";
        for (int i = 0; i < getAlegria(); i++){
            saludo1 = saludo1 + saludo + " ";
        }
        setAlegria(getAlegria()-1);
        return saludo1;
    }

    public void alimentar(){
        setAlegria(getAlegria()+1);
    }

    public String tipo(){
        return getClass().getCanonicalName();
    }
}
