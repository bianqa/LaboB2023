package mascotas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SistemaMascotas {
    private HashSet<Mascota> mascotas;

    public SistemaMascotas (){
        mascotas = new HashSet<Mascota>();
    }
    public SistemaMascotas (HashSet<Mascota> mascotas){
        this.mascotas = mascotas;
    }

    public HashSet<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void agregarMascota (String nombre, Duenio duenio, TipoMascota tipoMascota){
        if (tipoMascota.equals(TipoMascota.PERRO)){
            mascotas.add((Mascota) new Perro(nombre, duenio));
        } else if (tipoMascota.equals(TipoMascota.GATO)){
            mascotas.add((Mascota) new Gato(nombre, duenio));
        } else if (tipoMascota.equals(TipoMascota.PAJARITO)){
            mascotas.add((Mascota) new Pajarito(nombre, duenio));
        } else if (tipoMascota.equals(TipoMascota.CANTOR)){
            String canto;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese canto");
            canto = entrada.nextLine();
            mascotas.add((Mascota) new Cantor(nombre, duenio, canto));
        } else if (tipoMascota.equals(TipoMascota.PEZ)){
            mascotas.add((Mascota) new Pez(nombre, duenio));
        }
    }

    public void eliminarMascota(Mascota mascota){
        mascotas.remove(mascota);
    }

    public void modificarMascota (Mascota vieja, Mascota nueva){
        mascotas.remove(vieja);
        mascotas.add(nueva);
    }

    public void duenioSaludar (String nombre, Mascota mascota){
        if (mascota.getDuenio().getNombre().equals(nombre)){
            System.out.println(mascota.saludar());
        } else{
            if (mascota instanceof Pez){
                System.out.println(mascota.saludar());
                if (((Pez) mascota).getVidas() <= 0){
                    mascotas.remove(mascota);
                    System.out.println("MURIO " + mascota.getNombre() + "..............");
                }
            } else if (mascota instanceof Pajarito){
                System.out.println("...");
            } else{
                System.out.println(mascota.saludar().toUpperCase());
            }
        }
    }

    public static void main(String[] args) {
        Duenio a = new Duenio();
        SistemaMascotas e = new SistemaMascotas();
        e.agregarMascota("firulais", a, TipoMascota.PERRO);
        e.agregarMascota("fifi", a, TipoMascota.PEZ);
        e.agregarMascota("lulu", a, TipoMascota.PAJARITO);
        e.agregarMascota("juan", a, TipoMascota.CANTOR);
        e.agregarMascota("si", a, TipoMascota.GATO);
        ArrayList<Mascota> m = new ArrayList<Mascota>();
        for (Mascota ma : e.getMascotas()){
            e.duenioSaludar("juancito", ma);
            if (ma instanceof Pez){
                ((Pez)ma).alimentar();
            }
        }
        for (Mascota ma : e.getMascotas()){
            e.duenioSaludar("a", ma);
            if (ma instanceof Pez){
                for (int i = 0 ; i < 9 ; i++){
                    e.duenioSaludar("a", ma);
                }
            }
        }
    }
}
