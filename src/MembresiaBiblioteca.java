public enum MembresiaBiblioteca {
    BRONCE(5), PLATA(15), ORO(50);

    private int maximoLibros;

    private MembresiaBiblioteca (int maximoLibros){
        this.maximoLibros = maximoLibros;
    }

    public int getMaximoLibros() {
        return maximoLibros;
    }

    public void setMaximoLibros(int maximoLibros) {
        this.maximoLibros = maximoLibros;
    }
}
