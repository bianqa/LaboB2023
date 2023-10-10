package restaurante;

public class Plato {
    private String nombre;
    private String desc;
    private Double precio;
    private TipoPlato tipo;
    private Chef chef;

    public Plato (){
        nombre = "a";
        desc = "caca";
        precio = 10.0;
        tipo = TipoPlato.ENTRADA;
        chef = new Chef();
    }

    public Plato (String nombre, String desc, Double precio, TipoPlato tipo, Chef chef){
        this.nombre = nombre;
        this.desc = desc;
        this.precio = precio;
        this.tipo = tipo;
        this.chef = chef;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public TipoPlato getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlato tipo) {
        this.tipo = tipo;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }
}
