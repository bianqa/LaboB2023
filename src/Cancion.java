public class Cancion {
    private String titulo;
    private Autor autor;

    public Cancion (String titulo, Autor autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion (){
        titulo = "";
        autor = new Autor();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
