public enum Color {
    BLANCO("ffffff"), NEGRO("000000"), GRIS("999999"), ROJO("ff0000"), AZUL("0013ff"), AMARILLO("ffec00"), VERDE("25ff00"), NARANJA("ff8700"), MARRON("794000"), ROSA("ff00bf"), VIOLETA("9600ff");

    private String hex;

    private Color (String hex){
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}
