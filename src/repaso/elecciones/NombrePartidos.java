package repaso.elecciones;

public enum NombrePartidos {
    POLI_AVANZA("EL Poli Avanza"), JUNTOS_POLI("Juntos Por el Poli"), UNION_DOCENCIA("Unión Por la Docencia"), FRENTE_CONSTITUYENTES("Frente de Constituyentes");

    private String nombre;

    private NombrePartidos (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
