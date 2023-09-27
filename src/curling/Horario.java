package curling;

public enum Horario{
    MANANA(1, 11), TARDE(12, 19), NOCHE(20, 24);

    private int hora1;
    private int hora2;

    private Horario (int hora1, int hora2){
        this.hora1 = hora1;
        this.hora2 = hora2;
    }

    public int getHora1() {
        return hora1;
    }

    public void setHora1(int hora1) {
        this.hora1 = hora1;
    }

    public int getHora2() {
        return hora2;
    }

    public void setHora2(int hora2) {
        this.hora2 = hora2;
    }
}
