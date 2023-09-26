import personas.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("---EJERCICIO 1---");
        int tamano_array1, suma = 0;
        ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();
        System.out.println("Ingresar cantidad de números del array: ");
        tamano_array1 = entrada.nextInt();
        for (int i = 0; i < tamano_array1; i++){
            int numero;
            System.out.println("Ingresar numero " + (i+1) + ": ");
            numero = entrada.nextInt();
            numerosEnteros.add(numero);
        }
        for (int numero : numerosEnteros){
            suma = suma + numero;
        }
        System.out.println("Suma final: " + suma);

        System.out.println("");
        System.out.println("---EJERCICIO 2---");
        ArrayList<String> cadenas = new ArrayList<String>();
        int tamano_array2;
        char letra;
        System.out.println("Ingresar tamaño del array: ");
        tamano_array2 = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < tamano_array2; i++){
            String palabra;
            System.out.println("Ingresar palabra " + (i+1) + ": ");
            palabra = entrada.nextLine();
            cadenas.add(palabra);
        }
        System.out.println("Ingresar letra: ");
        letra = entrada.next().charAt(0);
        for (String palabra : cadenas){
            if (palabra.charAt(0) == letra){
                System.out.println(palabra);
            }
        }

        System.out.println("");
        System.out.println("---EJERCICIO 3---");
        ArrayList<Persona> personas = new ArrayList<Persona>();
        /*personas.add(new Persona.Persona(entrada.nextLine(), entrada.nextInt(), entrada.nextLine()));
        personas.add(new Persona.Persona(entrada.nextLine(), entrada.nextInt(), entrada.nextLine()));
        personas.add(new Persona.Persona(entrada.nextLine(), entrada.nextInt(), entrada.nextLine()));
        for (Persona.Persona persona : personas){
            if (persona.getEdad() > 30){
                persona.mostrar_datos();
            }
        }*/


    }
}
