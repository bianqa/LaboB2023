public class Cantor extends Pajarito{

    private String canto;

    public Cantor (){
        super();
        canto = "PIOOOOOO";
    }

    public Cantor (String nombre, Duenio duenio, String canto){
        super(nombre, duenio);
        this.canto = canto;
    }

    public String saludar(){
        String saludo = null;
        for (int i = 0; i < getAlegria(); i++){
            saludo = saludo + canto + " ";
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
