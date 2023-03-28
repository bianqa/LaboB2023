public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion (String titulo, Persona autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion (){
        titulo = "";
        autor = new Persona("", 0, "");
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
}
