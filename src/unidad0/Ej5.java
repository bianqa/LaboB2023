package unidad0;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        String frase="Ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        String letra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar letra que reemplazará la 'e': ");
        letra = entrada.nextLine();
        frase = frase.replaceAll("e", letra);
        frase = frase.replaceAll("é", letra);
        frase = frase.replaceAll("E", letra);
        System.out.println(frase);
    }
}
