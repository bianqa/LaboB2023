public class Libro {
    private String titulo;
    private Persona autor;
    private String ISBN;
    private int cant_pags;
    private Editorial editorial;
    private Fecha fecha_publicacion;

    public Libro (){
        titulo = "a";
        autor = new Persona();
        ISBN = "111-111-111-111";
        cant_pags = 100;
        editorial = Editorial.INTERZONA;
        fecha_publicacion = new Fecha();
    }

    public Libro (String titulo, Persona autor, String ISBN, int cant_pags, Editorial editorial, Fecha fecha_publicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cant_pags = cant_pags;
        this.editorial = editorial;
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCant_pags() {
        return cant_pags;
    }

    public void setCant_pags(int cant_pags) {
        this.cant_pags = cant_pags;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Fecha getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Fecha fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public void mostrar_info(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: ");
        autor.mostrar_datos();
        System.out.println("ISBN: " + ISBN);
        System.out.println("Número de páginas: " + cant_pags);
        System.out.println("Editorial: " + editorial.name());
        System.out.println("Fecha publicación: " + fecha_publicacion.getDia() + "/" + fecha_publicacion.getMes() + "/" + fecha_publicacion.getAnio());
    }

    public void comparar_fecha(Libro libro2){
        if (fecha_publicacion.menor_que(libro2.fecha_publicacion)){
            System.out.println("El libro " + titulo + " se publicó antes que " + libro2.getTitulo() + ".");
        } else{
            System.out.println("El libro " + libro2.getTitulo() + " se publicó antes que " + titulo + ".");
        }
    }
}
