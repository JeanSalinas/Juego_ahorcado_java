import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*arreglos: Estructuras de datos que tienen valores del mismo tipo bajo un mismo nombre
        * Estos valores se distribuyen secuencialmente en la memoria y se puede acceder a ellos mediante un índice
        * Los arreglos son tambien llamados vectores o matrices
        */
        int []numeros = {10,20,30,40,50};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("For each");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}