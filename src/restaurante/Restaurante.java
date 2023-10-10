package restaurante;

import java.util.HashSet;

public class Restaurante implements ContratarAgregar{
    private String nombre;
    private HashSet<Chef> chefs;
    private HashSet<Plato> menu;

    public Restaurante (){
        nombre = "cacona";
        chefs = new HashSet<>();
        menu = new HashSet<>();
    }

    public Restaurante (String nombre, HashSet<Chef> chefs, HashSet<Plato> platos){
        this.nombre = nombre;
        this.chefs = chefs;
        this.menu = platos;
    }

    public HashSet<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(HashSet<Chef> chefs) {
        this.chefs = chefs;
    }

    public HashSet<Plato> getMenu() {
        return menu;
    }

    public void setMenu(HashSet<Plato> menu) {
        this.menu = menu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void contratar(Chef c) {
        try{
            if (c.isExperiencia() && c.getEdad() >= 18){
                System.out.println("El chef " + c.getNombre() + " se unió al equipo de " + nombre + ".");
                chefs.add(c);
            } else{
                throw new CriteriosChefException("No se puede contratrar al chef porque no cumple con los requisitos.");
            }
        } catch (CriteriosChefException ex){
            ex.getMessage();
        }
    }

    @Override
    public void agregar(Plato p) {
        boolean menu = false;
        boolean chef = false;
        try{
            if (!this.menu.contains(p)){
                menu = true;
            } else{
                throw new CriteriosPlatoException("No se puede agregar un plato que ya se encuentra en el menú.");
            }

            if (chefs.contains(p.getChef())){
                chef = true;
            } else{
                throw new CriteriosPlatoException("No se puede agregar el plato porque el chef a cargo no esta contratado en el restaurante.");
            }

            if (menu && chef){
                this.menu.add(p);
            }
        } catch (CriteriosPlatoException ex){
            ex.getMessage();
        }
    }
}
