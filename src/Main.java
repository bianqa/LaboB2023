public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona ("Juan", 30, "");
        Fecha fecha = new Fecha (30, 3, 2010);
        Persona persona2 = new Persona ("Roberto", 27, "");
        Fecha fecha2 = new Fecha (31, 3, 2010);
        Libro libro = new Libro ("Harry Potter","7 2452 2424", 336, "");
        libro.setAutor(persona);
        libro.setFecha_publicacion(fecha);
        Libro libro2 = new Libro ("nose", "8 4524 7676", 200, "");
        libro2.setAutor(persona2);
        libro2.setFecha_publicacion(fecha2);
        libro.mostrar_info();
        libro2.mostrar_info();
        libro.comparar_fecha(libro2);

        Cafetera cafetera = new Cafetera ();
        cafetera.llenar_cafetera();
        System.out.println(cafetera.getCant_act());
        cafetera.vaciar_cafetera();
        System.out.println(cafetera.getCant_act());
        cafetera.agregar_cafe(500);
        cafetera.servir_taza(400);
        System.out.println(cafetera.getCant_act());

        Cancion cancion = new Cancion ();
        System.out.println("Nombre: ");
        System.out.println("Autor: ");
    }
}