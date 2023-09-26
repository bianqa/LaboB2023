package biblioteca;

public class LibroElectronico {
    private String titulo;
    private AutorLibro autor;
    private GeneroLibro genero;
    private String nombreArchivo;
    private int descargasDisponibles;

    public LibroElectronico (){
        titulo = "harri poter";
        autor = new AutorLibro();
        genero = GeneroLibro.CIENCIA_FICCION;
        nombreArchivo = "harri.pdf";
        descargasDisponibles = 1500;
    }

    public LibroElectronico (String titulo, AutorLibro autor, GeneroLibro genero, String nombreArchivo){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.nombreArchivo = nombreArchivo;
        descargasDisponibles = 1500;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AutorLibro getAutor() {
        return autor;
    }

    public void setAutor(AutorLibro autor) {
        this.autor = autor;
    }

    public GeneroLibro getGenero() {
        return genero;
    }

    public void setGenero(GeneroLibro genero) {
        this.genero = genero;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getDescargasDisponibles() {
        return descargasDisponibles;
    }

    public void setDescargasDisponibles(int descargasDisponibles) {
        this.descargasDisponibles = descargasDisponibles;
    }
}
