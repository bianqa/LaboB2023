package unidad0;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        System.out.println("Introduzca un día de la semana: ");
        System.out.println("1. Domingo");
        System.out.println("2. Lunes");
        System.out.println("3. Martes");
        System.out.println("4. Miércoles");
        System.out.println("5. Jueves");
        System.out.println("6. Viernes");
        System.out.println("7. Sábado");
        dia = entrada.nextInt();
        while (dia < 1 || dia > 7){
            System.out.println("");
        }
        if (dia == 1 || dia == 7){
            System.out.println("Día no laboral.");
        } else{
            System.out.println("Día laboral");
        }

    }
}
